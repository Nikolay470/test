package testStructure;

import testStructure.interfaces.MyList;
import testStructure.mergeSort.MergeSort;

import java.util.*;


public class MyArrayList<T> implements MyList<T>, Iterable<T>, Comparable<MyArrayList> {
    private int defaultCapacity = 16;
    private int capacity = defaultCapacity;
    private float defaultCompletion = 0.75f;
    private float completion = defaultCompletion;
    private int size = 0;
    private Object[] array;

    public MyArrayList(T[] array) {
       this.array = Arrays.copyOf(array, array.length);
    }

    public MyArrayList(int capacity) {
        this.array = new Object[capacity];
        this.capacity = capacity;
    }

    public MyArrayList(float completion) {
        this.completion = completion;
        this.array = new Object[this.capacity];
    }

    public MyArrayList() {
        this.array = new Object[this.capacity];
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int value) {
        if (value >= this.size) {
            this.capacity = value;
        }
    }

    public float getCompletion() {
        return this.completion;
    }

    public void setCompletion(float value) {
        this.completion = value;
    }

    @Override
    public void add(T item) {
        this.array[size] = item;
        size++;
    }

    @Override
    public T remove(int index) {
        if (index >= 0 && index < this.size()) {
            T itemRemove = (T) this.array[index];
            this.array[index] = null;
            this.size = this.size - 1;
            this.sort();
            return itemRemove;
        } return null;
    }

    @Override
    public T remove(T item) {
        T itemRemove = null;
        for (int i = 0; i < this.size(); i++) {
            if (this.array[i].equals(item)) {
                itemRemove = (T) this.array[i];
                this.array[i] = null;
                this.size = this.size - 1;
                this.sort();
                return itemRemove;
            }
        } return itemRemove;
    }

    @Override
    public void sort() {
        MergeSort.mergeSort(this.array);
    }

    @Override
    public void sort(Comparator<Object> compare) {
        MergeSort.mergeSort(this.array, compare);
    }

    @Override
    public T get(int index) {
        return (T) this.array[index];
    }

    @Override
    public boolean contains(T item) {
        for (int i = 0; i < this.size(); i++) {
            if (this.array[i].equals(item)) {
                return true;
            }
        } return false;
    }

    @Override
    public boolean containsAll(List<T> coll) {
        int count = 0;
        for (int i = 0; i < coll.size(); i++) {
            for (int j = 0; j < this.array.length; j++) {
                if (coll.get(i).equals(this.array[j])) {
                    count++;
                }
            }
        }
        return count == coll.size();
    }

    @Override
    public T[] removeAll(List<T> coll) {
        Object[] result = new Object[this.array.length];
        int index = 0;
        for (int i = 0; i < coll.size(); i++) {
            for (int j = 0; j < this.array.length; j++) {
                if (coll.get(i).equals(this.array[j])) {
                    result[index++] = this.array[j];
                    this.array[j] = null;
                }
            }
        }
        if (result.length > 0) {
            this.size = this.size - index;
            this.sort();
            return (T[]) result;
        } else {
            return (T[]) new Object[1];
        }
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public int compareTo(MyArrayList object) {
        return this.size() - object.size();
    }

    @Override
    public Iterator<T> iterator() {
       return new Iterator<T>() {
           private int index = 0;
           @Override
           public boolean hasNext() {
               if (index < size()) {
                   return true;
               } return false;
           }

           @Override
           public T next() {
               return (T) array[index++];
           }
           @Override
           public void remove() {
                array[index - 1] = null;
                sort();
           }
       };
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < this.size(); i++) {
            builder.append(this.array[i].toString() + "\n");
        }
        return builder.toString();
    }

    @Override
    public int hashCode() {
        return (int) (this.completion + this.capacity +
                this.size() + this.array.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MyArrayList) {
            MyArrayList newObj = (MyArrayList) obj;
            if (this.size() == newObj.size()) {
                for (int i = 0; i < this.size(); i++) {
                    if (!this.array[i].equals(newObj.get(i))) {
                        return false;
                    }
                }
                return (this.capacity == newObj.getCapacity() &&
                        this.completion == newObj.getCompletion());
            } return false;
        }
        return false;
    }
}












