package lesson4.task2.messenger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class TextFabric {
    private static Scanner scanner = new Scanner(System.in);

    //проверка не чувствительна к регистру текста
    static Text getText() {

        System.out.println("Введите 'emotion', 'picture' или послание... Для администрированния 'admin'.");
        String text = scanner.nextLine();
        ChatRun.exit(text);
        switch (text.toLowerCase()) {
            case ("emotion"): {
                System.out.println("emotions: " + EmoticonText.getEmotion());
                String emotion = scanner.nextLine();
                ChatRun.exit(emotion);
                return new EmoticonText(emotion.toLowerCase());
            }
            case ("picture"): {
                System.out.println("pictures: " + PictureText.getPictures());
                String picture = scanner.nextLine();
                ChatRun.exit(picture);
                return new PictureText(picture.toLowerCase());
            }
            case ("admin"): {
                return adminMenu();
            }
            default: {
                return new PlainText(text);
            }
        }
    }

    private static Text adminMenu() {
        System.out.println("'log' - для просмотра лога; 'add emotion' - добавить смайлик; 'add picture' - добавить текстовую картинку.");
        String text = scanner.nextLine();
        ChatRun.exit(text);
        switch (text.toLowerCase()) {
            case ("log"): {
                ChatRun.dialog.printLog();
                return new PlainText("You have LogFile at :" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            }
            case ("add emotion"): {
                System.out.println("Введите название смайла");
                String nameSmile = scanner.nextLine();
                ChatRun.exit(nameSmile);
                System.out.println("Введите код смайла в формате \\u2620");
                String codeSmile = scanner.nextLine();
                ChatRun.exit(codeSmile);
                EmoticonText.addEmoticon(nameSmile, codeSmile);
                return new PlainText("Добавлен смайлик " + nameSmile + " -> " + codeSmile);
            }
            case ("add picture"): {
                System.out.println("Введите название картинки");
                String namePicture = scanner.nextLine();
                ChatRun.exit(namePicture);
                System.out.println("Введите картинку");
                String codePicture = scanner.nextLine();
                ChatRun.exit(codePicture);
                PictureText.addPicture(namePicture, codePicture);
                return new PlainText("Добавлен смайлик " + namePicture + " -> \n" + codePicture);
            }
            default:
                return new PlainText("Администрирование не произведенно.... -> " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        }
    }
}