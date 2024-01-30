package testStructure.treeMap.classes;

import testStructure.arrayList.MyArrayList;
import testStructure.treeMap.interfaces.IMyTreeMap;

import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class MyTreeMap<K, V> implements IMyTreeMap<K, V> {
    private MyArrayList<MyArrayList<Node>> list;
    private Hash<K> hash;

    public MyTreeMap() {
        this.hash = new Hash<>();
        this.list = new MyArrayList<>(0.7f);
    }

    public class Node {
        private final K key;
        private V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return this.key;
        }
        public V getValue() {
            return this.value;
        }
        public void setValue(V newValue) {
            this.value = newValue;
        }
    }

    @Override
    public void put(K key, V value) {
        int index = this.hash.hashFunction(key, this.list.length());
        int levelCompletion = (int) (this.list.length() * this.list.getCompletion());
        if (this.list.size() == levelCompletion) {
            this.resize();
        }
        if (this.list.get(index) == null) {
            this.list.add(new MyArrayList<>(0.8f));
            this.list.get(index).add(new Node(key, value));
        } else {
            this.list.get(index).add(new Node(key, value));
        }
    }

    @Override
    public V get(K key) {
        int index = this.hash.hashFunction(key, this.list.length());
        MyArrayList<Node> basket = this.list.get(index);
        basket.sort();

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

    public void resize() {
        MyArrayList<MyArrayList<Node>> newList =
                new MyArrayList<>(this.list.length() * 2);
        newList.setCompletion(0.7f);
        for (int i = 0; i < this.list.length(); i++) {
            newList.add(this.list.get(i));
        }
        this.list = newList;
    }

    @Override
    public String toString() {
        return "MyTreeMap{" +
                "list=" + list +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyTreeMap<?, ?> myTreeMap = (MyTreeMap<?, ?>) o;
        return Objects.equals(list, myTreeMap.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list);
    }
}
