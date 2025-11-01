
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

public class Es6_2_ConvertitoreHex2BinV3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 2^4 bit = 16 binary positions
        String[] binary = {
                "0000",
                "0001",
                "0010",
                "0011",
                "0100",
                "0101",
                "0110",
                "0111",
                "1000",
                "1001",
                "1010",
                "1011",
                "1100",
                "1101",
                "1110",
                "1111"
        };

        char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        System.out.println("Inserisci un numero esadecimale: ");

        String hexInput = input.nextLine();
        hexInput = hexInput.trim().toUpperCase();

        StringBuilder binaryNumber = new StringBuilder(); // Usiamo StringBuilder per efficienza

        // Itera su ogni carattere dell'input esadecimale
        for (int j = 0; j < hexInput.length(); j++) {

            char currentChar = hexInput.charAt(j);

            // Trova l'indice corrispondente nella mappa hex
            for (int i = 0; i < hex.length; i++) {
                if (currentChar == hex[i]) {
                    binaryNumber.append(binary[i]); // Aggiungi il valore binario senza spazi
                    break;
                }
            }
        }

        System.out.println("Numero binario: " + binaryNumber.toString());

        input.close();
    }
}