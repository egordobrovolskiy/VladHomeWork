package lesson4.task1.taxi.factoryMethod.tariff.impl;

import lesson4.task1.taxi.Ride;
import lesson4.task1.taxi.factoryMethod.tariff.interfaces.Tariff;

public class FamilyTariff implements Tariff {
    @Override
    public long calculatePrice(Ride ride) {
        return 50 + 20 * ride.getDistance() /  ride.getPassenger();
    }

    @Override
    public String toString() {
        return "FamilyTariff";
    }
}
