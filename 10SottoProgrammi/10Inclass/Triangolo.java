/**
 * Questo programma mostra tre diversi approcci per stampare un triangolo di caratteri 'A':
 * - Un approccio iterativo usando cicli for annidati
 * - Due varianti ricorsive che mostrano come lo stesso problema può essere risolto con la ricorsione
 * 
 * Il parametro nrRighe indica quante righe del triangolo stampare.
 * Ad esempio, per nrRighe=4 il triangolo risultante sarà:
 * A
 * AA
 * AAA
 * AAAA
 */

public class Triangolo {

    // Procedura che stampa il triangolo sfruttando dei cicli for (approccio
    // iterativo)
    private static void stampaTriangoloIterativo(int nrRighe) {
        for (int i = 1; i <= nrRighe; i++) { // Cicla sulle varie righe del triangolo
            for (int j = 0; j < i; j++) { // Stampa la singola riga
                System.out.print("A");
            }
            System.out.println();
        }
    }

    // Procedura che stampa il triangolo sfruttando la ricorsione (approccio
    // ricorsivo) - Variante 1
    private static void stampaTriangoloRicorsivoV1(int nrRighe) {
        // Sfruttiamo il fatto che: triangolo di n righe = triangolo di (n-1) righe + 1
        // riga

        if (nrRighe < 1) { // condizione usata per terminare le chiamate ricorsive
            return;
        }

        stampaTriangoloRicorsivoV1(nrRighe - 1); // chiamata ricorsiva a se stessa
        stampaSingolaRiga(nrRighe); // stampa la singola riga

        System.out.println();
    }

    // Procedura che stampa il triangolo sfruttando la ricorsione (approccio
    // ricorsivo) - Variante 2
    private static void stampaTriangoloRicorsivoV2(int nrRighe) {
        // Sfruttiamo il fatto che: triangolo di n righe = triangolo di (n-1) righe + 1
        // riga

        if (nrRighe >= 1) {
            stampaTriangoloRicorsivoV2(nrRighe - 1); // chiamata ricorsiva a se stessa
            stampaSingolaRiga(nrRighe); // stampa la singola riga
            System.out.println();
        }
    }

    private static void stampaSingolaRiga(int lunghezza) {
        for (int j = 0; j < lunghezza; j++) {
            System.out.print("A");
        }
    }

    public static void main(String[] args) {

        System.out.println("Triangolo iterativo:");
        stampaTriangoloIterativo(4);

        System.out.println();
        System.out.println();

        System.out.println("Triangolo ricorsivo variante 1:");
        stampaTriangoloRicorsivoV1(4);
        /*
         * Dettaglio di esecuzione di stampaTriangoloRicorsivoV1(4):
         * 
         * stampaTriangoloRicorsivoV1(4) -> chiama stampaTriangoloRicorsivoV1(3)
            * stampaTriangoloRicorsivoV1(3) -> chiama stampaTriangoloRicorsivoV1(2)
                * stampaTriangoloRicorsivoV1(2) -> chiama stampaTriangoloRicorsivoV1(1)
                    * stampaTriangoloRicorsivoV1(1) -> chiama stampaTriangoloRicorsivoV1(0)
                        * stampaTriangoloRicorsivoV1(0) -> return, non stampa niente
                    * stampaTriangoloRicorsivoV1(1) -> "A"
                * stampaTriangoloRicorsivoV1(2) -> "AA"
            * stampaTriangoloRicorsivoV1(3) -> "AAA"
         * stampaTriangoloRicorsivoV1(4) -> "AAAA"
         */

        System.out.println();
        System.out.println();

        System.out.println("Triangolo ricorsivo variante 2:");
        stampaTriangoloRicorsivoV2(4);
    }
}
