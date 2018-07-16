package lesson7.task3.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Filter {
    static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        if (list == null || list.isEmpty()) throw new IllegalArgumentException("No God! NO!!!");
        List<T> result = new ArrayList<>();
        for (T type : list) {
            if (predicate.test(type)) {
                result.add(type);
            }
        }
        return result;
    }
}
