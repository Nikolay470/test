package testStructure.treeMap.interfaces;

import testStructure.treeMap.classes.BaseHashMap;

import java.util.Comparator;
import java.util.Map;

public interface IBaseHashMap<K, V> {
    boolean put(K key, V value);
    V get(K key);
    V remove(K key);
    int size();
    boolean containsKey(K key);
    boolean containsValue(V value);
    void sort();
    void sort(Comparator compare);
    void putAll(Map<K, V> map);
    BaseHashMap<K, V> removeAll(Map<K, V> map);
}
