package testStructure;

import testStructure.arrayList.ComparatorMyList;
import testStructure.arrayList.MyArrayList;


import java.time.Duration;
import java.time.Instant;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        MyArrayList<String> myList = new MyArrayList<>();
//        myList.add("nik");
//        myList.add("tom");
//        myList.add("jon");
//
//        List<String> list = new ArrayList<>();
//        list.add("tom");
//        list.add("jon");
//
//        myList.sort(new ComparatorMyList());
//        System.out.println(myList);
//
//        MyArrayList<String> myList2 = new MyArrayList<>();
//        myList2.add("nik");
//        myList2.add("tom");
//        myList2.add("jon");
//        Instant start = Instant.now();
//
//        BaseSortedMap<String, Integer> map = new BaseSortedMap<>();
//        int i = 1;
//        while (i < 10000) {
//            String key = String.format("%d", i);
//            map.put(key, i);
//            i++;
//        }
//
//        System.out.println(map);
//
//        Instant finish = Instant.now();
//        long result = Duration.between(start, finish).toMillis();
//        System.out.println("Прошло " + result + "мс");

//        Instant startMap = Instant.now();
//        HashMap<String, Integer> coll = new HashMap<>();
//        int j = 1;
//        while (j < 1000000) {
//            String key = String.format("%d", j);
//            coll.put(key, j);
//            j++;
//        }
//
//        System.out.println(coll);
//        Instant finishMap = Instant.now();
//        long resultMap = Duration.between(startMap, finishMap).toMillis();
//        System.out.println(resultMap);

        Instant start = Instant.now();
        MyArrayList<Integer> myList = new MyArrayList<>(120000);
        myList.setCompletion(1);
        Random rnd = new Random();
        for (int i = 0; i < myList.length(); i++) {
            myList.add(rnd.nextInt(1, 1000));
        }

        for (int i = 0; i < myList.length(); i++) {
            myList.get(i);
        }

        Instant finish = Instant.now();
        long result = Duration.between(start, finish).toMillis();
        System.out.println("Прошло " + result + "мс");

//        Instant start = Instant.now();
//        ArrayList<Integer> myList = new ArrayList<>(120000);
//        Random rnd = new Random();
//        for (int i = 0; i < 120000; i++) {
//            myList.add(rnd.nextInt(1, 1000));
//        }
//
//        for (int i = 0; i < 120000; i++) {
//            myList.get(i);
//        }
//
//        Instant finish = Instant.now();
//        long result = Duration.between(start, finish).toMillis();
//        System.out.println("Прошло " + result + "мс");
    }
}
