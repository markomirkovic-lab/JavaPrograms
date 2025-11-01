/*
10.1 Bisestile
Programmate un applicazione in grado di calcolare se un anno, immesso dall’utente, è 
bisestile.
Ecco la definizione presa pari pari da wikipedia:
Un anno è bisestile se il suo numero è divisibile per 4, con l'eccezione degli anni secolari 
(quelli divisibili per 100) che sono bisestili solo se divisibili per 400.
*/
import java.util.Scanner;

public class Es10_1_BisestileV2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int anno;
        
        System.out.println("Inserici un anno: ");
        anno = input.nextInt();

        if(anno % 4 == 0) {
            
            if(anno % 100 != 0) {
                System.out.println("L'anno " + anno + " e' bisestile");
            } else if(anno % 400 == 0) {
                System.out.println("L'anno " + anno + " e' bisestile");
            } else {
                System.out.println("L'anno " + anno + " non e' bisestile");
            }
        } else {
            System.out.println("L'anno " + anno + " non e' bisestile");
        }
    }
    
}
