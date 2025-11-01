import java.util.Scanner;

public class ConvertitoreDecimaleBinario {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Inserire un numero intero: ");
        int numero = input.nextInt();

        // Estraggo manualmente i bit (dall'ultimo (bit meno significativo) al primo (bit piu' significativo))
        // L'ordine e' importante
        int bit0 = numero % 2;// Bit meno significativo
        numero /= 2;
        int bit1 = numero % 2;
        numero /= 2;
        int bit2 = numero % 2;
        numero /= 2;
        int bit3 = numero % 2;//-- 1-4
        numero /= 2;
        int bit4 = numero % 2;
        numero /= 2;
        int bit5 = numero % 2;
        numero /= 2;
        int bit6 = numero % 2;
        numero /= 2;
        int bit7 = numero % 2;//-- 5-8
        numero /= 2;
        int bit8 = numero % 2;
        numero /= 2;
        int bit9 = numero % 2;
        numero /= 2;
        int bit10 = numero % 2;
        numero /= 2;
        int bit11 = numero % 2;//-- 9-12
        numero /= 2;
        int bit12 = numero % 2;
        numero /= 2;
        int bit13 = numero % 2;
        numero /= 2;
        int bit14 = numero % 2;
        numero /= 2;
        int bit15 = numero % 2;// Bit piu' significativo
        //numero /= 2;
        //int bit16 = numero % 2;
        //numero /= 2;
        //...
        

        System.out.printf("%s%d%d%d%d%d%d%d%d%d%d%d%d%d%d%d%d","Numero binario: ",
                          bit15, bit14, bit13, bit12, bit11, bit10, bit9, bit8, bit7, bit6, bit5, bit4, bit3, bit2, bit1, bit0);
        System.out.println();
        System.out.printf("%s%d%d%d%d%s%d%d%d%d%s%d%d%d%d%s%d%d%d%d","Numero binario: ",
                          bit15, bit14, bit13, bit12, " ", bit11, bit10, bit9, bit8, " ", bit7, bit6, bit5, bit4, " ", bit3, bit2, bit1, bit0);
        System.out.println();
        System.out.print("Numero binario: "+bit15+bit14+bit13+bit12+" "+bit11+bit10+bit9+bit8+" "+bit7+bit6+bit5+bit4+" "+bit3+bit2+bit1+bit0);
        
        input.close();
    }
    
}
