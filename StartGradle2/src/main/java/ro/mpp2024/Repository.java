package ro.mpp2024;

public interface Repository<ID, T> {
    void add(T elem);

    Iterable<T> findAll();
}