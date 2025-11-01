import java.util.Scanner;

public class Calcolatrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double risultato = 0;

        System.out.print("Inserisci il primo numero: ");
        double numero1 = scanner.nextDouble();
        scanner.nextLine();
        

        System.out.print("Inserisci l'operatore (+, -, *, /): ");
        char operatore = scanner.nextLine().charAt(0);

        System.out.print("Inserisci il secondo numero: ");
        double numero2 = scanner.nextDouble();

        scanner.close();

        if (operatore == '/' && numero2 == 0) {
            System.out.println("Errore: divisione per zero!");
        } else {
            switch (operatore) {
                case '+':
                    risultato = numero1 + numero2;
                    break;
                case '-':
                    risultato = numero1 - numero2;
                    break;
                case '*':
                    risultato = numero1 * numero2;
                    break;
                case '/':
                    risultato = numero1 / numero2;
                    break;
            }
            System.out.println("Operazione: " + numero1 + " " + operatore + " " + numero2 + " = " + risultato);
        }
    }
}