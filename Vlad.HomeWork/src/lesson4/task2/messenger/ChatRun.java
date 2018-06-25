package lesson4.task2.messenger;

public class ChatRun {
    public static void main(String[] args) {
        Dialog dialog = new Dialog();

        dialog.addMessageAndPrint(new Message("Egor", new EmoticonText("ghost")));
        dialog.addMessageAndPrint(new Message("Vlad", new PlainText("I'm fine")));
        dialog.addMessageAndPrint(new Message("Egor", new EmoticonText("winking-face")));
        dialog.addMessageAndPrint(new Message("Vlad", new PictureText("like")));
    }
}
