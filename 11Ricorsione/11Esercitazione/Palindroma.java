public class Palindroma {
    private static boolean palindroma(String frase) {
        if (frase.length() <= 1)
            // Zero o un carattere rimasti, la frase é palindroma
            return true;
        if (frase.charAt(0) != frase.charAt(frase.length() - 1))
            // Primo e ultimo carattere diversi, la frase non é palindroma
            return false;
        // Aggiunto trim() per rimuovere eventuali spazi all'inizio e
        // alla fine della stringa
        String nuovaFrase = frase.substring(1, frase.length() - 1).trim();
        return palindroma(nuovaFrase);
    }

    public static void main(String[] args) {
        String frase = "Assalir i mici mi rilassa";
        // Ignora maiuscole e minuscole
        System.out.println(frase + " -- Palindroma? " + palindroma(frase.toLowerCase()));
    }
}
