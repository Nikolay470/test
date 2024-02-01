package testStructure.treeMap.classes;

import testStructure.arrayList.MyArrayList;
import testStructure.treeMap.classes.BaseHashMap.Node;

public class BinarySearch<K> {
    public int searchKey(K key, Node[] arr, int size)
    {
        if (size == 0) {
            return -1;
        }

        int start = 0;
        int stop = size;
        int mid = 0;

        while (start <= stop) {
            mid = start + (stop - start) / 2;
            if (arr[mid] == null) {
                stop = mid - 1;
            } else {
                if (key.hashCode() < arr[mid].hash()) {
                    stop = mid - 1;
                } else if (key.hashCode() > arr[mid].hash()) {
                    start = mid + 1;
                } else if (key.hashCode() == arr[mid].hash()){
                    if (key.equals(arr[mid].getKey())) {
                        return mid;
                    }
                    int left = mid - 1;
                    int right = mid + 1;

                    while (key.hashCode() == arr[left].hash()) {
                        if (key.equals(arr[left].getKey())) {
                            return left;
                        } else {
                            if (left == 0) {
                                break;
                            }
                            left--;
                        }
                    }

                    while (key.hashCode() == arr[right].hash()) {
                        if (key.equals(arr[right].getKey())) {
                            return right;
                        } else {
                            if (right == arr.length - 1) {
                                break;
                            }
                            right++;
                        }
                    }
                }
            }
        }
        return -1;
    }
}













