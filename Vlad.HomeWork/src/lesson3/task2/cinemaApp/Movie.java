package lesson3.task2.cinemaApp;

import java.time.Year;

public class Movie {
    private String name;
    private Year year;
    private int length;
    private String description;

    Movie(String name, int year, int length, String description) {
        this.name = name;
        this.year = Year.parse(String.valueOf(year));
        this.length = length;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", length=" + length +
                ", description='" + description + '\'' +
                '}';
    }
}
