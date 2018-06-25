package lesson4.task1.taxi.factoryMethod.tariff.impl;

import lesson4.task1.taxi.Ride;
import lesson4.task1.taxi.factoryMethod.tariff.interfaces.Tariff;

public class StandardTariff implements Tariff {
    @Override
    public long calculatePrice(Ride ride) {
        return 30 + 5 * ride.getDistance() + 2 * ride.getDuration();
    }

    @Override
    public String toString() {
        return "StandardTariff";
    }
}
