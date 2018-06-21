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
        return dishes.stream().sorted((x1, x2) -> (int)(x1.getPrice() - x2.getPrice())).findFirst().get();
    }

    public String getName() {
        return name;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", dishes=" + dishes +
                '}';
    }
}
