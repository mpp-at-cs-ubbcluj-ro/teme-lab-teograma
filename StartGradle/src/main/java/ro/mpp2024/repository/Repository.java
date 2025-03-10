package ro.mpp2024.repository;


public interface Repository<T, Tid> {
    void add(T elem);

    Iterable<T> findAll();
}