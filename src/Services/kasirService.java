package Services;


import java.util.ArrayList;

public interface kasirService<T, K> {
    ArrayList<T> findAll();

    T findById(K id);

    void save(T data);

    int index();
    int size();
    void update(K data, K id);

    void delete(K id);

    int getBiaya(Integer data, Integer id);
}