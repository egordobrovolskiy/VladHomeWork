package lesson5.task1.airlineTicket;
//Свойства: номер полета, место отправки, место прибытия, время отправки, номер места, стоимость.
//Методы: подсчет стоимости.

import java.time.LocalDate;

public class FlightInfo {
    private final long idFlight;
    private String fromCity;
    private String toCity;
    private LocalDate timeFlight;
    private int seat;
    private long price;

    FlightInfo(long idFlight, String fromCity, String toCity, String timeFlight, int seat, long price) {
        this.idFlight = idFlight;
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.timeFlight = LocalDate.parse(timeFlight);
        this.seat = seat;
        this.price = price;
    }

    public long getIdFlight() {
        return idFlight;
    }

    public String getFromCity() {
        return fromCity;
    }

    public String getToCity() {
        return toCity;
    }

    public LocalDate getTimeFlight() {
        return timeFlight;
    }

    public int getSeat() {
        return seat;
    }

    public long getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "FlightInfo{" +
                "idFlight=" + idFlight +
                ", fromCity='" + fromCity + '\'' +
                ", toCity='" + toCity + '\'' +
                ", timeFlight=" + timeFlight +
                ", seat=" + seat +
                ", price=" + price +
                '}' + "\n";
    }
}
