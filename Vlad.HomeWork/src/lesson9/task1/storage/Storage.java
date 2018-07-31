package lesson9.task1.storage;

import com.sun.istack.internal.NotNull;

import java.util.Optional;

/**
 * Хранилище сущностей.
 * @param <T> тип сущности.
 * @param <ID> тип id у сущности.
 */
public interface Storage<T extends Entity<ID>, ID> {

    Optional<T> findById(@NotNull ID id);
    void save(@NotNull T entity);
    void deleteById(@NotNull ID id);
}
