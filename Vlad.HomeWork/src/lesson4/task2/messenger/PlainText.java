package lesson4.task2.messenger;

public class PlainText implements Text {
    private String text;

    PlainText(String text) {
        this.text = text;
    }


    @Override
    public String print() {
        return text;
    }
}
