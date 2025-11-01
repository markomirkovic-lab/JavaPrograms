import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 * Version that uses LocalDate, LocaTime and LocalDateTime classes.
 */
public class DateAndTimeTestV1 {
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
        LocalDateTime today = LocalDateTime.now();

        DateTimeFormatter dateFormatterLong = DateTimeFormatter.ofPattern("EEEE, d LLLL yyyy - HH:mm:ss");
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        System.out.println("Today: " + today.format(dateFormatterLong));

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

        LocalDateTime localDateTime = LocalDateTime.of(year, month, day, hour, minute, second);
        LocalDate localDate = localDateTime.toLocalDate();
        LocalTime localTime = localDateTime.toLocalTime();

        System.out.println(localDate.getYear() + " is a leap year? " + (localDate.isLeapYear() ? "Yes" : "No"));
        System.out.println(localDate.format(dateFormatter) + " ia a " + localDate.getDayOfWeek());
        System.out.println(
                "The inserted time " + localTime + " is before noon? "
                        + (localTime.isBefore(LocalTime.NOON) ? "Yes" : "No"));

        LocalDate summerSolstice = LocalDate.of(year, Month.JUNE, 21);
        LocalDate winterSolstice = LocalDate.of(year, Month.DECEMBER, 21);

        if (localDate.isBefore(summerSolstice)) {
            System.out.println(localDate.format(dateFormatter) + " is before the summer solstice.");
            System.out.println("Days until the summer solstice: " + localDate.until(summerSolstice, ChronoUnit.DAYS));
        } else if (localDate.isBefore(winterSolstice)) {
            System.out.println(localDate.format(dateFormatter) + " is before the winter solstice.");
            System.out.println("Days until the winter solstice: " + localDate.until(winterSolstice, ChronoUnit.DAYS));
        }

        LocalDateTime newYear = LocalDateTime.of(year + 1, 1, 1, 0, 0, 0);
        long secondsToNewYear = localDateTime.until(newYear, ChronoUnit.SECONDS);
        long daysToNewYear = localDateTime.until(newYear, ChronoUnit.DAYS);
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