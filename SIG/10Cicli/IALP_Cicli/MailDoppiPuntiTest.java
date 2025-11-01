public class MailDoppiPuntiTest {
    public static void main(String[] args) {
        String email = "test@example..com"; // Cambia questo per testare diversi input

        boolean at = false; // Flag per controllare se '@' è stato trovato
        boolean isValid = true; // Supponiamo valida finché non troviamo errori

        for (int i = 0; i < email.length(); i++) {
            // Controllo se troviamo il simbolo '@'
            if (email.charAt(i) == '@') {
                at = true; // Flag per indicare che abbiamo trovato '@'
            }

            // Controllo dei doppi punti solo se siamo dopo '@'
            if (at && i + 1 < email.length() && email.charAt(i) == '.' && email.charAt(i + 1) == '.') {
                isValid = false; // Invalida l'email se trovi doppi punti
                break; // Uscita immediata
            }
        }

        // Verifica finale: l'email è valida solo se contiene '@' e non ha doppi punti
        isValid = isValid && at;

        System.out.println("Email valida: " + isValid);
    }
}
