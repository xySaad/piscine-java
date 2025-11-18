import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ParseDate {

    public static LocalDateTime parseIsoFormat(String stringDate) {
        if (stringDate == null)
            return null;

        return LocalDateTime.parse(stringDate);
    }

    public static LocalDate parseFullTextFormat(String stringDate) {
        if (stringDate == null)
            return null;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE d LLLL y");
        return LocalDate.parse(stringDate, formatter);
    }

    public static LocalTime parseTimeFormat(String stringDate) {
        if (stringDate == null)
            return null;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h 'hours' B, m 'minutes and' s 'seconds'");
        return LocalTime.parse(stringDate, formatter);
    }

}
