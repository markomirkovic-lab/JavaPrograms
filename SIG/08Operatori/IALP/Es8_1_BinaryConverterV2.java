import java.util.Scanner;

public class Es8_1_BinaryConverterV2 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero;
        byte byteN;

        byte bit0, bit1, bit2, bit3, bit4, bit5, bit6, bit7;

        // 1 byte = 8 bit = 256

        System.out.print("Inserire un numero intero reappresentatible in un byte: ");
        numero = input.nextInt();

        byteN = (byte) numero;

        System.out.print("\n\nQuesto sistema è perfetto: ");
        System.out.print((byteN/2/2/2/2/2/2/2) % 2);
        System.out.print((byteN/2/2/2/2/2/2) % 2);
        System.out.print((byteN/2/2/2/2/2) % 2);
        System.out.print((byteN/2/2/2/2) % 2);
        System.out.print((byteN/2/2/2) % 2);
        System.out.print((byteN/2/2) % 2);
        System.out.print((byteN/2) % 2);
        System.out.print(byteN % 2);

        System.out.println();

        bit7 = (byte) ((byteN/2/2/2/2/2/2/2) % 2);
        bit6 = (byte) ((byteN/2/2/2/2/2/2) % 2);
        bit5 = (byte) ((byteN/2/2/2/2/2) % 2);
        bit4 = (byte) ((byteN/2/2/2/2) % 2);
        bit3 = (byte) ((byteN/2/2/2) % 2);
        bit2 = (byte) ((byteN/2/2) % 2);
        bit1 = (byte) ((byteN/2) % 2);
        bit0 = (byte) (byteN % 2);


        System.out.printf("%s%d%d%d%d%d%d%d%d","Numero binario: ",
                          bit7, bit6, bit5, bit4, bit3, bit2, bit1, bit0);
        System.out.println();
        System.out.printf("%s%d%d%d%d%s%d%d%d%d","Numero binario: ",
                          bit7, bit6, bit5, bit4, " ", bit3, bit2, bit1, bit0);
        System.out.println();
        System.out.print("Numero binario: "+bit7+bit6+bit5+bit4+" "+bit3+bit2+bit1+bit0);
     
        input.close();
    }
}
