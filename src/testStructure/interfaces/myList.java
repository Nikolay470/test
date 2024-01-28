package testStructure.interfaces;

import java.util.Comparator;
import java.util.List;

public interface myList<T> {
    void add(T item);
    T remove(int index);
    T remove(T item);
    void sort();
    void sort(Comparator<T> compar);
    T get(int index);
    boolean contains(T item);
    boolean containsAll(List<? extends T> coll);
    T[] removeAll(List<? extends T> coll);
    int size();

}
