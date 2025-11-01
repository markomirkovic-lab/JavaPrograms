import java.util.Scanner;

public class SimulazioneDado {

    // Costanti
    static final int MIN_LANCI = 100; // Numero minimo di lanci
    static final int MAX_LANCI = 100000; // Numero massimo di lanci
    static final int NUMERO_DA_CERCARE = 6; // Numero di cui calcolare la probabilita'
    static final int FACCE_DADO = 6;
    static final double PROB_TEORICA = 1.0 / FACCE_DADO; // Probabilità teorica

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input con controllo validità
        int numeroDiLanciDaEffettuare = 0; // Variabile per memorizzare il numero di lanci inserito dall'utente
        do {
            System.out.print("Inserisci il numero di lanci (intero tra" + MIN_LANCI + " e " + MAX_LANCI + "): ");
            while (!scanner.hasNextInt()) {
                System.out.print("Errore: inserire un NUMERO INTERO tra " + MIN_LANCI + " e " + MAX_LANCI + ": ");
                scanner.nextLine(); // Pulisce il buffer
            }
            numeroDiLanciDaEffettuare = scanner.nextInt();
            scanner.nextLine(); // Pulisce il buffer

            if (numeroDiLanciDaEffettuare < MIN_LANCI || numeroDiLanciDaEffettuare > MAX_LANCI) {
                System.out.println("Errore: il numero deve essere COMPRESO tra " + MIN_LANCI + " e " + MAX_LANCI);
            }

        } while (numeroDiLanciDaEffettuare < MIN_LANCI || numeroDiLanciDaEffettuare > MAX_LANCI);
        scanner.close();

        // Variabili per la simulazione
        int contaNumeroCercato = 0; // // Conta il numero di volte che otteniamo "NUMERO_DA_CERCARE"
        int contaNumeroCercatoInDueLanciConsecutivi = 0; // Conta il numero di volte che otteniamo due "NUMERO_DA_CERCARE" consecutivi
        boolean lancioPrecedenteNumeroCercato = false; // True se nel lancio precedente e' uscito "NUMERO_DA_CERCARE"

        // Simula i lanci e calcola statistiche
        for (int i = 0; i < numeroDiLanciDaEffettuare; i++) {
            // Genera un numero casuale tra 1 e FACCE_DADO
            int lancio = (int) (Math.random() * FACCE_DADO) + 1;

            if (lancio == NUMERO_DA_CERCARE) {
                contaNumeroCercato++;

                // Verifica se anche il lancio precedente era il numero cercato
                if (lancioPrecedenteNumeroCercato) {
                    contaNumeroCercatoInDueLanciConsecutivi++;
                }
                lancioPrecedenteNumeroCercato = true;
            } else {
                lancioPrecedenteNumeroCercato = false;
            }
        }

        // Calcola probabilità sperimentale
        double probSperimentale = (double) contaNumeroCercato / numeroDiLanciDaEffettuare;
        double differenza = Math.abs(probSperimentale - PROB_TEORICA);

        // Stampa i risultati
        System.out.println("Probabilita' sperimentale: " + probSperimentale);
        System.out.println("Probabilita' teorica: " + PROB_TEORICA);
        System.out.println("Differenza tra probabilita' sperimentale e teorica: " + differenza);
        System.out.println("Numero totale di" + NUMERO_DA_CERCARE + " in due lanci consecutivi: " + contaNumeroCercatoInDueLanciConsecutivi);
    }
}