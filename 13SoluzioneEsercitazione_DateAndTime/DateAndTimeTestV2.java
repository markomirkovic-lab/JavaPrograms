import java.time.Instant;
import java.time.LocalTime;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 * Version that uses Instant class.
 * 
 * -- ChatGPT: main differences between LocalDateTime and Instant classes --
 * 
 * In Java, LocalDateTime and Instant are both part of the java.time package,
 * introduced in Java 8, but they serve different purposes and have key
 * differences:
 * 
 * 1. Nature and Use Case:
 * - LocalDateTime: Represents a date and time without any time zone
 * information. It's used when you need to deal with calendar dates and times in
 * a human-readable format without reference to a specific time zone.
 * - Instant: Represents a specific moment in time, counted from the Unix epoch
 * time (January 1, 1970, 00:00:00 UTC). It's used for recording event
 * timestamps and doing calculations with dates and times in a
 * time-zone-agnostic way.
 * 
 * 2. Time Zone Awareness:
 * - LocalDateTime: As the name suggests, it's local and doesn't contain any
 * information about the time zone or offset from UTC/GMT.
 * - Instant: Always in UTC (Coordinated Universal Time), making it useful for
 * global time-based operations.
 * 
 * 3. Representation:
 * - LocalDateTime: Stores the date and time like 2024-01-31T10:15:30
 * (Year-Month-DayTHour:Minute:Second).
 * - Instant: Stores a single point in time with precision up to nanoseconds
 * from the epoch time.
 * 
 * 4. Interoperability with Time Zones:
 * - LocalDateTime can be converted to a time zone-specific ZonedDateTime by
 * applying a ZoneId.
 * - Instant can be converted to ZonedDateTime using a ZoneId, resulting in a
 * date-time with time zone information.
 * 
 * 5. Use in APIs:
 * - LocalDateTime is often used in applications where time zone is implicitly
 * understood or not required, like local desktop applications, calendar
 * systems, etc.
 * - Instant is preferred in global applications, logging, network protocols,
 * and any place where an event's time needs to be recorded in a universal
 * format.
 * 
 * 6. Adjusting and Parsing:
 * - LocalDateTime provides a rich API for manipulating dates and times, such as
 * adding or subtracting days, months, etc., without considering time zone
 * complexities.
 * - Instant is more limited in date-time manipulation since it represents a
 * precise moment in the UTC timeline.
 */
public class DateAndTimeTestV2 {
    private static Scanner scanner = new Scanner(System.in);

    private static int readIntInRange(int min, int max, String message) {
        System.out.print(message);
        int value;
        do {
            while (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.print("Invalid value. Please retry: ");
            }
            value = scanner.nextInt();
            scanner.nextLine();
            if (value < min || value > max)
                System.out.print("Value not in range. Please retry: ");
        } while (value < min || value > max);
        return value;
    }

    private static boolean isValid(int year, int month, int day) {
        return switch (month) {
            case 11, 4, 6, 9 -> day <= 30;
            case 2 -> day <= 28; // Ignore leap years
            default -> day <= 31;
        };
    }

    public static void main(String[] args) {
        Instant today = Instant.now();

        DateTimeFormatter dateFormatterLong = DateTimeFormatter.ofPattern("EEEE, d LLLL yyyy - HH:mm:ss")
                .withZone(ZoneId.systemDefault());
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy").withZone(ZoneId.systemDefault());

        System.out.println("Today: " + dateFormatterLong.format(today));

        int day = readIntInRange(1, 31, "Insert a day: ");
        int month = readIntInRange(1, 12, "Insert a month: ");
        int year = readIntInRange(1900, 2200, "Insert a year: ");

        int hour = readIntInRange(0, 23, "Insert an hour: ");
        int minute = readIntInRange(0, 59, "Insert a minute: ");
        int second = readIntInRange(0, 59, "Insert a second: ");

        scanner.close();

        if (!isValid(year, month, day)) {
            System.out.println("The date is not valid.");
            return;
        }

        ZonedDateTime zonedDateTime = ZonedDateTime.of(year, month, day, hour, minute, second, 0,
                ZoneId.systemDefault());
        Instant instant = zonedDateTime.toInstant();
        // Oppure
        // Instant instant = Instant.parse(year + "-" + month + "-" + day + "T" + hour +
        // ":" + minute + ":" + second + "Z");

        System.out.println(zonedDateTime.getYear() + " is a leap year? " + (Year.isLeap(year) ? "Yes" : "No"));
        System.out.println(dateFormatter.format(zonedDateTime) + " ia a " + zonedDateTime.getDayOfWeek());
        LocalTime localTime = zonedDateTime.toLocalTime();
        System.out.println("The inserted time " + localTime + " is before noon? "
                + (localTime.isBefore(LocalTime.NOON) ? "Yes" : "No"));

        ZonedDateTime summerSolsticeZonedDateTime = ZonedDateTime.of(year, 6, 21, 0, 0, 0, 0,
                ZoneId.systemDefault());
        Instant summerSolstice = summerSolsticeZonedDateTime.toInstant();

        ZonedDateTime winterSolsticeZonedDateTime = ZonedDateTime.of(year, 12, 21, 0, 0, 0, 0,
                ZoneId.systemDefault());
        Instant winterSolstice = winterSolsticeZonedDateTime.toInstant();

        if (instant.isBefore(summerSolstice)) {
            System.out.println(dateFormatter.format(instant) + " is before the summer solstice.");
            System.out.println("Days until the summer solstice: " + instant.until(summerSolstice, ChronoUnit.DAYS));
        } else if (instant.isBefore(winterSolstice)) {
            System.out.println(dateFormatter.format(instant) + " is before the winter solstice.");
            System.out.println("Days until the winter solstice: " +
                    instant.until(winterSolstice, ChronoUnit.DAYS));
        }

        ZonedDateTime newYearZonedDateTime = ZonedDateTime.of(year + 1, 1, 1, 0, 0, 0, 0,
                ZoneId.systemDefault());
        Instant newYear = newYearZonedDateTime.toInstant();

        long secondsToNewYear = instant.until(newYear, ChronoUnit.SECONDS);
        long daysToNewYear = instant.until(newYear, ChronoUnit.DAYS);
        long remainingSeconds = secondsToNewYear - daysToNewYear * 24 * 60 * 60;
        long hourToNewYear = remainingSeconds / (60 * 60);
        remainingSeconds -= hourToNewYear * 60 * 60;
        long minToNewYear = remainingSeconds / 60;
        remainingSeconds -= minToNewYear * 60;
        long secToNewYear = remainingSeconds;

        System.out.println("Seconds until new year: " + secondsToNewYear);
        System.out.println("This corresponds to:");
        System.out.println("\t" + daysToNewYear + " day(s)");
        System.out.println("\t" + hourToNewYear + " hour(s)");
        System.out.println("\t" + minToNewYear + " minute(s)");
        System.out.println("\t" + secToNewYear + " second(s)");
    }
}