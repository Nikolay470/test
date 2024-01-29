package testStructure.treeMap.interfaces;

import testStructure.arrayList.MyArrayList;
import testStructure.treeMap.classes.MyTreeMap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public interface IMyTreeMap<K, V> {
    void put(K key, V value);
    V get(K key);
    V remove(K key);
    boolean containsKey(K key);
    boolean containsValue(V value);
    void sort();
    void sort(Comparator compare);
    void putAll(Map<K, V> map);
    MyTreeMap<K, V> removeAll(Map<K, V> map);
    MyArrayList<V> removeAll(MyArrayList<V> list);
}
