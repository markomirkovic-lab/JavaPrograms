public class EsempioCopiaRiferimento {

    private static void spostaCerchio(int[] cerchio, int deltaX, int deltaY) {
        // Sposta il centro del cerchio (punta alla referenza ilMioCerchio)
        cerchio[0] += deltaX;// 25+23 = 48
        cerchio[1] += deltaY;// 50+56 = 106
        System.out.println("x: " + cerchio[0] + " y: " + cerchio[1]);// x: 48 y: 106

        // Assegna una nuova referenza a cerchio (punta alla referenza di cerchio di un nuovo record di attivazione RA)
        // (nessun effetto fuori dalla procedura)
        cerchio = new int[2];
        System.out.println("xo: " + cerchio[0] + " yo: " + cerchio[1]);// x: 0  y: 0
    }

    public static void main(String[] args) {

        int[] ilMioCerchio = { 25, 50 };
        System.out.println("x: " + ilMioCerchio[0] + " y: " + ilMioCerchio[1]);// x: 25 y: 50

        spostaCerchio(ilMioCerchio, 23, 56);
        System.out.println("x: " + ilMioCerchio[0] + " y: " + ilMioCerchio[1]);// x: 48 y: 106
    }
}
