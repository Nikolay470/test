package testStructure;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> myList = new MyArrayList<>();
        myList.add("nik");
        myList.add("tom");
        myList.add("jon");

        List<String> list = new ArrayList<>();
        list.add("tom");
        list.add("jon");
        myList.containsAll(list);

        System.out.println(myList.containsAll(list));

        MyArrayList<String> myList2 = new MyArrayList<>();
        myList2.add("nik");
        myList2.add("tom");
        myList2.add("jon");


    }
}
