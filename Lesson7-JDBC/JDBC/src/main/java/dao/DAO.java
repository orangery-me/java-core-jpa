package dao;

import java.util.ArrayList;

public interface DAO<T,K> {
    public int add(T t);

    public int update(T t);

    public int delete(T t);

    public ArrayList<T> selectAll();

    public T selectByID(K ID);

    public ArrayList<T> selectByCondition(String condition);

}
