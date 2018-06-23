package lesson2.menu;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private final String name;
    private List<Dish> dishes = new ArrayList<>();

    Menu(String name) {
        this.name = name;
    }

    void addDish(Dish dish) {
        dishes.add(dish);
    }

    Dish getCheapestDish() {
        return dishes.stream().min((x1, x2) -> (int) (x1.getPrice() - x2.getPrice())).get();
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", dishes=" + dishes +
                '}';
    }
}
