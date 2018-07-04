package lesson5.task1.airlineTicket.meal;

import lesson5.task1.airlineTicket.meal.food.Cake;
import lesson5.task1.airlineTicket.meal.food.Food;
import lesson5.task1.airlineTicket.meal.food.FoodType;
import lesson5.task1.airlineTicket.meal.food.Sandwich;

public class FoodFactory {
    private static FoodFactory instance;

    private FoodFactory() {}

    public static FoodFactory getInstance() {
        if (instance == null) {
            instance = new FoodFactory();
        }
        return instance;
    }

    public Food getFood(FoodType foodType) {
        switch (foodType) {
            case CAKE: return new Cake();
            case SANDWICH: return new Sandwich();
            case NOTHING: return null;
            default: return null;
        }
    }
}
