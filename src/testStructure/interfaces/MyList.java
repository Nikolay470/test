package testStructure.interfaces;

import java.util.Comparator;
import java.util.List;

public interface MyList<T> {
    void add(T item);
    T remove(int index);
    T remove(T item);
    void sort();
    void sort(Comparator<Object> compare);
    T get(int index);
    boolean contains(T item);
    boolean containsAll(List<T> coll);
    T[] removeAll(List<T> coll);
    int size();
}
