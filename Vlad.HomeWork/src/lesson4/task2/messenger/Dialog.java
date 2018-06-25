package lesson4.task2.messenger;

import java.util.ArrayList;
import java.util.List;

class Dialog {
    private List<Message> messages = new ArrayList<>();

    private void rePrint() {
        for (Message message : messages) {
            System.out.println(message);
        }
    }
    void addMessageAndPrint(Message message) {
        messages.add(message);
        rePrint();
        System.out.println("===========================================");
    }
}
