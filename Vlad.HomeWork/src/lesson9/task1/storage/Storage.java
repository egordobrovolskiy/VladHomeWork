package lesson9.task1.storage;


import lombok.NonNull;

import java.util.Optional;

/**
 * Хранилище сущностей.
 * @param <T> тип сущности.
 * @param <ID> тип id у сущности.
 */
public interface Storage<T extends Entity<ID>, ID> {

    Optional<T> findById(@NonNull ID id);
    void save(@NonNull T entity);
    void deleteById(@NonNull ID id);
}
