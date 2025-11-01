/*
Esercizio 3 - Prodotto numeri dispari
Scrivete un programma che richieda all’utente l’immissione di due numeri interi e che
calcoli e mostri a schermo il prodotto di tutti i numeri dispari compresi nell’intervallo
desiderato. La richiesta dovrà essere ripetuta nel caso in cui il secondo numero
inserito sia minore del primo.
Assicuratevi che il tipo di dato utilizzato per rappresentare il prodotto sia quello più
adatto.
L’output dovrà essere simile al seguente (in italico l’inserimento fatto dall’utente):
Valore minimo: -5
Valore massimo: -15
Massimo non valido. Riprova: 22
Prodotto dei numeri dispari tra -5 e 22: -206239658625
*/
import java.util.Scanner;

public class Es3ProdottoNumeriDispari {

    static final int VALORE_MINIMO = -50;
    static final int VALORE_MASSIMO = 50;
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String richiestaStandard = "Inserire due numeri interi";
        String richiestaRipetuta = "Il numero inserito non e' un intero. Inserire numeri interi.";
        String richiestaRipetutaErroreString = "Massimo non valido. Riprova: ";
        String valoreMinimoString = "Valore minimo: ";
        String valoreMassimoString = "Valore massimo: ";

        int valoreMinimo;
        int valoreMassimo;


        System.out.println(richiestaStandard + "\n");

        System.out.print(valoreMinimoString);
        valoreMinimo = scanner.nextInt();

        System.out.print(valoreMassimoString);
        valoreMassimo = scanner.nextInt();


        while (valoreMassimo < valoreMinimo){
            System.out.print(richiestaRipetutaErroreString);
            scanner.nextLine();
            valoreMassimo = scanner.nextInt();
        }

        /*
            while (!scanner.hasNextInt()) {
            System.out.println(richiestaRipetuta);
            scanner.nextLine();
        }
         */

        
        scanner.close();

        long numeroMoltiplicato = 1;

        for(int i = valoreMinimo; i<=valoreMassimo; i++){
            if(Math.abs(i%2)==1){
                numeroMoltiplicato *= i;
            }
            
        }


        System.out.println(valoreMinimoString + valoreMinimo);
        System.out.println(valoreMassimoString + valoreMassimo);

        //For



        

        System.out.println("Prodotto tra numeri dispari tra " + valoreMinimo + " e "  + valoreMassimo + ": " + numeroMoltiplicato);
    }
    
}
