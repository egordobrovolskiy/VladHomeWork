package lesson7.task4.tasks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Tasks {
    private final List<Task> tasks = new ArrayList<>();

    public void add(Task task) {
        tasks.add(task);
    }

    public void sort(Comparator<Task> comparator) {
        tasks.sort(comparator);
    }

    public Tasks filter(Predicate<Task> predicate) {
        Tasks result = new Tasks();
        for (Task task : tasks) {
            if (predicate.test(task)) {
                result.add(task);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("=======================================================\n");
        for(Task task : tasks){
            result.append(task.toString());
            result.append("\n");
        }
        return result.toString();
    }
}
