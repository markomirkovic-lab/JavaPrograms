
public class SearchLastV3 {
    public static void main(String[] args) {
        // Verifica che ci siano almeno due argomenti (valore da cercare e almeno un elemento in cui cercare)
        if (args.length < 2) {
            System.out.println("Errore: sono necessari almeno due argomenti.");
            return;
        }

        String valoreDaCercare = args[0]; // Il valore da cercare è il primo argomento
        int ultimoIndice = -1; // Inizializza l'indice dell'ultima ricorrenza trovata

        System.out.println("valoreDaCercare: " + valoreDaCercare);

        System.out.printf("Indice:\t%3d%3d%3d%3d%3d%3d%3d%3d%3d%3d%3d", 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println();
        System.out.print("Valori:\t");
        for(String arg : args){
            System.out.printf("%3s",  arg);
        }
        System.out.println();

        // Itera sugli argomenti a partire da args[1]
        for (int i = 1; i < args.length; i++) {
            if (args[i].equals(valoreDaCercare)) {
                ultimoIndice = i; // Aggiorna l'indice dell'ultima ricorrenza trovata (partendo da 1)
            }
        }

        // Stampa il risultato
        if (ultimoIndice != -1) {
            System.out.println("ultimo indice: "  + ultimoIndice); // Stampa l'indice partendo da 1
        } else {
            System.out.println("Valore non trovato");
        }

        /*
        PS C:\Users\marko.mirkovic\JavaPrograms\Eserciziario\Array> java SearchLastV3 3 1 7 5 9 67 4 7 3 7 9
        valoreDaCercare: 3
        Indice:   0  1  2  3  4  5  6  7  8  9 10
        Valori:   3  1  7  5  9 67  4  7  3  7  9
        ultimo indice: 8
        PS C:\Users\marko.mirkovic\JavaPrograms\Eserciziario\Array> java SearchLastV3 1 1 2 1 3 1 4         
        valoreDaCercare: 1
        Indice:   0  1  2  3  4  5  6  7  8  9 10
        Valori:   1  1  2  1  3  1  4
        ultimo indice: 5
        */
    }
}
