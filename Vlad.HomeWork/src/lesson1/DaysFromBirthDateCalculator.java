package lesson1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysFromBirthDateCalculator {
    public static void main(String[] args) {
        System.out.println(daysFromBirthDate("1972-12-28"));
        System.out.println(daysFromBirthDate("2005-05-01"));
    }

    private static Long daysFromBirthDate(String birthDateStrings) {
        LocalDate birthDay = LocalDate.parse(birthDateStrings);
        LocalDate toDay = LocalDate.now();
        return birthDay.until(toDay, ChronoUnit.DAYS);
    }
}
