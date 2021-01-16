package dao;

import java.util.List;

public interface EntityRepository<T> {
public T save(T a);
public List<T> findAll(); 
public List<T> findByName(String mc);
public T update(T a);
public void delete(Long id);
}
