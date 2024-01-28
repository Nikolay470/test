package testStructure;

import java.util.Comparator;

public class ComparatorMyList<T> implements Comparator<T> {
    @Override
    public int compare(T first, T second) {
       return first.hashCode() - second.hashCode();
    }
}
