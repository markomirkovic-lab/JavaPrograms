import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Currency;

public class UseNumberFormat {
    public static void main(String[] args) {
        NumberFormat numberFormat = NumberFormat.getInstance();

        // Limit the maximum number of digits in the fraction portion of the number
        double value = 1. / 3;
        double value2 = 1. / 4;
        System.out.println("Value without formatting: " + value);
        System.out.println("Value without formatting: " + value2);
        //Value without formatting: 0.3333333333333333
        //Value without formatting: 0.25

        numberFormat.setMaximumFractionDigits(4);
        System.out.println("Value with formatting (max 4 fraction digits): " + numberFormat.format(value));
        System.out.println("Value with formatting (max 4 fraction digits): " + numberFormat.format(value2));
        //Value with formatting (max 4 fraction digits): 0.3333
        //Value with formatting (max 4 fraction digits): 0.25
        System.out.println();

        // Set the minimum number of digits in the fraction portion of the number
        double grade = 4.5;
        System.out.println("Grade of this exercise: " + grade);
        //Grade of this exercise: 4.5

        numberFormat.setMinimumFractionDigits(2);
        System.out.println(
                "Grade of this exercise with number format (min 2 fraction digits): " + numberFormat.format(grade));
        //Grade of this exercise with number format (min 2 fraction digits): 4.50
        System.out.println();

        // Set rounding mode
        numberFormat.setMaximumFractionDigits(2);
        double mean = 3.276;
        System.out.println("Mean with 'default' rounding: " + numberFormat.format(mean));
        //Mean with 'default' rounding: 3.28


        //mean = 3.276
        numberFormat.setRoundingMode(RoundingMode.CEILING);
        System.out.println("Mean with CEILING rounding: " + numberFormat.format(mean));
        //Mean with CEILING rounding: 3.28
        numberFormat.setRoundingMode(RoundingMode.FLOOR);
        System.out.println("Mean with FLOOR rounding: " + numberFormat.format(mean));
        //Mean with FLOOR rounding: 3.27
        System.out.println();

        // Grouping digits
        numberFormat.setMinimumFractionDigits(0);

        long longValue = 23_500_390_800_380L;
        /*
        Literal Value 23_500_390_800_380L:
        The value 23_500_390_800_380 is written using underscores (_) to improve readability. 
        In Java, underscores can be used in numeric literals to separate digits (introduced in Java 7). 
        These underscores are ignored by the compiler, so the actual value is 23500390800380.
        The trailing L or l (case-insensitive) denotes that the number is a long literal. 
        Without the L, the compiler treats the numeric literal as an int by default, 
        which may cause errors if the value exceeds the int range.
        */

        System.out.println("Value without grouping digits: " + longValue);
        //Value without grouping digits: 23500390800380

        // The grouping character used depends on the Locale used
        System.out.println("Value with grouping digits: " + numberFormat.format(longValue));
        //Value with grouping digits: 23?500?390?800?380

        // Grouping digits can be turned off
        numberFormat.setGroupingUsed(false);
        System.out.println("Value with grouping digits turned off: " + numberFormat.format(longValue));
        //Value with grouping digits turned off: 23500390800380
        System.out.println();

        // Work with currencies
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        System.out.println("Total amount of the bank account: " + currencyFormat.format(123.45));
        //Total amount of the bank account: CHF 123.45
        currencyFormat.setCurrency(Currency.getInstance("EUR"));
        System.out.println("Total amount of the bank account: " + currencyFormat.format(123.45));
        //Total amount of the bank account: ? 123.45
    }
}
