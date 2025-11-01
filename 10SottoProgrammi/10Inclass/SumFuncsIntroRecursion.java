/**
 * Questo programma mostra due approcci per calcolare la somma dei numeri da
 * 1 a N.
 * 
 * Il primo approccio, con i metodi sumUpTo1(), sumUpTo2() e sumUpTo3(), serve
 * come introduzione didattica per mostrare come un metodo possa chiamarne un
 * altro per riutilizzare calcoli già fatti.
 * 
 * Il secondo approccio usa la ricorsione (sumUpToN), che è una soluzione più
 * elegante e generalizzata dello stesso problema: invece di scrivere un metodo
 * diverso per ogni numero, un unico metodo ricorsivo può calcolare la somma per
 * qualsiasi valore di N.
 */

public class SumFuncsIntroRecursion {

    private static int sumUpTo1() {
        return 1;
    }

    private static int sumUpTo2() {
        int sumTo1 = sumUpTo1();
        return 2 + sumTo1;
    }

    private static int sumUpTo3() {
        int sumTo2 = sumUpTo2();
        return 3 + sumTo2;
    }

    // Sottoprogramma ricorsivo
    private static int sumUpToN(int n) {
        System.out.println("n: " + n);
        if (n == 1) {
            return 1;
        }
        int resultNMinusOne = sumUpToN(n - 1); // chiamata ricorsiva
        return n + resultNMinusOne;
    }

    public static void main(String[] args) {
        int result = sumUpTo3();
        System.out.println(result);

        // Chiamata sottoprogramma ricorsivo
        result = sumUpToN(3);
        System.out.println(result);
        /*
        sumUpToN(3)
        └─> stampa "n: 3"
        └─> chiama sumUpToN(2)
            └─> stampa "n: 2"
            └─> chiama sumUpToN(1)
                └─> stampa "n: 1"
                └─> return 1 (caso base)
            └─> return 2 + 1 = 3
        └─> return 3 + 3 = 6
         */
    }
}