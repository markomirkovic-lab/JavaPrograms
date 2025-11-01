import java.util.Scanner;

public class Es8_1_BinaryConverterV4 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero;
        byte byteN;

        int bit0, bit1, bit2, bit3, bit4, bit5, bit6, bit7;

        // 1 byte = 8 bit = 256

        System.out.print("Inserire un numero intero reappresentatible in un byte: ");
        numero = input.nextInt();

        byteN = (byte) numero;
        byte r;
        String conversione = "";

        // Uso l’and sui bit per esaminare se il bit più significativo
        // è a 1
        // Es: Se il numero da convertire è 0b10110011
        // & 0b10000000
        // da come risultato 0b10000000
        // Se lo shifto a sinistra di 7 posizioni ottengo 0b00000001
        

        /*
        Tipo	Dimensione (bit)	Valore minimo	Valore massimo	        Esempio
        byte	8	                -128	        127	                    byte b = 10;
        short	16	                -32,768	        32,767	                short s = 200;
        int	    32	                -2^31	        2^31 - 1	            int i = 1000;
        long	64	                -2^63	        2^63 - 1	            long l = 5000L;
        float	32	                ±1.4E-45	    ±3.4028235E38	        float f = 3.14f;
        double	64	                ±4.9E-324	    ±1.7976931348623157E308	double d = 3.14;
        char	16	                '\u0000' (0)	'\uffff' (65,535)	    char c = 'A';
        boolean	1 (non specificato)	false	        true	                boolean flag = true;
        */

        // Lavorando sul bit più significativo

        System.out.print("Numero binario: ");
        System.out.print((byteN & 128) >> 7);
        byteN = (byte) (byteN<<1);
        System.out.print((byteN & 128) >> 7);
        byteN = (byte) (byteN<<1);
        System.out.print((byteN & 128) >> 7);
        byteN = (byte) (byteN<<1);
        System.out.print((byteN & 128) >> 7);
        byteN = (byte) (byteN<<1);
        System.out.print((byteN & 128) >> 7);
        byteN = (byte) (byteN<<1);
        System.out.print((byteN & 128) >> 7);
        byteN = (byte) (byteN<<1);
        System.out.print((byteN & 128) >> 7);
        byteN = (byte) (byteN<<1);
        System.out.print((byteN & 128) >> 7);
        byteN = (byte) (byteN<<1);
        System.out.println("");


        /*
        L'operazione AND bit a bit confronta i bit corrispondenti di byteN e 128. 
        Poiché il bit più significativo di byteN è 0, il risultato sarà:

        ---------- 1:
        (byteN & 128):
        0b00000111
        &
        0b10000000
        =
        0b00000000
                        >> 7
        0b00000000      = 0
        ---------- 2:
        0b00000111
                        << 1
        0b00001110
        &
        0b10000000
        =
        0b00000000
                        >> 7
        0b00000000
        ---------- 3:
        0b00001110
                        << 1
        0b00011100
        &
        0b10000000
        =
        0b00000000
                        >> 7
        0b00000000
        ---------- 4:
        0b00011100
                        << 1
        0b00111000
        &
        0b10000000
        =
        0b00000000
                        >> 7
        0b00000000
        ---------- 5:
        0b00111000
                        << 1
        0b01110000
        &
        0b10000000
        =
        0b00000000
                        >> 7
        0b00000000
        ---------- 6:
        0b01110000
                        << 1
        0b11100000
        &
        0b10000000
        =
        0b10000000
                        >> 7
        0b00000001   -----> 1
        ---------- 7:
        0b11100000
                        << 1
        0b11000000
        &
        0b10000000
        =
        0b10000000
                        >> 7
        0b00000001   -----> 1
        ---------- 8
        0b11000000
                        << 1
        0b10000000
        &
        0b10000000
        =
        0b10000000
                        >> 7
        0b00000001   -----> 1
        ----------
        ----------
        */


        //---
        System.out.println("---");

        //Oppure, lavorando sul bit meno significativo
        r = (byte) numero;

        System.out.print("Numero binario: ");
        System.out.print((r>>7) & 1);
        r=(byte)(r<<1);
        System.out.print((r>>7) & 1);
        r=(byte)(r<<1);
        System.out.print((r>>7) & 1);
        r=(byte)(r<<1);
        System.out.print((r>>7) & 1);
        r=(byte)(r<<1);
        System.out.print((r>>7) & 1);
        r=(byte)(r<<1);
        System.out.print((r>>7) & 1);
        r=(byte)(r<<1);
        System.out.print((r>>7) & 1);
        r=(byte)(r<<1);
        System.out.print((r>>7) & 1);
        r=(byte)(r<<1);

        /*
        L'operazione AND bit a bit confronta i bit corrispondenti di byteN e 1. 
        Poiché il bit meno significativo di byteN è 1, il risultato sarà:

        ---------- 1:
        0b00000111
                        >> 7
        0b00000000      (byteN & 1):
        &
        0b00000001
        =
        0b00000000     = 0
        ---------- 2:
        0b00000111
                        << 1
        0b00001110      
                        >> 7
        0b00000000
        &
        0b00000001
        =
        0b00000000     = 0
        ---------- 3:
        0b00001110
                        << 1
        0b00011100      
                        >> 7
        0b00000000
        &
        0b00000001
        =
        0b00000000     = 0
        ---------- 4:
        0b00011100
                        << 1
        0b00111000      
                        >> 7
        0b00000000
        &
        0b00000001
        =
        0b00000000     = 0
        ---------- 5:
        0b00111000
                        << 1
        0b01110000      
                        >> 7
        0b00000000
        &
        0b00000001
        =
        0b00000000     = 0
        ---------- 6:
        0b01110000
                        << 1
        0b11100000      
                        >> 7
        0b00000001
        &
        0b00000001
        =
        0b00000001     = 1
        ---------- 7:
        0b11100000
                        << 1
        0b11000000      
                        >> 7
        0b00000001
        &
        0b00000001
        =
        0b00000001     = 1
        ---------- 8
        0b11000000
                        << 1
        0b10000000      
                        >> 7
        0b00000001
        &
        0b00000001
        =
        0b00000001     = 1
        ----------
        ----------
        */

        /* 
        Inserire un numero intero reappresentatible in un byte: 7
        00000111
        ---
        00000111
        */

        input.close();

    }
}
