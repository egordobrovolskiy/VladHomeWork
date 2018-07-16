package lesson7.task4.tasks.predicates;

import lesson7.task4.tasks.Priority;
import lesson7.task4.tasks.Task;

import java.util.function.Predicate;

public class HasPriorityPredicate implements Predicate<Task> {

    private final Priority priority;

    public HasPriorityPredicate(Priority priority) {
        this.priority = priority;
    }

    @Override
    public boolean test(Task task) {
        return task.getPriority().equals(priority);
    }
}
