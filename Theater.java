public class Theater {
    private int[][] seats = new int[10][8];
    private Film film;

    public Theater(Film film){
        this.film = film;
    }
    public boolean buyTickets(int numOfTickets){
        int found;
        for(int row = 0; row < seats.length; row++){
            found = 0;
            for(int seat = 0; seat < seats[row].length; seat++){
                if(seats[row][seat] == 0){
                    found++;
                    if(found == numOfTickets){
                        for(int i = numOfTickets; i > 0; i--){
                            seats[row][seat--] = 1;
                        }
                        return true;
                    }
                }
            }
        }
        System.err.println("No available seats!");
        return false;
    }

    public Film getFilm(){
        return film;
    }

    private int[] getSeats(){
        int[] status = {0,0};
        for(int row = 0; row < seats.length; row++){
            for(int seat = 0; seat < seats[row].length; seat++){
                if(seats[row][seat] == 0){
                    status[0]++;
                } else {
                    status[1]++;
                }
            }
        }
        return status;
    }


    public void printTheater(){
        char free = '○';
        char taken = '◉';
        System.out.println("┌─────────────────────────────────┐");
        for(int row = 0; row < seats.length; row++){
            System.out.printf("│%3d│",(row+1));
            for(int seat = 0; seat < seats[row].length; seat++){
                if(seats[row][seat] == 0){
                    System.out.printf("%3c", free);
                } else {
                    System.out.printf("%3c", taken);
                }
            }
            System.out.println("  │");
        }
        System.out.println("└─────────────────────────────────┘");
    }

    public String toString(){
        int seats[] = getSeats();
        return "Movie: "+film.getName()+"\nTotal free seats: "+seats[0]+"\nTotal taken seats: "+seats[1];
    }

}
