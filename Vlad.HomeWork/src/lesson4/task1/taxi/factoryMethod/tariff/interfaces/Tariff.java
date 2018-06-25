package lesson4.task1.taxi.factoryMethod.tariff.interfaces;

import lesson4.task1.taxi.Ride;

public interface Tariff {
    long calculatePrice(Ride ride);
}
