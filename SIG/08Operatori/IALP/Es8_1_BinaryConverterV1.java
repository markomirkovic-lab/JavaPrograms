import java.util.Scanner;

public class Es8_1_BinaryConverterV1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero;
        byte byteN;

        // 1 byte = 8 bit = 256

        System.out.print("Inserire un numero intero reappresentatible in un byte: ");
        numero = input.nextInt();

        byteN = (byte) numero;

        //System.out.println(numero);// 7
        //System.out.println(byteN);// 7

        System.out.print("\n\nQuesto sistema ha un difetto: il "
                + " risultato va letto da destra a sinistra: ");
        System.out.print((byteN % 2));
        // Devo usare il casting perche' l'operatore % restituisce un int a causa del 2!
        byteN = (byte) (byteN/2);
        System.out.print(byteN%2);
        byteN = (byte) (byteN/2);
        System.out.print(byteN%2);
        byteN = (byte) (byteN/2);
        System.out.print(byteN%2);
        byteN = (byte) (byteN/2);
        System.out.print(byteN%2);
        byteN = (byte) (byteN/2);
        System.out.print(byteN%2);
        byteN = (byte) (byteN/2);
        System.out.print(byteN%2);
        byteN = (byte) (byteN/2);
        System.out.print(byteN%2);
        byteN = (byte) (byteN/2);

        System.out.println();

        //numero = (numero/2);
        System.out.print(numero%2);
        numero = (numero/2);
        System.out.print(numero%2);
        numero = (numero/2);
        System.out.print(numero%2);
        numero = (numero/2);
        System.out.print(numero%2);
        numero = (numero/2);
        System.out.print(numero%2);
        numero = (numero/2);
        System.out.print(numero%2);
        numero = (numero/2);
        System.out.print(numero%2);
        numero = (numero/2);

        /* 
        Questo sistema ha un difetto: il  risultato va letto da destra a sinistra: 11100000
        1110000
        */

        input.close();
    }
}
