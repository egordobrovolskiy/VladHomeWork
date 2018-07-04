package lesson4.task2.messenger;

import java.util.Scanner;

public class ChatRun {

    static Dialog dialog = new Dialog();
    private static boolean exitFlag = true;

    public static void main(String[] args) {
        try {
            System.out.println("для выхода введите 'exit'.");
            while (exitFlag) {
                dialog.addMessageAndPrint(new Message(getNick(), TextFabric.getText()));
            }
        } finally {
            System.out.println("Buy!!! Buy!!!");
            EmoticonText.saveProperties();
            PictureText.saveProperties();
        }

    }

    private static String getNick() {
        System.out.println("Nick Name: ");
        String nick = new Scanner(System.in).nextLine();
        exit(nick);
        return nick;
    }

    //при каждом обращении к консоли - проверка на выход из чата
    static void exit(String text) {
        if ("exit".equals(text.toLowerCase())) exitFlag = false;
    }
}
