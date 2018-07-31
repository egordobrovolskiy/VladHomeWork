package lesson9.task1.storage;

/**
 * Сущность, которая будет храниться в Storage.
 * @param <ID> тип id.
 */

public interface Entity<ID> {
    ID getId();
}
