package lesson8.task3.iterableMenu;

public class Dish {
    private final String name;
    private final String description;
    private long price;

    Dish(String name, String description, long price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    long getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
