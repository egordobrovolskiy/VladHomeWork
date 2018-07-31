package lesson9.task1.storage;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MapStorage<T extends Entity<ID>, ID> implements Storage<T, ID> {
    private Map<ID, T> map = new HashMap<>();

    @Override
    public Optional<T> findById(ID id) {
        return Optional.ofNullable(map.get(id));
    }

    @Override
    public void save(T entity) {
        map.put(entity.getId(), entity);
    }

    @Override
    public void deleteById(ID id) {
        map.remove(id);
    }
}