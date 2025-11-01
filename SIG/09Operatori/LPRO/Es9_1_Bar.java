/*
9.1 Bar
Trasformate in codice il seguente Activity diagram (vedi pdf)
*/
import java.util.Scanner;

public class Es9_1_Bar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int eta;

        System.out.print("Immeti la tua eta': ");
        eta = input.nextInt();

        if(eta < 18) {
            System.out.println("Troppo giovane per bere alcolici");
        } else if(eta >= 18 && eta < 65) {
            System.out.println("Puoi bere alcolici moderatamente");
        } else {
            System.out.println("Hai diritto ad uno sconto");
        }
        
    }
    
}
