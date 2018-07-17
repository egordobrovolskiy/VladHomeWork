package lesson8.task2.Cleaner;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

public class Cleaner  {
    static void removeNulls(Collection<?> collection) {
        Iterator<?> iterator = collection.iterator();
        while (iterator.hasNext()){
            Object object = iterator.next();
            if (object == null) {
                iterator.remove();
            }
        }
    }

    static <T> void remove(Collection<T> collection, Predicate<T> predicate) {
        Iterator<T> iterator = collection.iterator();
        while (iterator.hasNext()){
            T object = iterator.next();
            if (predicate.test(object)) {
                iterator.remove();
            }
        }
    }
}
