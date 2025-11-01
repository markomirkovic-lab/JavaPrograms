import java.util.Scanner;

public class SwitchNuovoSeasonFreccia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a month: ");
        int month = input.nextInt();
        input.close();

        String season;

        switch (month) {
            case 12, 1, 2 -> season = "winter";
            case 3, 4, 5 -> season = "spring";
            case 6, 7, 8 -> season = "summer";
            case 9, 10, 11 -> season = "autumn";
            default -> season = "not identifiable";
        }

        System.out.println("The season is " + season + ".");
    }
}
