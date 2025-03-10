package ro.mpp2024.repository;

import ro.mpp2024.model.Identifiable;

import java.util.HashMap;
import java.util.Map;

public class AbstractRepository<T extends Identifiable<ID>, ID> implements Repository<T, ID> {
    protected Map<ID, T> elem;

    public AbstractRepository() {
        elem = new HashMap<>();
    }

    public void add(T el) {
        if (elem.containsKey(el.getID())) {
            throw new RuntimeException("Element already exists!!!");
        } else {
            elem.put(el.getID(), el);
        }
    }

    public Iterable<T> findAll() {
        return elem.values();
    }
}