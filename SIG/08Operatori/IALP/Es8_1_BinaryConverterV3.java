import java.util.Scanner;

public class Es8_1_BinaryConverterV3 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero;
        int byteN;

        int bit0, bit1, bit2, bit3, bit4, bit5, bit6, bit7;

        // 1 byte = 8 bit = 256

        System.out.print("Inserire un numero intero reappresentatible in un byte: ");
        numero = input.nextInt();

        byteN = numero;

        String conversione="";

        //Uso la stringa per memorizzare il risultato,
        //inserendo davanti, in testa, i resti del modulo

        conversione += (byteN%2);
        byteN = (byteN/2);
        conversione += (byteN%2);
        byteN = (byte) (byteN/2);
        conversione += (byteN%2);
        byteN = (byte) (byteN/2);
        conversione += (byteN%2);
        byteN = (byte) (byteN/2);
        conversione += (byteN%2);
        byteN = (byte) (byteN/2);
        conversione += (byteN%2);
        byteN = (byte) (byteN/2);
        conversione += (byteN%2);
        byteN = (byte) (byteN/2);
        conversione += (byteN%2);
        byteN = (byte) (byteN/2);

        System.out.println("\n\nNumero binario: " + conversione);
        
        input.close();
    }
}
