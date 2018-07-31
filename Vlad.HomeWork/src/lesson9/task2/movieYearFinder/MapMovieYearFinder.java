package lesson9.task2.movieYearFinder;

import java.util.*;

//по заданию с List работаем, но с Set было бы эффективнее
public class MapMovieYearFinder implements MovieYearFinder {
    private SortedMap<Integer, Set<Movie>> mapFilms = new TreeMap<>();

    @Override
    public void add(Movie movie) {
        if (mapFilms.get(movie.getYear()) == null) {
            Set<Movie> movieSet = new HashSet<>();
            movieSet.add(movie);
            mapFilms.put(movie.getYear(), movieSet);
        }
        mapFilms.get(movie.getYear()).add(movie);
    }

    @Override
    public List<Movie> findByReleaseYear(int releaseYear) {
        Set<Movie> set = mapFilms.get(releaseYear);
        List<Movie> list = new ArrayList<>();
        if (set == null) {
            return list;
        }
        list.addAll(set);
        return list;
    }

    @Override
    public List<Movie> findByReleaseYears(int minReleaseYear, int maxReleaseYear) {
        SortedMap<Integer, Set<Movie>> subMap = mapFilms.subMap(minReleaseYear, maxReleaseYear);
        List<Movie> result = new LinkedList<>();
        for (Set<Movie> list : subMap.values()){
            result.addAll(list);
        }
        return result;
    }
}
