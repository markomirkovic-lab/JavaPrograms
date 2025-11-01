import java.util.Scanner;

public class ValoreAssoluto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Inserisci un valore: ");
        int valore = input.nextInt();
        input.close();

        // Calcola il valore assoluto
        int abs = valore < 0 ? -valore : valore;
        System.out.print("Il valore assoluto di ");
        System.out.println(valore + " è " + abs);
    }
}
