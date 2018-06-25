package lesson3.task1.musicApp;

public class MusicRunner {
    public static void main(String[] args) {
        User user = new User("Mike");

        loadPlaylist(user);

        System.out.println(user.findByTitle("Relax"));


    }

    private static void loadPlaylist(User user) {
        Playlist relax = user.createPlaylist("Relax");
        Playlist rock = user.createPlaylist("Rock");

        relax.addSong(new Song("track1", "unknown","yoga", 230, new AudioContent(new byte[3])));
        relax.addSong(new Song("track2", "unknown2","bang", 400, new AudioContent(new byte[3])));
        relax.addSong(new Song("track3", "unknown3","piano", 130, new AudioContent(new byte[3])));

        rock.addSong(new Song("track1", "unknown3","rock", 130, new AudioContent(new byte[3])));
    }
}
