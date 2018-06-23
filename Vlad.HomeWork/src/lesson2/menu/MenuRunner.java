package lesson2.menu;

public class MenuRunner {
    public static void main(String[] args) {
        Dish fish =new Dish("Fish", "Судак на гриле", 65);
        Dish stake = new Dish("Stake", "Стейк из мраморной телятины", 120);
        Dish iceCream = new Dish("Ice Cream", "Домашнее мороженое", 20);
        Dish summer = new Dish("Summer", "Блюдо из ягод", 34);

        Menu dinner = new Menu("Dinner");
        dinner.addDish(fish);
        dinner.addDish(stake);

        Menu desert = new Menu("Desert");
        desert.addDish(summer);
        desert.addDish(iceCream);

        System.out.println("Дешевый ужин: " + dinner.getCheapestDish());
        System.out.println("Дешевый десерт: " + desert.getCheapestDish());
    }
}
