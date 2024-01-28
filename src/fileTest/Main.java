package fileTest;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

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
        ArrayList<String> arr = new ArrayList<>();
        arr.add("tom");
        arr.add("jon");
        arr.add("nik");
        LinkedList<String> list = new LinkedList<>();
        list.add("nik");
        list.add("jon");
        list.add("tom");

        if (arr.equals(list)) {
            System.out.println("Они раваны");
        }
    }
}
