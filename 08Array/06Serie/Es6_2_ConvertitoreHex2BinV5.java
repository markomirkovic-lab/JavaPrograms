
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

public class Es6_2_ConvertitoreHex2BinV5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Mappa per convertire ogni cifra esadecimale in binario
        String[] binary = {
                "0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111"
        };

        System.out.println("Inserisci un numero esadecimale: ");
        String hexInput = input.nextLine().trim().toUpperCase();

        StringBuilder binaryNumber = new StringBuilder();

        // Itera su ogni carattere dell'input esadecimale
        for (int i = 0; i < hexInput.length(); i++) {
            char hexChar = hexInput.charAt(i);

            // Trova l'indice corrispondente nella mappa
            int index;
            if (hexChar >= '0' && hexChar <= '9') {
                index = hexChar - '0'; // Converti '0'-'9' in 0-9
            } else if (hexChar >= 'A' && hexChar <= 'F') {
                index = 10 + (hexChar - 'A'); // Converti 'A'-'F' in 10-15
            } else {
                System.out.println("Carattere non valido: " + hexChar);
                return; // Esci se il carattere non è valido
            }

            // Aggiungi il valore binario corrispondente
            binaryNumber.append(binary[index]);
        }

        System.out.println("Numero binario: " + binaryNumber.toString());

        input.close();
    }
}