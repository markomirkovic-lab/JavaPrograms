import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class UseDateTimeFormatter {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2022, Month.DECEMBER, 4);
        LocalTime time = LocalTime.of(10, 9, 42);

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyy");
        DateTimeFormatter dateFormatterLong = DateTimeFormatter.ofPattern("EEEE, d LLLL yyyy");

        System.out.println("Date without formatting: " + date);
        //Date without formatting: 2022-12-04

        System.out.println("Date with formatting: " + date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        //Date with formatting: 04.12.2022

        System.out.println("Date with formatting: " + date.format(dateFormatter));
        //Date with formatting: 04.12.2022
        
        System.out.println("Date with 'long' formatting: " + date.format(dateFormatterLong));
        //Date with 'long' formatting: Sunday, 4 December 2022
        //                                     d LLLL     yyyy
        
        System.out.println();

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH-mm-ss");

        System.out.println("Time without formatting: " + time);
        //Time without formatting: 10:09:42

        System.out.println("Time with formatting: " + time.format(timeFormatter));
        //Time with formatting: 10-9-42
    }
}
