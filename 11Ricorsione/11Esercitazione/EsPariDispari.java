/*
PariDispari.java FileJAVA
Sottoprogramma che determina se un numero positivo è pari o dispari utilizzando la ricorsione, 
senza utilizzare l'operatore modulo o la divisione.
*/

public class EsPariDispari {

    private static boolean isPari(int numero) {

        // Caso base 0 e' pari
        if(numero == 0) {
            return true;
        }

        // Caso base 1 e' dispari
        if(numero == 1) {
            return false;
        }

        return isPari(numero - 2);

    }
    
    public static void main(String[] args) {
        
        int numero = 9;

        boolean isPari = isPari(numero);

        if(isPari) {
            System.out.println("Il numero " + numero + " e' pari");
        } else {
            System.out.println("Il numero " + numero + " e' dipari");
        }

    }
}
