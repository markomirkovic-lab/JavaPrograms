import java.util.Scanner;

public class SwitchNuovoSeasonEspressione {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a month: ");
        int month = input.nextInt();
        input.close();

        String season = switch (month) {
            case 12, 1, 2 -> "winter";
            case 3, 4, 5 -> "spring";
            case 6, 7, 8 -> "summer";
            case 9, 10, 11 -> "autumn";
            default -> "not identifiable";
        };// IMPORTANT TO CLOSE WITH ";"

        System.out.println("The season is " + season + ".");
    }
}
