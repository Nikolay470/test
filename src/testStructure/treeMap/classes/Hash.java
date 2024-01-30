package testStructure.treeMap.classes;

import testStructure.arrayList.MyArrayList;

public class Hash<K> {
    private MyArrayList<MyArrayList<Object>> list = new MyArrayList<>();
    private int indexLength = 0;

    public int hashFunction(K key, int arrLength) {
        int check = checkKey(key);
        if (check != -1) {
            return key.hashCode() % check;
        } else {
            int index = key.hashCode() % arrLength;
            addKey(key, arrLength);
            return index;
        }
    }

    private void addKey(K key, int length) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).get(indexLength).equals(length)) {
                list.get(i).add(key);
                return;
            }
        }
        MyArrayList<Object> newBasket = new MyArrayList<>();
        newBasket.add(length);
        list.add(newBasket);
    }

    public int checkKey(K key) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                MyArrayList<Object> coll = list.get(i);
                for (int j = 1; j < coll.size(); j++) {
                    if (coll.get(i).equals(key)) {
                        return (int) coll.get(indexLength);
                    }
                }
            }
        }
        return -1;
    }
}
