package lesson5.task1.airlineTicket.meal.food;

public class Sandwich implements Food {
    private long price = 65;

    @Override
    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "price=" + price +
                '}' + "\n";
    }
}
