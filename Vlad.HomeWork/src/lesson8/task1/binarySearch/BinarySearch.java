package lesson8.task1.binarySearch;

import java.util.Comparator;
import java.util.List;

public class BinarySearch {

    static int binarySearch(int[] array, int elem) {
        int low = 0;
        int high = array.length - 1;
        int center;
        int limit;

        while (true) {
            if (array[low] > array[high]) throw new IllegalArgumentException("Массив не отсортирован");

            limit = high - low;
            if (limit == 0 && array[low] != elem) {
                return -(high + 1);
            }

            center = ((limit) / 2) + low;
            if (elem == array[center]) {
                return center;
            } else if (elem < array[center]) {
                high = center - 1;
            } else {
                low = center + 1;
            }
        }
    }

    static <T> int binarySearch(List<T> list, T elem, Comparator<T> comparator) {
        int low = 0;
        int high = list.size() - 1;
        int center;
        int limit;

        while (true) {
            if (comparator.compare(list.get(low), list.get(high)) > 0)
                throw new IllegalArgumentException("Массив не отсортирован");

            limit = high - low;
            if (limit == 0 && list.get(low) != elem) {
                return -(high + 1);
            }

            center = ((limit) / 2) + low;
            if (comparator.compare(elem, list.get(center)) == 0) {
                return center;
            } else if (comparator.compare(elem, list.get(center)) < 0) {
                high = center - 1;
            } else {
                low = center + 1;
            }
        }
    }
}
