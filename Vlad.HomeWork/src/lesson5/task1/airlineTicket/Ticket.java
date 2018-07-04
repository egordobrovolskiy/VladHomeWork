package lesson5.task1.airlineTicket;

public class Ticket {
    private final long id;
    private PassengerInfo passengerInfo;
    private FlightInfo flightInfo;

    Ticket(long id, PassengerInfo passengerInfo, FlightInfo flightInfo) {
        this.id = id;
        this.passengerInfo = passengerInfo;
        this.flightInfo = flightInfo;
    }

    public Long getPrice(){
        return flightInfo.getPrice();
    }

    @Override
    public String toString() {
        return "Ticket{\n" +
                "id = " + id + "\n" +
                "passengerInfo = " + passengerInfo +
                "flightInfo = " + flightInfo +
                '}';
    }
}
