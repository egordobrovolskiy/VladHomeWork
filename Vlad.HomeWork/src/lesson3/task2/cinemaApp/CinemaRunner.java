package lesson3.task2.cinemaApp;

public class CinemaRunner {
    public static void main(String[] args) {
        MovieSession movieSession = getMovieSession();

        System.out.println("Выторг: -> " + movieSession.money());
        System.out.println("Свободных мест: -> " + movieSession.getHallForSession().freeCount());
        System.out.println("Занято: -> " + movieSession.getHallForSession().reserveCount());

        System.out.println(movieSession);
    }

    private static MovieSession getMovieSession() {
        MovieSession movieSession = new MovieSession(new Movie("Битва титанов", 2015,127,"Какаято битва" ), new HallForSession(15, 30), 70, "10:15:00");

        movieSession.getHallForSession().reserve(2,12);
        movieSession.getHallForSession().reserve(2,23);
        movieSession.getHallForSession().reserve(2,5);
        movieSession.getHallForSession().reserve(2,24);
        movieSession.getHallForSession().reserve(2,13);
        movieSession.getHallForSession().reserve(2,8);

        movieSession.getHallForSession().reserve(4,12);
        movieSession.getHallForSession().reserve(5,23);
        movieSession.getHallForSession().reserve(6,5);
        movieSession.getHallForSession().reserve(7,24);
        movieSession.getHallForSession().reserve(8,13);
        movieSession.getHallForSession().reserve(1,8);
        return movieSession;
    }
}
