/*
Triangolo.java FileJAVA
Scrivere un sottoprogramma ricorsivo che dato il numero di righe stampi a video un triangolo di caratteri 'A'.
Esempio con 4 righe:
A
AA
AAA
AAAA
*/
public class EsTriangolo {

    private static void stampaTriangoloIterativo(int numeroRighe) {

        for(int i = 0; i <= numeroRighe; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("A");
            }
            System.out.println();
             
        }

    }


    private static void stampaTriangoloRicorsivo(int numeroRighe) {

        // Condizione base
        if(numeroRighe < 1) {
            return;
        }    
        
        if(numeroRighe >= 1) {
            stampaTriangoloRicorsivo(numeroRighe - 1);
            stampaSingolaRiga(numeroRighe);
            System.out.println();
        }
    }


    private static void stampaSingolaRiga(int lunghezza) {
        for(int i = 0; i < lunghezza; i++) {
            System.out.print("A");
        }
    }



    public static void main(String[] args) {


        stampaTriangoloIterativo(4);

        stampaTriangoloRicorsivo(4);
        
    }
}
