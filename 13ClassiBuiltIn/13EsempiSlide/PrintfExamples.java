import java.time.LocalDate;

public class PrintfExamples {
    public static void main(String[] args) {
        int numeroInteri = 42;
        int numeroNegativo = -15;
        double numeroVirgolaMobile = 3.14159;
        String nome = "Java";
        LocalDate oggi = LocalDate.now();

        /*
        Specificatori di formato usati di frequente:

        format specifier: 
        System.out.printf("%____", ____)
        System.out.printf("%____, %____", ____ , ____)

        • %b per booleano
        • %c per carattere (C maiuscola mette in maiuscolo il carattere)
        • %d per numero intero (byte, short, int o long)
        • %f per numero a virgola mobile (float o double)
        • %e per numero in notazione scientifica
        • %s per stringa (S maiuscola mette in maiuscolo tutte le lettere della stringa)
        • %n per un carattere di “a capo” (newline) indipendente dalla piattaforma
        */

        // Esempio base con stringa e intero
        System.out.printf("Numero intero: %d%n", numeroInteri);
        //Numero intero: 42

        // Stampa un numero a virgola mobile con due cifre decimali
        System.out.printf("Numero a virgola mobile (due decimali): %.2f%n", numeroVirgolaMobile);
        //Numero a virgola mobile (due decimali): 3.14

        // Combina stringa e numeri in un formato
        System.out.printf("Linguaggio: %s, Versione: %.1f%n", nome, 17.0);
        //Linguaggio: Java, Versione: 17.0

        // Allineamento a sinistra con larghezza specificata
        System.out.printf("Allineato a sinistra: %-10dFine%n", numeroInteri);
        //Allineato a sinistra: 42        Fine

        // Allineamento a destra con larghezza specificata
        System.out.printf("Allineato a destra: %10dFine%n", numeroInteri);
        //Allineato a destra:         42Fine

        // Visualizzazione del segno positivo
        System.out.printf("Numero con segno positivo: %+d%n", numeroInteri);
        //Numero con segno positivo: +42

        // Gestione di un numero negativo
        System.out.printf("Numero negativo: %d%n", numeroNegativo);
        //Numero negativo: -15

        // Stampa in maiuscolo esadecimale
        System.out.printf("Esadecimale (maiuscolo): %X%n", numeroInteri);
        //Esadecimale (maiuscolo): 2A

        // Formattazione di una data
        System.out.printf("Data attuale: %tD%n", oggi);
        //Data attuale: 01/07/25

        // Combinazione avanzata: diverse variabili e tipi
        System.out.printf("Riassunto: Nome: %1$s, Data: %2$tb %2$te, %2$tY, Numero: %3$+d%n", nome, oggi, numeroInteri);
        //Riassunto: Nome: Java, Data: Jan 7, 2025, Numero: +42
    }
}
