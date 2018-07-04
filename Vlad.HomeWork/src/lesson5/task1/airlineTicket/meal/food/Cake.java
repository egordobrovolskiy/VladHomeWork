package lesson5.task1.airlineTicket.meal.food;

public class Cake implements Food {
    private long price = 45;
    @Override
    public long getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "price=" + price +
                '}' + "\n";
    }
}
