// Esempio per mostrare la differenza tra il passaggio di parametri di tipi primitivi 
// (copia del valore) e parametri di tipi riferimento come gli array (copia del riferimento).

public class CopiaValore {

    // Questa procedura non modifica il valore originale passato, solo una copia locale.
    // La modifica del parametro non influenza la variabile originale.
    private static void makeItDouble(int value) {
        System.out.println("DENTRO procedura - valore PRIMA di raddoppio: " + value);
        value *= 2;
        System.out.println("DENTRO procedura - valore DOPO di raddoppio: " + value);
    }

    // Questa procedura modifica effettivamente il contenuto dell'array originale passato.
    // La modifica dell'array si riflette sull'array originale.
    private static void makeItTriple(int[] array, int index) {
        // Controllo dell'indice per evitare ArrayIndexOutOfBounds
        if (index < 0 || index >= array.length) {
            System.out.println("Indice non valido!");
            return;
        }
        System.out.println("DENTRO procedura - valore PRIMA di triplicare: " + array[index]);
        array[index] *= 3;
        System.out.println("DENTRO procedura - valore DOPO di triplicare: " + array[index]);
    }

    public static void main(String[] args) {
        int pippo = 15;
        System.out.println("MAIN - valore PRIMA di raddoppio: " + pippo);
        makeItDouble(pippo);
        System.out.println("MAIN - valore DOPO di raddoppio: " + pippo);

        int[] pluto = { 1, 2, 3, 4 };
        int indice = 3;
        System.out.println("MAIN - valore PRIMA di triplicare: " + pluto[indice]);
        makeItTriple(pluto, indice);
        System.out.println("MAIN - valore DOPO di triplicare: " + pluto[indice]);
    }
}
