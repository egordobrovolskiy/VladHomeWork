package lesson3.task1.musicApp;

public class AudioContent {
    private byte[] content;

    public AudioContent(byte[] content) {
        this.content = content;
    }

    public byte[] getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "AudioContent{" +
                "content=" + content +
                '}';
    }
}
