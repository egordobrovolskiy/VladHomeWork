package lesson7.task4.tasks.comparators;

import lesson7.task4.tasks.Task;

import java.util.Comparator;

public class TaskComparators {
    public static Comparator<Task> byName() {
        return new ComparatorByName();
    }

    public static Comparator<Task> byDeadline() {
        return new ComparatorByDeadline();
    }

    public static Comparator<Task> byPriority() {
        return new ComparatorByPriority();
    }


}
