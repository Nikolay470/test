package testStructure.treeMap.classes;

import testStructure.arrayList.MyArrayList;
import testStructure.arrayList.mergeSort.MergeSort;
import testStructure.treeMap.interfaces.IBaseHashMap;

import java.util.*;

public class BaseHashMap<K, V> implements IBaseHashMap<K, V> {
    private Node<K, V>[] list;
    private final int defaultCapacity = 16;
    private final float defaultCompletion = 0.8f;
    private int capacity = defaultCapacity;
    private int size = 0;
    private Node<K, V>[] defaultList = new Node[defaultCapacity];
    private BinarySearch<K> search = new BinarySearch();


    public BaseHashMap() {
        this.list = defaultList;
    }

    public BaseHashMap(int capacity) {
        this.capacity = capacity;
        this.list = new Node[capacity];
    }

    public final class Node<K, V> {
        private K key;
        private V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public int hash() {
            return key.hashCode();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node<?, ?> node = (Node<?, ?>) o;
            return Objects.equals(key, node.key) && Objects.equals(value, node.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key, value);
        }

        @Override
        public String toString() {
            return "(" + key + ", " + value + ")";
        }

    }

    @Override
    public boolean put(K key, V value) {
        int level = (int) (list.length * defaultCompletion);
        if (size == level) {
            resize();
        }
        if (size == 0) {
            list[size++] = new Node<>(key, value);
            sort();
            return true;
        } else {
            int contains = search.searchKey(key, list, size);
            if (contains == -1) {
                list[size] = new Node<>(key, value);
                sort();
                return true;
            } else {
                list[contains].setValue(value);
                return false;
            }
        }
    }

    @Override
    public V get(K key) {
        int check = checkKey(key);
        if (check == -1) {
            return null;
        }
        return list[check].getValue();
    }

    @Override
    public V remove(K key) {
        int check = checkKey(key);
        if (check == -1) {
            return null;
        }
        V value = list[check].getValue();
        list[check] = null;
        size--;
        sort();
        return value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean containsKey(K key) {
        int check = checkKey(key);
        if (check == -1) {
            return false;
        }
        return true;
    }

    @Override
    public boolean containsValue(V value) {
        for (int i = 0; i < size; i++) {
            if (list[i].getValue().equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void sort() {
        MergeSort.mergeSort(list);
    }

    @Override
    public void sort(Comparator compare) {
        MergeSort.mergeSort(list, compare);
    }

    @Override
    public void putAll(Map<K, V> map) {
        Set<Map.Entry<K, V>> set = map.entrySet();
        for (Map.Entry<K, V> node : set) {
            K key = node.getKey();
            V value = node.getValue();
            this.put(key, value);
        }
    }

    @Override
    public BaseHashMap<K, V> removeAll(Map<K, V> map) {
        BaseHashMap<K, V> removeRes = new BaseHashMap<>();
        Set<K> setKey = map.keySet();
        for (K key : setKey) {
            int check = checkKey(key);
            if (check != -1) {
                Node<K, V> node = this.getNode(key);
                removeRes.put(node.getKey(), node.getValue());
                this.remove(key);
            }
        }
        int delete = removeRes.size();
        size -= delete;
        return removeRes;
    }

    public void resize() {
        Node<K, V>[] newList = new Node[list.length * 2];
        for (int i = 0; i < size; i++) {
            newList[i] = list[i];
        }
        list = newList;
    }

    public int checkKey(K key) {
        return search.searchKey(key, list, size);
    }

    public Node<K, V> getNode(K key) {
        if (size == 0) {
            return null;
        }
        int check = checkKey(key);
        if (check == -1) {
            return null;
        }
        return list[check];
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            builder.append(list[i] + "; ");
        }
        return builder.toString();
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(defaultCapacity, defaultCompletion, capacity, size, search);
        result = 31 * result + Arrays.hashCode(list);
        result = 31 * result + Arrays.hashCode(defaultList);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseHashMap<?, ?> that = (BaseHashMap<?, ?>) o;
        return defaultCapacity == that.defaultCapacity &&
                Float.compare(that.defaultCompletion, defaultCompletion) == 0 &&
                capacity == that.capacity && size == that.size &&
                Arrays.equals(list, that.list) &&
                Arrays.equals(defaultList, that.defaultList) &&
                Objects.equals(search, that.search);
    }
}





