package lesson4.task2.messenger;

import java.util.ArrayList;
import java.util.List;

class Dialog {
    private List<Message> log = new ArrayList<>();

    void printLog() {
        for (Message message : log) {
            System.out.println(message);
        }
        System.out.println("===========================================");

    }

    void addMessageAndPrint(Message message) {
        log.add(message);
        System.out.println(message);
    }
}
