package lesson8.task1.binarySearch;

import java.util.Arrays;
import java.util.Comparator;

public class BinarySearchRun {
    public static void main(String[] args) {

        int[] array = {10, 20, 20, 30, 50};
        System.out.println(BinarySearch.binarySearch(array, 30)); // 3
        System.out.println(BinarySearch.binarySearch(array, 20)); // 2
        System.out.println(BinarySearch.binarySearch(array, 40)); // -5

        Integer[] list = {10, 20, 20, 30, 50};
        System.out.println(BinarySearch.binarySearch(Arrays.asList(list), 30, Comparator.comparingInt(o -> o))); // 3
        System.out.println(BinarySearch.binarySearch(Arrays.asList(list), 20, Comparator.comparingInt(o -> o))); // 2
        System.out.println(BinarySearch.binarySearch(Arrays.asList(list), 40, Comparator.comparingInt(o -> o))); // -5

    }
}
