package lesson7.task4.tasks.predicates;

import lesson7.task4.tasks.Priority;
import lesson7.task4.tasks.Task;

import java.util.function.Predicate;

public class TaskPredicates {
    public static Predicate<Task> nameContains(String substring) {
        return new NameContainsPredicate(substring);
    }

    public static Predicate<Task> hasExpiredDeadline() {
        return new HasExpiredDeadlinePredicate();
    }

    public static Predicate<Task> hasPriority(Priority priority) {
        return new HasPriorityPredicate(priority);
    }

}
