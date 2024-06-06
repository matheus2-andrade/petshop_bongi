package br.com.bongi.repository;

import java.util.List;

public interface IRepository<T> {
    void add(T item);
    List<T> list();
    void update(T item);
    void delete(T item);
}
