/*
10.4 Inversione
Scrivete un programma in grado di rovesciare una stringa, memorizzando il risultato in una 
seconda stringa.
Es: se inseriamo “IALP”, dovremo ottenere in una variabile “PLAI”.
*/
import java.util.Scanner;

public class Es10_4_Inversione {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci una frase: ");
        String frase = input.nextLine();
        frase = frase.trim();

        String fraseRoversciata = "";

        for(int i = frase.length()-1; i >= 0; i--) {

            fraseRoversciata += frase.charAt(i);

        }

        System.out.println("Frase:\t\t\t" + frase);
        System.out.println("Frase rovesciata:\t" + fraseRoversciata);

    }
    
}
