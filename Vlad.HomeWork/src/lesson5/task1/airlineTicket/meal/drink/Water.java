package lesson5.task1.airlineTicket.meal.drink;

public class Water implements Drink {
    private long price = 12;


    @Override
    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Water{" +
                "price=" + price +
                '}' + "\n";
    }
}
