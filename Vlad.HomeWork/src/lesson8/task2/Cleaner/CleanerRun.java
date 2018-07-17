package lesson8.task2.Cleaner;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CleanerRun {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(null);
        list.add(4);
        list.add(6);
        list.add(null);
        list.add(2);

        System.out.println("Raw list: " + list);

        Cleaner.removeNulls(list);
        System.out.println("Clean null: " + list);

        Cleaner.remove(list, new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer == 2;
            }
        });
        System.out.println("After predicate: " + list);
    }
}
