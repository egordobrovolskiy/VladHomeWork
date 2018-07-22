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

    public void addAll(List<Task> list) {
        tasks.addAll(list);
    }

    public void sort(Comparator<Task> comparator) {
        tasks.sort(comparator);
    }

    public Tasks filter(Predicate<Task> predicate) {
        List<Task> copyTasks = getTasks();
        List<Task> filterList = Filter.filter(copyTasks, predicate);
        Tasks result = new Tasks();
        result.addAll(filterList);
        return result;
    }

    public List<Task> getTasks() {
        return tasks;
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
