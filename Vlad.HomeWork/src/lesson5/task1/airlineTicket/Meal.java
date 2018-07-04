package lesson5.task1.airlineTicket;
//Свойства: тип еды, с напитком или без, стоимость.
//Методы: подсчет стоимости.

import lesson5.task1.airlineTicket.meal.DrinkFactory;
import lesson5.task1.airlineTicket.meal.FoodFactory;
import lesson5.task1.airlineTicket.meal.drink.Drink;
import lesson5.task1.airlineTicket.meal.drink.DrinkType;
import lesson5.task1.airlineTicket.meal.food.Food;
import lesson5.task1.airlineTicket.meal.food.FoodType;

public class Meal {
    private Food food;
    private Drink drink;

    Meal(FoodType foodType, DrinkType drinkType) {
        this.food = FoodFactory.getInstance().getFood(foodType);
        this.drink = DrinkFactory.getInstance().getDrink(drinkType);
    }

    long getPriceMeal(){
        long foodPrice = 0;
        long drinkPrice = 0;
        if (food != null) {
            foodPrice = food.getPrice();
        }
        if (drink != null) {
            drinkPrice = drink.getPrice();
        }
        return foodPrice + drinkPrice;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "food=" + food +
                ", drink=" + drink +
                '}' + "\n";
    }
}
