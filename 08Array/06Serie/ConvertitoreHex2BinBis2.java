/*
Esercizio 6.2 - Convertitore Hex2Bin
Sviluppate un programma che legga un valore esadecimale dalla tastiera e che
stampi a schermo la sequenza binaria corrispondente. Eseguite dei controlli sulla
correttezza del valore esadecimale inserito e ripetete la richiesta in caso d’errore.
L’output dovrà essere simile al seguente (in italico l’inserimento fatto dall’utente):
Valore esadecimale da convertire in binario: 21FA
Valore binario: 0010 0001 1111 1010
*/
import java.util.Scanner;

public class ConvertitoreHex2BinBis2 {

    public static void main(String[] args) {

        // Inizializza lo scanner per leggere dati da tastiera
        Scanner input = new Scanner(System.in);
        
        // Tavola di conversione da esadecimale a binario (per le singole cifre esadecimali)
		String[] hex2Bin = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000",
        "1001", "1010", "1011", "1100", "1101", "1110", "1111" };


        boolean valoreValido;
        String valoreBinario;

        do {

            System.out.print("Inserici un valore esadecimale: ");
            String valoreEsadecimale = input.nextLine().trim().toUpperCase();
            valoreValido = true;
            valoreBinario = "";

            for(char charElement : valoreEsadecimale.toCharArray()) {

                int index = -1;

                if(charElement >= '0' && charElement <= '9') {

                    index = charElement - '0';

                } else if(charElement >= 'A' && charElement <= 'F') {

                    index = 10 + (charElement - 'A');

                } 
                
                if (index == -1) {

                    System.out.println("Valore hex non valido. Riprova: ");
                    valoreValido = false;
                    break;
                }

                valoreBinario += hex2Bin[index] + " ";
            }          

        } while(!valoreValido);

        System.out.println("Valore binario: " + valoreBinario);

        input.close();

    }
    
}
