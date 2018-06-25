package lesson4.task1.taxi.factoryMethod;

import lesson4.task1.taxi.factoryMethod.tariff.impl.FamilyTariff;
import lesson4.task1.taxi.factoryMethod.tariff.impl.StandardTariff;
import lesson4.task1.taxi.factoryMethod.tariff.interfaces.Tariff;

public class TariffSelector {
    private static TariffSelector instance = new TariffSelector();

    private TariffSelector() {
    }

    public static TariffSelector getInstance() {
        return instance;
    }
    public Tariff getTariff(TariffType tariffType) {
        switch (tariffType) {
            case FAMILY: return new FamilyTariff();
            case STANDARD: return new StandardTariff();
            default: return null;
        }
    }
}
