package lesson7.task1.max;

import java.util.Comparator;
import java.util.List;

public class Max {
    static <T> T max(List<T> list, Comparator<T> comparator) {
        if (list == null || list.isEmpty()) throw new NullPointerException("Лист пустой");
        T result = list.get(0);
        for (T type : list) {
            if (comparator.compare(result, type) < 0){
                result = type;
            }
        }
        return result;
    }
}
