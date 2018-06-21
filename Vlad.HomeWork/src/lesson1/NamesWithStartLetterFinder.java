package lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class NamesWithStartLetterFinder {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Phil", "Anny", "Aaron", "Bob"));
        System.out.println(namesWithStartLetter(names, 'A'));
        System.out.println(namesWithStartLetterStream(names, 'A'));
    }

    private static ArrayList<String> namesWithStartLetter(ArrayList<String> names, char startLetter) {
        if (names == null || startLetter == ' ' || names.isEmpty() ) throw new IllegalArgumentException();
        ArrayList<String> result = new ArrayList<>();

        for (String name : names) {
            if (name.startsWith(String.valueOf(startLetter))) {
                result.add(name);
            }
        }
        return result;
    }

    private static ArrayList<String> namesWithStartLetterStream(ArrayList<String> names, char a) {
        if (names == null || a == ' ' || names.isEmpty() ) throw new IllegalArgumentException();
        return names.stream().filter(x -> x.startsWith(String.valueOf(a))).collect(Collectors.toCollection(ArrayList::new));
    }
}
