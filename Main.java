public class Main {

    public static void main(String[] args){
        Cinema cinema = new Cinema();
        cinema.addFilm("Free Guy", 200);
        cinema.screenFilm("Free Guy", 1);
        cinema.buyTickets("Free Guy", 3);
        cinema.buyTickets("Free Guy", 5);

        cinema.addFilm("Toy Story", 120);
        cinema.screenFilm("Toy Story", 3);
        cinema.buyTickets("Toy Story", 8);
        cinema.buyTickets("Toy Story", 5);
        cinema.printTheaters();
    }

}
