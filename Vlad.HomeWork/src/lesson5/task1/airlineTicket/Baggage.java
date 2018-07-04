package lesson5.task1.airlineTicket;
//Свойства: стоимость одной сумки, количество сумок.
//Методы: подсчет стоимости.

public class Baggage {
    private long priceBag;
    private int countBug;

    Baggage(long priceBag, int countBug) {
        this.priceBag = priceBag;
        this.countBug = countBug;
    }

    Long getBriceBug(){
        return priceBag * countBug;
    }

    public int getCountBug() {
        return countBug;
    }

    @Override
    public String toString() {
        return "Baggage{" +
                "priceBag=" + priceBag +
                ", countBug=" + countBug +
                '}' + "\n";
    }
}
