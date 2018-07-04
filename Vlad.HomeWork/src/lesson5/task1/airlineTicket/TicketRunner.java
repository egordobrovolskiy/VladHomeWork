package lesson5.task1.airlineTicket;

import lesson5.task1.airlineTicket.meal.drink.DrinkType;
import lesson5.task1.airlineTicket.meal.food.FoodType;

public class TicketRunner {
    public static void main(String[] args) {

        FlightInfo flingUkraineTurkey = new FlightInfo(44676, "Ukraine", "Turkey", "2018-03-12", 2, 567);
        PassengerInfo passengerInfo = new PassengerInfo("Egor", "Dobr", "4546456");

        Ticket ticket = new Ticket(2343, passengerInfo, flingUkraineTurkey);

        System.out.println(ticket + "\n Total price = " + ticket.getPrice());
        System.out.println("===========================================");

        Ticket ticket1  = new VipTicket(657567, passengerInfo, flingUkraineTurkey, new Baggage(32, 2), new Meal(FoodType.SANDWICH, DrinkType.WATER));
        System.out.println(ticket1 + "\n Total price = " + ticket1.getPrice());
    }
}
