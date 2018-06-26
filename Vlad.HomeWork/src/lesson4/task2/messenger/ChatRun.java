package lesson4.task2.messenger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ChatRun {

    private static Scanner scanner = new Scanner(System.in);
    private static boolean exitFlag = true;
    private static Dialog dialog = new Dialog();

    public static void main(String[] args) {
        try {
            while (exitFlag) {
                dialog.addMessageAndPrint(new Message(getNick(), getText()));
            }
        } finally {
            System.out.println("Buy!!! Buy!!!");
            scanner.close();
        }
//        dialog.addMessageAndPrint(new Message("Egor", new EmoticonText("ghost")));
//        dialog.addMessageAndPrint(new Message("Vlad", new PlainText("I'm fine")));
//        dialog.addMessageAndPrint(new Message("Egor", new EmoticonText("winking-face")));
//        dialog.addMessageAndPrint(new Message("Vlad", new PictureText("like")));
    }

    private static String getNick() {
        System.out.println("Nick Name: ");
        String nick = scanner.nextLine();
        exit(nick);
        return nick;
    }

    //при вводе log можно вывести всю историю
    //проверка не чувствительна к регистру текста
    private static Text getText() {
        System.out.println("Введите 'emotion', 'picture' или послание...");
        String text = scanner.nextLine();
        exit(text);
        switch (text.toLowerCase()) {
            case ("emotion"): {
                System.out.println("emotions: " + EmoticonText.getEmotion());
                String emotion = scanner.nextLine();
                exit(emotion);
                return new EmoticonText(emotion.toLowerCase());
            }
            case ("picture"): {
                System.out.println("pictures: " + PictureText.getPictures());
                String picture = scanner.nextLine();
                exit(picture);
                return new PictureText(picture.toLowerCase());
            }
            case ("log"): {
                dialog.printLog();
                return new PlainText("You have LogFile at :" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            }
            default:{
                return  new PlainText(text);
            }
        }
    }

    //при каждом обращении к консоли - преверка на выход из чата
    private static void exit(String text) {
        if ("exit".equals(text.toLowerCase())) exitFlag = false;
    }
}
