package lesson7.task4.tasks;

import lesson7.task4.tasks.comparators.TaskComparators;
import lesson7.task4.tasks.predicates.TaskPredicates;

import java.time.LocalDateTime;

public class TaskRun {
    public static void main(String[] args) {

        Tasks tasks = new Tasks();

        tasksComplete(tasks);

        printTest(tasks);
    }

    private static void tasksComplete(Tasks tasks) {

        Task task1 = new Task(123, "IntelliJ", "IDE", LocalDateTime.of(2018, 3, 30, 14, 15), Priority.NORMAL);

        Task task2 = new Task(143, "Adobe Reader", "The most popular and free software to support PDF files", LocalDateTime.of(2018, 3, 30, 18, 15), Priority.MAJOR);

        Task task3 = new Task(723, "Paint", "Simple graphic editor", LocalDateTime.of(2018, 3, 30, 19, 25), Priority.MINOR);

        Task task4 = new Task(633, "Word", "Document editor", LocalDateTime.of(2019, 3, 30, 13, 23), Priority.NORMAL);

        Task task5 = new Task(434, "Flash Player", "Multimedia player", LocalDateTime.of(2018, 8, 30, 17, 34), Priority.MAJOR);

        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);
        tasks.add(task4);
        tasks.add(task5);
    }

    private static void printTest(Tasks tasks) {
        System.out.println("Sorting by name");
        tasks.sort(TaskComparators.byName());
        System.out.println(tasks);

        System.out.println("Sorting by deadline");
        tasks.sort(TaskComparators.byDeadline());
        System.out.println(tasks);

        System.out.println("Sorting by priority");
        tasks.sort(TaskComparators.byPriority());
        System.out.println(tasks);

        System.out.println("Name contains substring \"ntel\"\n" +
                tasks.filter(TaskPredicates.nameContains("ntel")));

        System.out.println("Has expired deadline(now time: " + LocalDateTime.now() + ")\n" +
                tasks.filter(TaskPredicates.hasExpiredDeadline()));

        System.out.println("Has priority NORMAL\n" +
                tasks.filter(TaskPredicates.hasPriority(Priority.NORMAL)));
    }
}
