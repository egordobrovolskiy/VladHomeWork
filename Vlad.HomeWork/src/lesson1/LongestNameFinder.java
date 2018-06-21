package lesson1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestNameFinder {

    public static void main(String[] args) {
        System.out.println(longestName(new ArrayList<>(Arrays.asList("Rick", "Anatoliy", "Tomas", "Tim"))));
        System.out.println(longestNameSort(new ArrayList<>(Arrays.asList("Rick", "Anatoliy", "Tomas", "Tim"))));
        System.out.println(longestNameStream(new ArrayList<>(Arrays.asList("Rick", "Anatoliy", "Tomas", "Tim"))));
    }

    private static String longestName(ArrayList<String> names) {
        if (names == null || names.isEmpty()) throw new IllegalArgumentException();
        String result = "";
        for (String name : names) {
            if (name.length() > result.length()) {
                result = name;
            }
        }
        return result;
    }

    private static String longestNameSort(ArrayList<String> names) {
        if (names == null || names.size() == 0) throw new IllegalArgumentException();
        String[] arr = listToArray(names);
        Arrays.sort(arr, (o1, o2) -> o2.length() - o1.length());
        return arr[0];
    }

    private static String[] listToArray(List<String> list) {
        String[] result = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    private static String longestNameStream(ArrayList<String> names) {
        if (names == null || names.size() == 0) throw new IllegalArgumentException();
//        return names.stream().sorted((x1, x2) -> x2.length() - x1.length()).findFirst().get();
        return names.stream().max(Comparator.comparingInt(String::length)).get();
    }
}
