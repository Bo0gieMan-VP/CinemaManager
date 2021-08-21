public class Cinema {
    private Theater[] theaters = new Theater[6];
    private Film[] films = new Film[100];
    private int noOfFilms = 0;

    public void addFilm(String name, int length){
        if(noOfFilms < films.length) {
            films[noOfFilms++] = new Film(name, length);
        }
    }
    public void screenFilm(String name, int theater){
        if(theater-1 >= 0 && theater-1 <= 5) {
            Film film = null;
            for (int i = 0; i < noOfFilms; i++) {
                if (films[i].getName().equals(name)) {
                    film = films[i];
                    break;
                }
            }
            if(film == null){
                System.err.println("No such film as "+name);
                return;
            }
            theaters[theater-1] = new Theater(film);
        } else {
            System.err.println("No such theater!");
        }
        return;
    }

    private Theater getTheater(String name){
        for(int i = 0; i < theaters.length; i++){
            if(theaters[i] != null) {
                if (theaters[i].getFilm().getName().equals(name)) {
                    return theaters[i];
                }
            }
        }
        return null;
    }

    public boolean buyTickets(String name, int tickets){
        Theater theater = getTheater(name);
        if(theater != null){
            return theater.buyTickets(tickets);
        } else {
            System.err.println("No such movie!");
            return false;
        }
    }

    public Theater getTheater(int theater){
        return theaters[theater-1];
    }

    public void printTheaters(){
        for(int i = 0; i < theaters.length; i++){
            if(theaters[i] != null){
                System.out.println("Theater #"+(i+1));
                System.out.println(theaters[i]);
                theaters[i].printTheater();
            }
        }
    }

}
