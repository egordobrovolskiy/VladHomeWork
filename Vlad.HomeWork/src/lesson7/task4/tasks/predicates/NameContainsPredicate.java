package lesson7.task4.tasks.predicates;

import lesson7.task4.tasks.Task;

import java.util.function.Predicate;

public class NameContainsPredicate implements Predicate<Task> {
    private final String substring;

    public NameContainsPredicate(String substring) {
        this.substring = substring;
    }

    @Override
    public boolean test(Task task) {
        return task.getName().contains(substring);
    }
}
