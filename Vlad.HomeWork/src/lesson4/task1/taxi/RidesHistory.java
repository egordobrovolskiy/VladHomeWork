package lesson4.task1.taxi;

import java.util.ArrayList;
import java.util.List;

public class RidesHistory {
    private final List<Ride> rides = new ArrayList<>();

    void addRide(Ride ride) {
        rides.add(ride);
    }

    long getTotalPrice() {
        return rides.stream().map(Ride::getPrice).reduce((long) 0, Long::sum);
    }

    @Override
    public String toString() {
        return "RidesHistory{" +
                "rides=\n" + rides +
                '}';
    }
}
