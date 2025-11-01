import java.util.Scanner;

/**
 * Enumeratore per la lingua
 */
enum Lingua {
    ITALIANO, FRANCESE, TEDESCO, ROMANCIO
}

/**
 * Enumeratore per i giorni in italiano
 */
enum GiornoItaliano {
    LUNEDI, MARTEDI, MERCOLEDI, GIOVEDI, VENERDI, SABATO, DOMENICA
}

/**
 * Enumeratore per i giorni in francese
 */
enum GiornoFrancese {
    LUNDI, MARDI, MERCREDI, JEUDI, VENDREDI, SAMEDI, DIMANCHE
}

/**
 * Enumeratore per i giorni in tedesco
 */
enum GiornoTedesco {
    MONTAG, DIENSTAG, MITTWOCH, DONNERSTAG, FREITAG, SAMSTAG, SONNTAG
}

/**
 * Enumeratore per i giorni in romancio
 */
enum GiornoRomancio {
    GLINDESDI, MARDI, MESEMNA, GIEVGIA, VENDERDI, SONDA, DUMENGIA
}

/**
 * Programma in grado di tradurre uno dei sette giorni della settimana, fra una lingua e l'altra
 * delle 4 lingue nazionali.
 */
public class GiorniSettimana {

    /**
     * Procedura main - parte principale del programma
     *
     * @param args
     */
    public static void main(String[] args) {
        // Inizializza lo scanner per leggere dati da tastiera
        Scanner input = new Scanner(System.in);
        boolean valido = false;

        // Richiedi la lingua iniziale
        System.out.print("Lingua iniziale: ");
        String linguaIniziale = input.nextLine();

        // Richiedi la lingua di traduzione
        System.out.print("Lingua traduzione: ");
        String linguaTraduzione = input.nextLine();

        // Richiedi il giorno da tradurre
        System.out.print("Giorno: ");
        String giorno = input.nextLine();

        // Finalizza lo Scanner
        input.close();

        // Cerca la lingua iniziale (se la lingua immessa non é valida,
        // utilizza l'italiano)
        Lingua linguaIn = Lingua.ITALIANO;
        for (Lingua lingua : Lingua.values()) {
            if (lingua.toString().toLowerCase().equals(linguaIniziale.toLowerCase())) {
                linguaIn = lingua;
                valido = true;
                break;
            }
        }
        // Informa l'utente se la lingua iniziale immessa non é valida
        if (!valido)
            System.out.println("Lingua iniziale non valida; verrà utilizzato " + linguaIn);

        // Cerca la lingua da tradurre (se la lingua immessa non é valida,
        // utilizza l'italiano)
        valido = false;
        Lingua linguaTrad = Lingua.ITALIANO;
        for (Lingua lingua : Lingua.values()) {
            if (lingua.toString().toLowerCase().equals(linguaTraduzione.toLowerCase())) {
                linguaTrad = lingua;
                valido = true;
                break;
            }
        }
        // Informa l'utente se la lingua di traduzione immessa non é valida
        if (!valido)
            System.out.println("Lingua traduzione non valida; verrà utilizzato " + linguaTrad);

        if (linguaIn == linguaTrad)
            System.out.println("Nessuna traduzione richiesta, le due lingue coincidono");
        else {
            // Cerca il giorno da tradurre (se il valore immesso non é valido,
            // utilizza il lunedì)
            int indiceGiorno = 0;
            String giornoOriginale = "";
            valido = false;
            switch (linguaIn) {
                case ITALIANO:
                    giornoOriginale = GiornoItaliano.LUNEDI.toString();
                    for (GiornoItaliano giornoIta : GiornoItaliano.values()) {
                        if (giornoIta.toString().toLowerCase().equals(giorno.toLowerCase())) {
                            giornoOriginale = giornoIta.toString();
                            indiceGiorno = giornoIta.ordinal();
                            valido = true;
                            break;
                        }
                    }
                    break;
                case FRANCESE:
                    giornoOriginale = GiornoFrancese.LUNDI.toString();
                    for (GiornoFrancese giornoFra : GiornoFrancese.values()) {
                        if (giornoFra.toString().toLowerCase().equals(giorno.toLowerCase())) {
                            giornoOriginale = giornoFra.toString();
                            indiceGiorno = giornoFra.ordinal();
                            valido = true;
                            break;
                        }
                    }
                    break;
                case TEDESCO:
                    giornoOriginale = GiornoTedesco.MONTAG.toString();
                    for (GiornoTedesco giornoTed : GiornoTedesco.values()) {
                        if (giornoTed.toString().toLowerCase().equals(giorno.toLowerCase())) {
                            giornoOriginale = giornoTed.toString();
                            indiceGiorno = giornoTed.ordinal();
                            valido = true;
                            break;
                        }
                    }
                    break;
                case ROMANCIO:
                    giornoOriginale = GiornoRomancio.GLINDESDI.toString();
                    for (GiornoRomancio giornoRom : GiornoRomancio.values()) {
                        if (giornoRom.toString().toLowerCase().equals(giorno.toLowerCase())) {
                            giornoOriginale = giornoRom.toString();
                            indiceGiorno = giornoRom.ordinal();
                            valido = true;
                            break;
                        }
                    }
                    break;
                default:
                    break;
            }

            // Informa l'utente se il giorno immesso non é valido
            if (!valido)
                System.out.println("Giorno non valido; verrà utilizzato " + giornoOriginale);

            // Traduci il giorno immesso
            String giornoTradotto = "";
            switch (linguaTrad) {
                case ITALIANO:
                    giornoTradotto = GiornoItaliano.values()[indiceGiorno].toString();
                    break;
                case FRANCESE:
                    giornoTradotto = GiornoFrancese.values()[indiceGiorno].toString();
                    break;
                case TEDESCO:
                    giornoTradotto = GiornoTedesco.values()[indiceGiorno].toString();
                    break;
                case ROMANCIO:
                    giornoTradotto = GiornoRomancio.values()[indiceGiorno].toString();
                    break;
            }
            // Mostra il risultato della traduzione
            System.out.println(linguaIn + ": " + giornoOriginale + " --> " + linguaTrad + ": "
                    + giornoTradotto);
        }
    }
}
