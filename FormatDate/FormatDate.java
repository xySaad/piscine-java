import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatDate {

    public static String formatToFullText(LocalDateTime dateTime) {
        if (dateTime == null)
            return null;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("'Le' d LLL 'de l''an' yyyy à H'h'm'm et' s's'",
                Locale.FRENCH);
        return dateTime.format(formatter);
    }

    public static String formatSimple(LocalDate date) {
        if (date == null)
            return null;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("LLLL d yy", Locale.ITALY);
        return date.format(formatter);

    }

    public static String formatIso(LocalTime time) {
        if (time == null)
            return null;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return time.format(formatter);
    }

}
