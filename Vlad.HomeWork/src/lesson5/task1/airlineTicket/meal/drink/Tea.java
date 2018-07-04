package lesson5.task1.airlineTicket.meal.drink;

public class Tea implements Drink {
    private long price = 23;
    @Override
    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tea{" +
                "price=" + price +
                '}' + "\n";
    }
}
