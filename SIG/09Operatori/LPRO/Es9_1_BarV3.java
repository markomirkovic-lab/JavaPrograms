/*
9.1 Bar
Trasformate in codice il seguente Activity diagram (vedi pdf)
*/
import java.util.Scanner;

public class Es9_1_BarV3 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int eta;

        System.out.print("Immeti la tua eta': ");
        eta = input.nextInt();
        input.nextLine();

        System.out.println(
            eta < 18 ? "Troppo giovane per bere alcolici" :
                eta < 65 ? "Bevi moderatamente" : "Hai diritto ad uno sconto"); 

        input.close();
    }
    
}
