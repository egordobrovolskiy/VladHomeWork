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
            System.err.println("для выхода введите 'exit'.");
            while (exitFlag) {
                dialog.addMessageAndPrint(new Message(getNick(), getText()));
            }
        } finally {
            System.err.println("Buy!!! Buy!!!");
            scanner.close();
            EmoticonText.saveProperties();
            PictureText.saveProperties();
        }

    }

    private static String getNick() {
        System.out.println("Nick Name: ");
        String nick = scanner.nextLine();
        exit(nick);
        return nick;
    }

    //проверка не чувствительна к регистру текста
    private static Text getText() {
        System.out.println("Введите 'emotion', 'picture' или послание... Для администрированния 'admin'.");
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
            case ("admin"): {
                return adminMenu();
            }
            default:{
                return  new PlainText(text);
            }
        }
    }

    private static Text adminMenu() {
        System.out.println("'log' - для просмотра лога; 'add emotion' - добавить смайлик; 'add picture' - добавить текстовую картинку.");
        String text = scanner.nextLine();
        exit(text);
        switch (text.toLowerCase()) {
            case ("log"): {
                dialog.printLog();
                return new PlainText("You have LogFile at :" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            }
            case ("add emotion"): {
                System.out.println("Введите название смайла");
                String nameSmile = scanner.nextLine();
                exit(nameSmile);
                System.out.println("Введите код смайла в формате \\u2620");
                String codeSmile = scanner.nextLine();
                exit(codeSmile);
                EmoticonText.addEmoticon(nameSmile, codeSmile);
                return new PlainText("Добавлен смайлик " + nameSmile + " -> " + codeSmile);
            }
            case ("add picture"): {
                System.out.println("Введите название картинки");
                String namePicture = scanner.nextLine();
                exit(namePicture);
                System.out.println("Введите картинку");
                String codePicture = scanner.nextLine();
                exit(codePicture);
                PictureText.addPicture(namePicture, codePicture);
                return new PlainText("Добавлен смайлик " + namePicture + " -> \n" + codePicture);
            }
            default:
                return new PlainText("Администрирование не произведенно.... -> " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        }
    }

    //при каждом обращении к консоли - проверка на выход из чата
    private static void exit(String text) {
        if ("exit".equals(text.toLowerCase())) exitFlag = false;
    }
}
