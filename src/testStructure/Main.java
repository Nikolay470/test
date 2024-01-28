package testStructure;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> myList = new MyArrayList<>();
        myList.add("nik");
        myList.add("tom");
        myList.add("jon");

        MyArrayList<String> myList2 = new MyArrayList<>();
        myList2.add("nik");
        myList2.add("tom");
        myList2.add("jon");

        System.out.println(myList.size());
        myList.remove("tom");
        System.out.println(myList.size());
    }
}
