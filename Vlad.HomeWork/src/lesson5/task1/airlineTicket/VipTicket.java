package lesson5.task1.airlineTicket;

public class VipTicket extends Ticket {
    private Baggage baggage;
    private Meal meal;

    VipTicket(long id, PassengerInfo passengerInfo, FlightInfo flightInfo, Baggage baggage, Meal meal) {
        super(id, passengerInfo, flightInfo);
        this.baggage = baggage;
        this.meal = meal;
    }

    @Override
    public Long getPrice() {
        return super.getPrice() + baggage.getBriceBug() + meal.getPriceMeal();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "VipTicket{\n" +
                "baggage = " + baggage +
                "meal = " + meal +
                '}';
    }
}
