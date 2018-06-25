package lesson3.task1.musicApp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Playlist {
    private String title;
    private List<Song> songs = new ArrayList<>();

    public Playlist(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void addSong (Song song) {
        songs.add(song);
    }
    public long getTotalLength(){
        return songs.stream().mapToLong(Song::getLength).sum();
    }

    public List<Song> findByTitlePart(String title) {
        return songs.stream().filter(x -> x.getTitle().equals(title)).collect(Collectors.toList());
    }
    public List<Song> findByAuthor(String author) {
        return songs.stream().filter(x -> x.getAuthor().equals(title)).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "title='" + title + "\n" +
                ", songs=" + songs +
                '}';
    }
}
