package lesson8.task3.iterableMenu;

public class MenuRunner {
    public static void main(String[] args) {

        Menu dinner = new Menu("Dinner");
        dinner.addDish(new Dish("Fish", "Судак на гриле", 65));
        dinner.addDish(new Dish("Stake", "Стейк из мраморной телятины", 120));

        Menu desert = new Menu("Desert");
        desert.addDish(new Dish("Summer", "Блюдо из ягод", 34));
        desert.addDish(new Dish("Ice Cream", "Домашнее мороженое", 20));

        System.out.println("Дешевый ужин: " + dinner.getCheapestDish());
        System.out.println("Дешевый десерт: " + desert.getCheapestDish());


        System.out.println("\n*********************   for-each  ********************\n");

        Menu menu = new Menu("Italian summer");
        menu.addDish(new Dish("Margarita", "Italian pizza", 200));
        menu.addDish(new Dish("Carbonara", "Italian pasta", 100));
        menu.addDish(new Dish("Lasagna", "Flat Italian pasta", 130));

        for (Dish dish : menu) {
            System.out.println(dish);
        }


    }
}
