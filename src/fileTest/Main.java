package fileTest;

import patterns.factoryMethod.classes.coffee.LatteItalianStyle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
//        FileReader reader = null;
//        try {
//            reader = new FileReader("src/fileTest/log.txt");
//        } catch (IOException e) {
//            System.out.println("Исключение " + e.getClass().getSimpleName());
//        }
//
//        while (reader.ready()) {
//            System.out.print((char) reader.read());
//        }
//        ArrayList<String> arr = new ArrayList<>();
//        arr.add("tom");
//        arr.add("jon");
//        arr.add("nik");
//        LinkedList<String> list = new LinkedList<>();
//        list.add("nik");
//        list.add("jon");
//        list.add("tom");
//
//        if (arr.equals(list)) {
//            System.out.println("Они раваны");
//        }
//        String str = "123";
//        try {
//            int number = Integer.parseInt(str);
//            System.out.println("ok");
//        } catch (ClassCastException e) {
//            System.out.println("error");
//        }

        FileWriter writer = new FileWriter("src/fileTest/file.txt", true);
        FileReader reader= new FileReader("src/fileTest/file.txt");

//        writer.write("Анна = 4\n");
//        writer.write("Елена = 5\n");
//        writer.write("Марина = 6\n");
//        writer.write("Владимир = ?\n");
//        writer.write("Константин = ?\n");
//        writer.write("Иван = 4\n");
//
//        writer.flush();
//        writer.close();
//
//
//    }
//
//    public static List<String[]> readFile(FileReader reader) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(reader);
//        List<String[]> list = new ArrayList<>();
//        String line = "";
//        while ((line = bufferedReader.readLine()) != null) {
//            String[] arr = line.split("=");
//            list.add(arr);
//        }
//
//        return list;
        int length = 60_000_000;
        Random rnd = new Random();
        Float[] arr1 = new Float[length];
        Float[] arr2 = new Float[length];
        Float[] res = new Float[length];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = rnd.nextFloat(1, 1000);
            arr2[i] = rnd.nextFloat(1, 1000);
        }
        for (int i = 0; i < res.length; i++) {
            res[i] = arr1[i] * arr2[i];
        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        }
    }
}
