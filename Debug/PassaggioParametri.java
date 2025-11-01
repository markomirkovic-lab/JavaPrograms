import java.util.Arrays;

public class PassaggioParametri {
    
    private static int eseguiLavoro(int valore, char[] arrC) {
        valore = 666;
        arrC[0] = 'Z';
        return 77;
    }

    public static void main(String[] args) {
        int valInt = 15;
        int valRet = 0;
        char[] arrayChar = { 'A', 'B', 'C' };

        System.out.println("Prima dell'invocazione:");
        System.out.println("\tValInt: " + valInt + ", ValRet: " + valRet);
        System.out.println("\tArray: " + Arrays.toString(arrayChar));

        valRet = eseguiLavoro(valInt, arrayChar);

        System.out.println("\nDopo l'invocazione:");
        System.out.println("\tValInt: " + valInt + ", ValRet: " + valRet);
        System.out.println("\tArray: " + Arrays.toString(arrayChar));
    }
}
