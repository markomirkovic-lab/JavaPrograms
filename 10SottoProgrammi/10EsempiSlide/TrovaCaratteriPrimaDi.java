public class TrovaCaratteriPrimaDi {
    private static void trovaCaratteriPrimaDi(String frase, char car) {
        System.out.println("Frase: " + frase);
        System.out.print("I caratteri prima di '" + car);
        System.out.print("' sono alla posizione: ");
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == car) {
                System.out.println(i + " ");
                return;
            } else {
                //System.out.print("");
            }
              
        }
        System.out.println("Carattere non trovato!");
    }

    public static void main(String[] args) {
        trovaCaratteriPrimaDi("Oggi e' una bella giornata.", 'a');
    }
}
