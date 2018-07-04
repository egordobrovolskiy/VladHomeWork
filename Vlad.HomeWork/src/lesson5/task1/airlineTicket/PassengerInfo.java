package lesson5.task1.airlineTicket;

public class PassengerInfo {
    private final String name;
    private final String firstName;
    private final String passportId;

    PassengerInfo(String name, String firstName, String passportId) {
        this.name = name;
        this.firstName = firstName;
        this.passportId = passportId;
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPassportId() {
        return passportId;
    }

    @Override
    public String toString() {
        return "PassengerInfo{" +
                "name='" + name + '\'' +
                ", firstName='" + firstName + '\'' +
                ", passportId='" + passportId + '\'' +
                '}' + "\n";
    }
}
