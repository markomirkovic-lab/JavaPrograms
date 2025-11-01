import java.util.Arrays;

public class MathRandomExplained {
    
    /*
    Math.random(): Genera un numero decimale casuale compreso tra 0 (incluso) e 1 (escluso).
    Moltiplicazione per (max - min + 1): Moltiplicando per (max - min + 1) (in questo caso, 101), 
    si ottiene un numero compreso tra 0 (incluso) e 101 (escluso).
    Casting a (int): Convertendo il risultato in un intero, si ottiene un numero compreso tra 
    0 e 100 (inclusi).
    Aggiunta di min: Poiché min è 0, non cambia il risultato, ma rende la funzione più 
    generica per altri range.

    Spiegazione:
    Questa funzione genera un numero intero casuale compreso tra min e max (inclusi). 
    Ecco come funziona:

    1. Math.random():
    Math.random() è un metodo in Java che restituisce un numero decimale (double) casuale 
    compreso tra 0 (incluso) e 1 (escluso).

    Esempi di output: 0.123, 0.456, 0.789, ecc.

    2. Moltiplicazione per (max - min + 1):
    (max - min + 1) calcola l'ampiezza del range di numeri che vogliamo generare, 
    includendo sia min che max.

    Ad esempio, se min = 5 e max = 10, allora (max - min + 1) = 10 - 5 + 1 = 6.

    Moltiplicando Math.random() per (max - min + 1), otteniamo un numero compreso 
    tra 0 (incluso) e (max - min + 1) (escluso).

    Esempio: Se Math.random() restituisce 0.999, allora 0.999 * 6 = 5.994.

    3. Casting a (int):
    Il casting a (int) tronca la parte decimale del numero, convertendolo in un intero.

    Nell'esempio precedente, 5.994 diventa 5.

    Questo significa che il risultato sarà un numero intero compreso tra 0 e (max - min) (inclusi).

    4. Aggiunta di min:
    Aggiungendo min al risultato, si sposta il range da [0, (max - min)] a [min, max].

    Nell'esempio precedente, se min = 5, allora 5 + 5 = 10.

    Quindi, il risultato finale sarà un numero intero compreso tra min e max (inclusi).

    Esempio con valori:
    Supponiamo di chiamare la funzione con min = 5 e max = 10:

    int randomValue = getRandomInt(5, 10);
    Passaggi:
    Math.random() genera un numero, ad esempio 0.723.

    (max - min + 1) = 10 - 5 + 1 = 6.

    0.723 * 6 = 4.338.

    (int) 4.338 = 4 (troncamento della parte decimale).

    4 + 5 = 9.

    Il risultato finale è 9, che è compreso tra 5 e 10.

    Perché +1?
    Il +1 è fondamentale per includere il valore massimo (max) nel range. 
    Senza +1, il valore massimo sarebbe escluso. Ad esempio:

    Senza +1, il range sarebbe [min, max - 1].

    Con +1, il range è [min, max].

    Riassunto:
    La funzione genera un numero casuale intero compreso tra min e max (inclusi).

    Math.random() genera un numero casuale tra 0 e 1.

    (max - min + 1) definisce l'ampiezza del range.

    Il casting a (int) tronca la parte decimale.

    L'aggiunta di min sposta il range da [0, (max - min)] a [min, max].

    */
    public static int getRandomInt(int min, int max) {
        //                            [0, (max - min)] + min = [min, max]
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public static void searchInt(int[] m, int number1, int number2) {

        for(int i = 0; i < m.length; i++) {

            if(m[i] == number1) {
                System.out.println("numero " + number1 + " trovato");
                break;
            }

        }

        for(int i = 0; i < m.length; i++) {

            if(m[i] == number2) {
                System.out.println("numero " + number2 + " trovato");
                break;
            }
        }

    }

    public static void main(String[] args) {

        int min = 0;
        int max = 100;

        int[] arrayInt = new int[1000];
        
        for(int i = 0; i < 1000; i++) {

            arrayInt[i] = getRandomInt(min, max);
        }

        System.out.println(Arrays.toString(arrayInt));

        searchInt(arrayInt, min, max);
        
    }

}
