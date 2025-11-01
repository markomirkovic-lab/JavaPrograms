enum TipoCarattere {
    VOCALE, CONSONANTE, CIFRA, SPECIALE
}

public class AnalizzatoreStringa {

    private static int contaMaiuscole(String testo) {
        int conteggio = 0;
        for (int i = 0; i < testo.length(); i++) {
            char c = testo.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                conteggio++;
            }
        }
        return conteggio;
    }

    private static TipoCarattere classificaCarattere(char c) {
        if (c >= 'a' && c <= 'z') {
            return switch (c) {
                case 'a', 'e', 'i', 'o', 'u' -> TipoCarattere.VOCALE;
                default -> TipoCarattere.CONSONANTE;
            };
        } else if (c >= '0' && c <= '9') {
            return TipoCarattere.CIFRA;
        } else {
            return TipoCarattere.SPECIALE;
        }
    }

    private static int[] contaTipiCarattere(char[] testo) {
        int[] conteggi = new int[TipoCarattere.values().length];
        for (char c : testo) {
            TipoCarattere tipo = classificaCarattere(c);
            conteggi[tipo.ordinal()]++;
        }
        return conteggi;
    }

    private static double[] calcolaPercentuali(int[] conteggi) {
        int totale = 0;
        for (int conteggio : conteggi) {
            totale += conteggio;
        }
        double[] percentuali = new double[conteggi.length];
        if (totale > 0) {
            for (int i = 0; i < conteggi.length; i++) {
                percentuali[i] = (conteggi[i] * 100.0) / totale;
            }
        }
        return percentuali;
    }

    public static void main(String[] args) {
        String input = "Hello@#123World!!";
        String inputMinuscolo = input.toLowerCase();
        char[] testo = inputMinuscolo.toCharArray();
        int[] conteggiPerTipoCarattere = contaTipiCarattere(testo);
        double[] percentuali = calcolaPercentuali(conteggiPerTipoCarattere);

        System.out.println("Stringa analizzata: " + input);

        System.out.println("\nNumero di lettere maiuscole nel testo originale: " + contaMaiuscole(input));
        System.out.println("\nStatistiche:");
        for (TipoCarattere tipo : TipoCarattere.values()) {
            int indiceTipo = tipo.ordinal();
            System.out.println(tipo + ": " + conteggiPerTipoCarattere[indiceTipo] + " (" + percentuali[indiceTipo] + " %)");
        }
    }
}