public class ForRigaColonna {
    public static void main(String[] args) {
        // Percorri tutte le righe
        for (int riga = 1; riga <= 12; riga++) {
            // Percorri tutte le colonne di ogni riga
            for (int colonna = 1; colonna <= 12; colonna++) {
            // Mostra il risultato corrente
            System.out.print(riga * colonna + "\t");
            }
            // Inizia una nuova riga
            System.out.println();
        }
    }
    
}
