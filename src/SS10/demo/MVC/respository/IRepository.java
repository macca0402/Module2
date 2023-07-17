package SS10.demo.MVC.respository;

import java.util.List;

public interface IRepository<E>{
    void remove(E e);
    void add(E e);
    List<E> getAll();
}
