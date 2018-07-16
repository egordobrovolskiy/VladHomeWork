package lesson7.task2.comparablePair;

public class ComparablePair<T extends Comparable<? super T>> {
    private final T first;
    private final T second;

    public ComparablePair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    T bigger(){
        return first.compareTo(second) > 0 ? first : second;
    }

    T smaller() {
        return first.compareTo(second) < 0 ? first : second;
    }
}
