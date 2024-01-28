package testStructure;

import testStructure.interfaces.myList;

import java.util.*;


public class myArrayList<T> implements myList<T> {
    private int defaultCapacity = 16;
    private int capacity = defaultCapacity;
    private  float defaultCompletion = 0.75f;
    private float completion = defaultCompletion;
    private int size = 0;
    private Object[] array;

    public myArrayList(T[] array) {
       this.array = Arrays.copyOf(array, array.length);
    }

    public myArrayList(int capacity) {
        this.array = new Object[capacity];
        this.capacity = capacity;
    }

    public myArrayList(float completion) {
        this.completion = completion;
    }

    @Override
    public void add(T item) {
        this.array[size] = item;
        size++;
    }

    @Override
    public T remove(int index) {
        if (index >= 0 && index < this.size) {
            T itemRemove = (T) this.array[index];
            this.array[index] = null;
            return itemRemove;
        } return null;
    }

    @Override
    public T remove(T item) {
        T itemRemove = null;
        for (int i = 0; i < this.size; i++) {
            if (this.array[i].equals(item)) {
                itemRemove = (T) this.array[i];
                this.array[i] = null;
                return itemRemove;
            }
        } return itemRemove;
    }

    @Override
    public void sort() {

    }

    @Override
    public void sort(Comparator compar) {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public boolean contains(Object item) {
        return false;
    }

    @Override
    public boolean containsAll(List coll) {
        return false;
    }

    @Override
    public T[] removeAll(List coll) {

    }

    @Override
    public int size() {
        return 0;
    }
}




