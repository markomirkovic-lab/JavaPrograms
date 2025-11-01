/*
11.5 Minimo
Scrivete un codice che trovi il numero minimo presente in un array di interi.
*/

public class Es11_5_MinimoMassimo {

    public static void main(String[] args) {
        
        int numero[] = {3, 1, 14, 20, 8, 6, 42, 36};

        int minimo = numero[0];
        int massimo = numero[0];

        // Trova minimo
        for(int i = 0; i < numero.length; i++) {

            if(numero[i] < minimo) {
                minimo = numero[i];
            } else if(numero[i] > massimo) {
                massimo = numero[i];
            }
        }

        // Stampa array
        System.out.print("Numeri: ");
        for(int i = 0; i < numero.length; i++) {

            System.out.print(numero[i] + " ");
            
        }

        System.out.println();
        System.out.println("Il numero minimo e': " + minimo);
        System.out.println("Il numero massimo e': " + massimo);

    }
    
}
