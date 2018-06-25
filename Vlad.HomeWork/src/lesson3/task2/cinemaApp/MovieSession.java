package lesson3.task2.cinemaApp;

import java.time.LocalTime;

public class MovieSession {
    private Movie movie;
    private HallForSession hallForSession;
    private long price;
    private LocalTime time;

    MovieSession(Movie movie, HallForSession hallForSession, int price, String time) {
        this.movie = movie;
        this.hallForSession = hallForSession;
        this.price = price;
        this.time = LocalTime.parse(time);
    }

    long money(){
        return hallForSession.reserveCount() * price;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    HallForSession getHallForSession() {
        return hallForSession;
    }

    @Override
    public String toString() {
        return "MovieSession{" +
                "movie=" + movie +
                hallForSession +
                ", price=" + price +
                ", time=" + time +
                '}';
    }
}
