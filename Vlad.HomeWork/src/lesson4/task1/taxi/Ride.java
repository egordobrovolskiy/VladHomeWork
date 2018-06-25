package lesson4.task1.taxi;

import lesson4.task1.taxi.factoryMethod.tariff.interfaces.Tariff;

public class Ride {
    private final int passenger;
    private final int distance;
    private final int duration;
    private final Tariff tariff;

    Ride(int passenger, int distance, int duration, Tariff tariff) {
        this.passenger = passenger;
        this.distance = distance;
        this.duration = duration;
        this.tariff = tariff;
    }

    long getPrice() {
        return tariff.calculatePrice(this);
    }

    public int getPassenger() {
        return passenger;
    }

    public int getDistance() {
        return distance;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Ride{" +
                "passenger=" + passenger +
                ", distance=" + distance +
                ", duration=" + duration +
                ", tariff=" + tariff +
                ", price=" + getPrice() +
                '}' + "\n";
    }
}
