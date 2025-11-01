/*
9.6 Numero
Scrivete un programma che legga, nella variabile x, un numero immesso dall’utente.
In seguito il valore contenuto in x dovrà cambiare nel modo seguente:
- se il numero è pari il valore dovrà essere diviso per 2.
- se è dispari dovrà essere moltiplicato per 3 e gli si dovrà sottrarre 1.
Infine si dovrà stampare il risultato finale ottenuto.
*/
import java.util.Scanner;

public class Es09_6_Numero {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero;
        
        System.out.print("Inserisci un numero: ");
        numero = input.nextInt();
        System.out.println("Numero: " + numero);

        if(numero % 2 == 0) {
            numero /= 2;
        } else {
            numero = (numero * 3) - 1;
          }
        
        System.out.println("Nuovo numero: " + numero);

        input.close();
    }
    
}
