
import java.util.Scanner;

public class Tutorial_7_2 {

    public static void main(String[] args) {
        Scanner leggi = new Scanner(System.in);
        
        int i=0;
        double d=0.0;
        String s="";
        String p="";

        System.out.print("Inserisci una parola: ");
        p=leggi.next();        
        leggi.nextLine();
        
        System.out.print("Inserisci una frase: ");              
        s=leggi.nextLine();
        
        System.out.print("Inserisci un intero: ");
        i=leggi.nextInt(); 
        leggi.nextLine();
        
        System.out.print("Inserisci un double: ");
        d=leggi.nextDouble();        
        leggi.nextLine();
        
        System.out.println("Hai inserito: " + i + " " + d + " " + p + " " + s);

        leggi.close();

        /*
        Inserisci una parola: Boh
        Inserisci una frase: Bella giornata
        Inserisci un intero: 7
        Inserisci un double: 7.7
        Hai inserito: 7 7.7 Boh Bella giornata
        */
    }
}
