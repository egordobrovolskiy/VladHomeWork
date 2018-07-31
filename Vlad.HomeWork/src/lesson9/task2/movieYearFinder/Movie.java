package lesson9.task2.movieYearFinder;

import lombok.Getter;
import lombok.ToString;

;

@Getter
@ToString
public class Movie {
    private final String name;
    private final int year;
    private final Genre genre;

    public Movie(String name, int year, Genre genre) {
        this.name = name;
        this.year = year;
        this.genre = genre;
    }

}
