/*
7.4 Esercizi di consolidamento
1. Dichiarate e istanziate l’oggetto in di tipo Scanner
2. Stampate a schermo “Inserisci il tuo nome e il cognome: “ senza andare a 
capo
3. Leggete e memorizzate in una variabile ciò che ha immesso l’utente.
4. Estraete il nome e il cognome, in singole variabili.
5. Stampate a schermo il nome, andate a capo, stampate il cognome.
6. Dichiarate una variabile intera e inizializzatela col valore 98
7. Stampatela come se fosse un carattere, che lettera viene stampata?
8. Dichiarate e inizializzate con il valore 3.14 una variabile a precisione doppia
9. Dichiarate la variabile raggio e la variabile area di tipo float
10. Stampate a schermo “Introdurre il raggio: “ senza andare a capo
11. Leggete quanto immesso dall’utente, memorizzandolo nella variabile raggio
12. Calcolate l’area del cerchio e memorizzatela nella variabile area. Per il pi greco usate 
la variabile definita al punto 8. Stampate la variabile area.
*/
import java.util.Scanner;

public class Es7_4_Consolidamento {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 2. Stampate a schermo “Inserisci il tuo nome e il cognome: “ senza andare a capo
        System.out.print("Inserisci il tuo nome e il cognome: ");
        // 3. Leggete e memorizzate in una variabile ciò che ha immesso l’utente.
        String nomeCognome = input.nextLine();
        nomeCognome = nomeCognome.trim();
        
        // 4. Estraete il nome e il cognome, in singole variabili.
        String nome = nomeCognome.substring(0, nomeCognome.indexOf(' '));
        nome = nome.trim();
        String cognome = nomeCognome.substring(nomeCognome.indexOf(' ')+1, nomeCognome.length());
        cognome = cognome.trim();
        
        // 5. Stampate a schermo il nome, andate a capo, stampate il cognome.
        System.out.println(nome);
        System.out.println(cognome);
              
        // 6. Dichiarate una variabile intera e inizializzatela col valore 98
        int variabile = 98;    
        
        // 7. Stampatela come se fosse un carattere, che lettera viene stampata?
        System.out.println((char) variabile);//b
        
        // 8. Dichiarate e inizializzate con il valore 3.14 una variabile a precisione doppia
        double pi = 3.14;        
        
        // 9. Dichiarate la variabile raggio e la variabile area di tipo float
        float raggio;
        float area;     
        
        // 10. Stampate a schermo “Introdurre il raggio: “ senza andare a capo
        System.out.print("Introdurre il raggio: ");
        
        // 11. Leggete quanto immesso dall’utente, memorizzandolo nella variabile raggio
        raggio = input.nextFloat();   
        input.nextLine();     
        
        // 12. Calcolate l’area del cerchio e memorizzatela nella variabile area. Per il pi greco usate 
        // la variabile definita al punto 8. Stampate la variabile area.

        area = raggio * raggio * (float) pi;
        System.out.println("Area: " + area);

        /*
        Inserisci il tuo nome e il cognome: Marko Mirkovic

        Marko
        Mirkovic
        b
        Introdurre il raggio:
        7
        Area: 153.86
        */

                
    }
    
}
