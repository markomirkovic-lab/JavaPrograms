import java.util.Scanner;

/**
 * 3 versioni della medesima funzione: una capace di concatenare 3 stringhe, una capace di sommare 3
 * numeri interi e una capace di sommare 3 numeri con la virgola. Queste funzioni sono utilizzate
 * all'interno di un programma che richiede l'immissione da parte dell'utilizzatore di un massimo di
 * 7 inputs. A seconda della sequenza di dati immessi, e quindi della prima apparizione di 3 dati
 * dello stesso tipo, il programma seleziona quale delle 3 funzioni utilizzare e stampa a schermo il
 * risultato.
 */
public class AggregaValoriSimili {

    /**
     * Funzione capace di concatenare tre stringhe
     *
     * @param stringhe array contenente le stringhe da concatenare
     * @return la stringa composta dalla concatenazione delle stringhe presenti nell'array
     */
    private static String concatenaStringhe(String[] stringhe) {
        String risultato = "";
        for (String stringa : stringhe)
            risultato += stringa;
        return risultato;
    }

    /**
     * Funzione capace di sommare tre double
     *
     * @param numDouble array contenente i valori da sommare
     * @return la somma dei valori presenti nell'array
     */
    private static double sommaDouble(double[] numDouble) {
        double somma = 0.;
        for (double numero : numDouble)
            somma += numero;
        return somma;
    }

    /**
     * Funzione capace di sommare tre interi
     *
     * @param numInteri array contenente i valori da sommare
     * @return la somma dei valori presenti nell'array
     */
    private static int sommaInteri(int[] numInteri) {
        int somma = 0;
        for (int numero : numInteri)
            somma += numero;
        return somma;
    }

    /**
     * Procedura main - parte principale del programma
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] stringhe = new String[3];
        double[] numDouble = new double[3];
        int[] numInteri = new int[3];

        int cntStringhe = 0;
        int cntDouble = 0;
        int cntInteri = 0;

        for (int i = 0; i < 7; i++) {
            // Richiede il dato
            System.out.print("Inserire un intero, un double o una stringa: ");
            // Controlla se il valore immesso è di tipo intero
            if (input.hasNextInt()) {
                numInteri[cntInteri++] = input.nextInt();
                // Controlla se sono stati inseriti 3 valori interi
                if (cntInteri == 3) {
                    System.out.println("Somma interi: " + sommaInteri(numInteri));
                    break;
                }
                // Svuota il buffer
                input.nextLine();
                // Controlla se il valore immesso è di tipo double
            } else if (input.hasNextDouble()) {
                numDouble[cntDouble++] = input.nextDouble();
                // Controlla se sono stati inseriti 3 valori double
                if (cntDouble == 3) {
                    System.out.println("Somma double: " + sommaDouble(numDouble));
                    break;
                }
                // Svuota il buffer
                input.nextLine();
            } else {
                // Tutto il resto viene trattato come una stringa

                stringhe[cntStringhe++] = input.nextLine();
                // Controlla se sono stati inserite 3 stringhe
                if (cntStringhe == 3) {
                    System.out.println("Concatena stringhe: " + concatenaStringhe(stringhe));
                    break;
                }
            }
        }
        input.close();
    }
}
