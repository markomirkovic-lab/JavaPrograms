public class EsempioCopiaRiferimentoStringa {
  private static void modificaStringa(String frase, String aggiunta) {
    System.out.println("Frase: " + frase);
    frase += aggiunta;
    System.out.println("Frase dopo la modifica: " + frase);
  }

  public static void main(String[] args) {
    String frase = "Benvenuti";
    System.out.println("Frase: " + frase);
    modificaStringa(frase, " a tutti");
    System.out.println("Frase: " + frase);
  }
}
