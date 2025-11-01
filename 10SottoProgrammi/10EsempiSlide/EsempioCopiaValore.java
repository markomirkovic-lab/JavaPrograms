public class EsempioCopiaValore {

    private static void routine(int p) {
        // Modifica il parametro
        p = 10;
        System.out.println("In routine, p = " + p);// 10
    }

    public static void main(String[] args) {
        int x = 3;

        // Invoca routine() con x come argomento
        routine(x);

        // Mostra x per vedere se il valore è cambiato
        System.out.println("Dopo l'invocazione, x = " + x);// 3, valori primitivi non cambiano
    }
}
