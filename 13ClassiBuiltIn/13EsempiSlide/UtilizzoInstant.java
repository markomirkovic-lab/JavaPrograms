import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class UtilizzoInstant {
    public static void main(String[] args) {
        // Richiedi e mostra l'istante attuale
        // (formato 'AAAA-MM-GGTHH:MM:SSZ')
        Instant adesso = Instant.now();
        System.out.println(adesso);

        // Creazione a partire da una stringa
        Instant inizio = Instant.parse("2022-09-16T08:30:00Z");

        // Quanti minuti ci sono tra due istanti?
        long min = inizio.until(adesso, ChronoUnit.MINUTES);
        System.out.println("Minuti trascorsi: " + min);
        Instant fine = inizio.plus(min, ChronoUnit.MINUTES);
        System.out.println(adesso + " viene dopo di " + fine + "? "
                + adesso.isAfter(fine));

        // inizio - fino a - adesso
        // 
        // fine = inizio - piu'   - inizio fino ad adesso

        // adesso > fine ()

        /*
        2025-01-07T15:53:41.513671600Z
        Minuti trascorsi: 1215803
        2025-01-07T15:53:41.513671600Z viene dopo di 2025-01-07T15:53:00Z? true
        */



        // Quante ore ci sono tra due istanti?
        long hours = inizio.until(adesso, ChronoUnit.HOURS);
        System.out.println("Ore trascorse: " + hours);
        Instant fine2 = inizio.plus(hours, ChronoUnit.HOURS);
        System.out.println(adesso + " viene dopo di " + fine + "? "
                + adesso.isAfter(fine2));

    }
}
