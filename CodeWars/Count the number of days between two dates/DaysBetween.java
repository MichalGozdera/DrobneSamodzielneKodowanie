/**
 * Count the number of days between two dates:

 Examples:

 There are 5021 days between 1987.1.16 and 2000.10.15

 Good Luck!
 */

import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
public class DaysBetween {
    public static long getDaysAlive(int year, int month, int day, int year2, int month2, int day2) {

        LocalDate start=LocalDate.of(year,month,day);
        LocalDate end=LocalDate.of(year2,month2,day2);
        return ChronoUnit.DAYS.between(start, end);
    }
}