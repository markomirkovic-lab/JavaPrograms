import java.util.Scanner;

public class SwitchTradizionaleMeseGiorni {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci un mese: ");
        int mese = input.nextInt();
        input.close();

        int giorni = 0;
        switch (mese) {
            case 4:
            case 6:
            case 9:
            case 11:
                giorni = 30;
                break;
            case 2:
                giorni = 28; // Ignorando gli anni bisestili
                break;
            default:
                if (mese >= 1 && mese <= 12) {
                    giorni = 31;
                } else {
                    System.out.println("Mese non valido!");
                }
        }
        System.out.println("Il mese " + mese + " ha " + giorni + " giorni.");
    }
}