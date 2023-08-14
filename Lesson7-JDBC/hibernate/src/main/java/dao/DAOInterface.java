package dao;

import java.util.List;

public interface DAOInterface <T>{
    public List <T> getAll();
    public T getByID(T t);
    public boolean insert_update(T t);
    public boolean delete(T t);
}
