package lesson7.task4.tasks.predicates;

import lesson7.task4.tasks.Task;

import java.time.LocalDateTime;
import java.util.function.Predicate;

public class HasExpiredDeadlinePredicate implements Predicate<Task> {
    @Override
    public boolean test(Task task) {
        return task.getDeadline().compareTo(LocalDateTime.now()) < 0;
    }
}
