package lesson5.task1.airlineTicket.meal;

import lesson5.task1.airlineTicket.meal.drink.*;

public class DrinkFactory {
    private static DrinkFactory instance;

    private DrinkFactory() {}

    public static DrinkFactory getInstance() {
        if (instance == null) {
            instance = new DrinkFactory();
        }
        return instance;
    }

    public Drink getDrink(DrinkType drinkType) {
        switch (drinkType) {
            case TEA: return new Tea();
            case BEAR: return new Bear();
            case COFFEE: return new Coffee();
            case WATER: return new Water();
            case NOTHING: return null;
            default: return null;
        }
    }
}
