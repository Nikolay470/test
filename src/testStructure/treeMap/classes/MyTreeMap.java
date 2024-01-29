package testStructure.treeMap.classes;

import testStructure.arrayList.MyArrayList;
import testStructure.treeMap.interfaces.IMyTreeMap;

import java.util.Comparator;
import java.util.Map;

public class MyTreeMap<K, V> implements IMyTreeMap {
    @Override
    public void put(Object key, Object value) {

    }

    @Override
    public Object get(Object key) {
        return null;
    }

    @Override
    public Object remove(Object key) {
        return null;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public void sort() {

    }

    @Override
    public void sort(Comparator compare) {

    }

    @Override
    public void putAll(Map map) {

    }

    @Override
    public MyTreeMap removeAll(Map map) {
        return null;
    }

    @Override
    public MyArrayList removeAll(MyArrayList list) {
        return null;
    }
}
