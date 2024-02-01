package testStructure.arrayList.mergeSort;

import java.util.Comparator;


public class MergeSort {
    public static void mergeSort(Object[] array) {
        if (array.length == 1) {
            return;
        }

        int midIndex = array.length / 2;
        Object[] left = new Object[midIndex];
        for (int i = 0; i < left.length; i++) {
            left[i] = array[i];
        }
        Object[] right = new Object[array.length - midIndex];
        for (int i = 0; i < right.length; i++) {
            right[i] = array[midIndex + i];
        }

        mergeSort(left);
        mergeSort(right);
        merge(array, left, right);
    }

    private static void merge(Object[] array, Object[] left, Object[] right) {
        int k = 0, l = 0, r = 0;

        while (l < left.length && r < right.length) {
            if (left[l] != null && right[r] != null) {
                if (left[l].hashCode() < right[r].hashCode()) {
                    array[k++] = left[l++];
                } else if (right[r].hashCode() < left[l].hashCode()) {
                    array[k++] = right[r++];
                } else {
                    array[k++] = left[l++];
                    array[k++] = right[r++];
                }
            } else if (left[l] == null) {
                l++;
            } else if (right[r] == null) {
                r++;
            } else {
                l++;
                r++;
            }
        }
        while (l < left.length) {
            array[k++] = left[l++];
        }
        while (r < right.length) {
            array[k++] = right[r++];
        }
    }

    public static void mergeSort(Object[] array, Comparator compare) {
        if (array.length == 1) {
            return;
        }

        int midIndex = array.length / 2;
        Object[] left = new Object[midIndex];
        for (int i = 0; i < left.length; i++) {
            left[i] = array[i];
        }
        Object[] right = new Object[array.length - midIndex];
        for (int i = 0; i < right.length; i++) {
            right[i] = array[midIndex + i];
        }

        mergeSort(left, compare);
        mergeSort(right, compare);
        merge(array, left, right, compare);
    }

    private static void merge(
            Object[] array, Object[] left, Object[] right, Comparator<Object> compare
    ) {
        int k = 0, l = 0, r = 0;

        while (l < left.length && r < right.length) {
            if (left[l] != null && right[r] != null) {
                int res = compare.compare(left[l], right[r]);
                if (res < 0) {
                    array[k++] = left[l++];
                } else if (res > 0) {
                    array[k++] = right[r++];
                } else {
                    array[k++] = left[l++];
                    array[k++] = right[r++];
                }
            } else if (left[l] == null) {
                l++;
            } else if (right[r] == null) {
                r++;
            } else {
                l++; r++;
            }
        }
        while (l < left.length) {
            array[k++] = left[l++];
        }
        while (r < right.length) {
            array[k++] = right[r++];
        }
    }
}



















