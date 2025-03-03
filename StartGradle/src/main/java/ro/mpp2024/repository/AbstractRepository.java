package ro.mpp2024.repository;

import ro.mpp2024.model.Identifiable;

import java.util.Collection;
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

    public void delete(T el) {
        if (elem.containsKey(el.getID())) {
            elem.remove(el.getID());
        }
    }

    public void update(T el, ID id) {
        if (elem.containsKey(id)) {
            elem.put(el.getID(), el);
        } else {
            throw new RuntimeException("Element doesn’t exist");
        }
    }

    public T findById(ID id) {
        if (elem.containsKey(id)) {
            return elem.get(id);
        } else {
            throw new RuntimeException("Element doesn't exist");
        }
    }

    public Iterable<T> findAll() {
        return elem.values();
    }

    @Override
    public Collection<T> getAll() {
        return elem.values();
    }
}