/**
Programma confronta due stringe e verifica se sono uguali
 */
public class ConfrontoStringe {
    public static void main(String[] args) {

        String primaStringa = "Oggi c'e' il sole! :)";
        String secondaStringa = "Oggi non c'e' il sole :(";

        // Confronto indirizzi di memoria (NON DA USARE)
        if(primaStringa == secondaStringa) {
            System.out.print("Le stringe sono uguali");
        } else {
            System.out.print("Le stringe non sono uguali");
        }

        System.out.println("");

        // Confronto di stringe (USARE)
        if(primaStringa.equals(secondaStringa)) {
            System.out.print("Le stringe sono uguali");
        } else {
            System.out.print("Le stringe non sono uguali");
        }

    }
}
