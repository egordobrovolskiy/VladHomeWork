package lesson9.task2.movieYearFinder;

import java.util.List;

public interface MovieYearFinder {
    void add(Movie movie);
    List<Movie> findByReleaseYear(int releaseYear);
    List<Movie> findByReleaseYears(int minReleaseYear, int maxReleaseYear);
}
