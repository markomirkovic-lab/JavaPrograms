public class EsempioCopiaRiferimentoStringa {

    private static void modificaStringa(String frase, String aggiunta) {
        System.out.println("Frase: " + frase);// Benvenuti
        frase += aggiunta;
        System.out.println("Frase dopo la modifica: " + frase);// Benvenuti a tutti
    }

    public static void main(String[] args) {

        String frase = "Benvenuti";
        System.out.println("Frase: " + frase);// Benvenuti
        modificaStringa(frase, " a tutti");
        System.out.println("Frase: " + frase);// Benvenuti (non cambia la frase)
    }
}
