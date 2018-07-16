package lesson7.task4.tasks.comparators;

import lesson7.task4.tasks.Task;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Task> {
    @Override
    public int compare(Task o1, Task o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
