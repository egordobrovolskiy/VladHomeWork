package lesson3.task1.musicApp;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Playlist> playlists = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public Playlist createPlaylist(String playlist) {
        Playlist result = new Playlist(playlist);
        playlists.add(result);
        return result;
    }
    public Playlist findByTitle(String playlist) {
        return playlists.stream().filter(x -> x.getTitle().equals(playlist)).findFirst().get();
    }

    public void addSongToPlaylist(String playlist, Song song) {
        playlists.stream().filter(x -> x.getTitle().equals(playlist)).findFirst().get().addSong(song);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", playlists=" + playlists +
                '}';
    }
}
