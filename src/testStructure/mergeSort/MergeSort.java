package testStructure.mergeSort;

import java.util.Comparator;
import java.util.Objects;

public class MergeSort {
    public static void mergeSort(Object[] array) {
        if (array.length == 2) {
            int res = array[0].hashCode() - array[1].hashCode();
            if (res > 0) {
                Object temp = array[0];
                array[0] = array[1];
                array[1] = temp;
            }
            return;
        } else if (array.length == 1) {
            return;
        }

        int midIndex = array.length / 2;
        Object[] left = new Object[midIndex];
        Object[] right = new Object[array.length - midIndex];
        mergeSort(left);
        mergeSort(right);
        merge(array, left, right);
    }

    private static void merge(Object[] array, Object[] left, Object[] right) {
        int k = 0, l = 0, r = 0;

        while (l < left.length && r < right.length) {
            if (left[l].hashCode() < right[r].hashCode()) {
                array[k++] = left[l++];
            } else if (left[l].hashCode() > right[r].hashCode()) {
                array[k++] = right[r++];
            } else {
                array[k++] = left[l++];
                array[k++] = right[r++];
            }

            while (l < left.length) {
                array[k++] = left[l++];
            }
            while (r < right.length) {
                array[k++] = right[r++];
            }
        }
    }

    public static void mergeSort(Object[] array, Comparator<Object> compare) {
        if (array.length == 2) {
            int res = Objects.compare(array[0], array[1], compare);
            if (res > 0) {
                Object temp = array[0];
                array[0] = array[1];
                array[1] = temp;
                return;
            } else if (array.length == 1) {
                return;
            }

            int midIndex = array.length / 2;
            Object[] left = new Object[midIndex];
            Object[] right = new Object[array.length - midIndex];

            mergeSort(left, compare);
            mergeSort(right, compare);

            merge(array, left, right, compare);
        }
    }

    public static void merge(
            Object[] array, Object[] left, Object[] right, Comparator<Object> compare
    )
    {
        int k = 0, l = 0, r = 0;

        while (l < left.length && r < right.length) {
            int res = compare.compare(left[l], right[r]);
            if (res < 0) {
                array[k++] = left[l++];
            } else if (res > 0) {
                array[k++] = right[r++];
            } else {
                array[k++] = left[l++];
                array[k++] = right[r++];
            }

            while (l < left.length) {
                array[k++] = left[l++];
            }
            while (r < right.length) {
                array[k++] = right[r++];
            }
        }
    }
}



















