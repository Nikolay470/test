package testStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class myArrayList<T> implements List<T> {
    private Integer defaultCapacity = 16;
    private Integer capacity;
    private  Float defaultCompletion = 0.75f;
    private Float completion;
    private Integer size;
    private Object[] array;

    public myArrayList(T[] array, Integer capacity, Float completion) {
       this.array = Arrays.copyOf(array, array.length);
       this.capacity = capacity;
       this.completion = completion;
    }

    public myArrayList(Integer capacity, Float completion) {
        this.array = new Object[capacity];
        this.capacity = capacity;
        this.completion = completion;
    }

    public myArrayList(Integer capacity) {
        
    }
}

ArrayList

