package lesson4.task2.messenger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Message {
    private String author;
    private String dateTime;
    private Text text;

    Message(String author, Text text) {
        this.author = author;
        this.dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        this.text = text;
    }

    @Override
    public String toString() {
        return "author -> " + author +
                "\ndateTime: " + dateTime +
                "\ntext: -->  " + text.print() + "\n";
    }
}
