package lesson5.task1.airlineTicket.meal.drink;

public class Bear implements Drink {
    private long price = 40;

    @Override
    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bear{" +
                "price=" + price +
                '}' + "\n";
    }
}
