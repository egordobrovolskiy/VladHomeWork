package lesson5.task1.airlineTicket.meal.drink;

public class Coffee implements Drink {
    private long price = 34;

    @Override
    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "price=" + price +
                '}' + "\n";
    }
}
