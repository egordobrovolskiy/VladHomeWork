package lesson4.task1.taxi;

import lesson4.task1.taxi.factoryMethod.TariffSelector;
import lesson4.task1.taxi.factoryMethod.TariffType;

public class TaxiRunner {

    private static RidesHistory ridesHistory = new RidesHistory();

    public static void main(String[] args) {

        getRides();

        System.out.println(ridesHistory.getTotalPrice());

        System.out.println(ridesHistory);

    }

    private static void getRides() {
        TariffSelector tariffSelector = TariffSelector.getInstance();
        ridesHistory.addRide(new Ride(2, 34, 25, tariffSelector.getTariff(TariffType.STANDARD)));
        ridesHistory.addRide(new Ride(2, 34, 25, tariffSelector.getTariff(TariffType.STANDARD)));
        ridesHistory.addRide(new Ride(3, 78, 50, tariffSelector.getTariff(TariffType.FAMILY)));
    }
}
