import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

class Gigasecond {

    LocalDate birthDate;
    LocalDateTime birthDateTime;

    Gigasecond(LocalDate birthDate) {
        this.birthDate = birthDate;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    Gigasecond(LocalDateTime birthDateTime) {
        this.birthDateTime = birthDateTime;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    LocalDateTime getDate() {
        if (birthDateTime == null) {
            birthDateTime = LocalDateTime.of(birthDate, LocalTime.MIDNIGHT);
        }
        LocalDateTime giga = birthDateTime.plusSeconds(1000000000);
        return giga;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
