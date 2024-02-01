package testStructure.treeMap;

import testStructure.treeMap.classes.BaseHashMap;

import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;

public class Program {
    public static void main(String[] args) {
        Instant start = Instant.now();

        BaseHashMap<String, Integer> myMap = new BaseHashMap<>();
        int quant = 40_000_000;
        for (int i = 0; i < quant; i++) {
            String key = String.format("%d", i);
            myMap.put(key, i);
        }

        for (int i = 0; i < myMap.size(); i++) {
            String key = String.format("%d", i);
            myMap.get(key);
        }

        Instant finish = Instant.now();
        long res = Duration.between(start, finish).toMillis();
        System.out.println("Прошло " + res + "мс");
///=====================================================================
        Instant startCheck = Instant.now();
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < quant; i++) {
            String key = String.format("%d", i);
            map.put(key, i);
        }

        for (int i = 0; i < map.size(); i++) {
            String key = String.format("%d", i);
            map.get(key);
        }

        Instant finishCheck = Instant.now();
        long resCheck = Duration.between(startCheck, finishCheck).toMillis();
        System.out.println("Результат бенчмарка " + resCheck + "мс");
    }
}
