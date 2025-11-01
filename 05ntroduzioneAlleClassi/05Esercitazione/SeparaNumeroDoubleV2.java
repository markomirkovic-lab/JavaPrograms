import java.util.Scanner;

public class SeparaNumeroDoubleV2{
    public static void main(String[] args){
        // Inizializza lo scanner
        Scanner input = new Scanner(System.in);

        // Richiedi il numero decimale
        System.out.println("Inserisci un numero con la virgola");
        double valoreImmesso = input.nextDouble();

        // Estrai la parte intera
        int parteIntera = (int) valoreImmesso;
        System.out.println("Parte intera: " + parteIntera);

        // Converti in stringa il valore immesso
        String valoreComeStringa = "" + valoreImmesso;

        // Cerca la posizione del '.'
        int indiceVirgola = valoreComeStringa.indexOf('.');
        System.out.println("indice virgola: " + indiceVirgola);

        int parteDecimale = 0;
        if (indiceVirgola != -1) {
            // Ottieni la lunghezza della stringa
			int lunghezzaString = valoreComeStringa.length();

            // Estrai la parte decimale
            String parteDecimaleComeString = valoreComeStringa.substring(indiceVirgola + 1, lunghezzaString);
            System.out.println("parte decimale come stringa: " + parteDecimaleComeString);
            
            // Converti in numero la parte decimale
            parteDecimale = Integer.parseInt(parteDecimaleComeString);
		}
        
        // Esegui la somma e mostra il risultato
        int somma = parteIntera + parteDecimale;
        System.out.println("somma: " + somma);

        if(parteDecimale > parteIntera){
            System.out.println("La parte decimale e' maggiore di quella intera");
        }

        // Finalizza lo scanner
        input.close();
    }
}