/*
6.6 Centralina
Una centralina elettronica che pilota un generatore elettrico a benzina necessita di spazio in 
memoria per registrare:
• La temperatura del sistema
• I giri del motore
• La temperatura esterna
• La quantità di carburante residua nel serbatoio
Se la memoria a sua disposizione è di 16B, riusciremo a farci stare tutto?
*/

public class Es6_6_Centralina {

    public static void main(String[] args) {

        /*
        • La temperatura del sistema                        float
        • I giri del motore                                 short
        • La temperatura esterna                            float
        • La quantità di carburante residua nel serbatoio   byte
        */

        System.out.println("float: " + Float.SIZE + " bit");
        System.out.println("short: " + Short.SIZE + " bit");
        System.out.println("byte: " + Byte.SIZE + " bit");
       

        System.out.println("Totale bit: " + ((int) Float.SIZE+Short.SIZE+Float.SIZE+Byte.SIZE));
        System.out.println(16*8);

        /*
        float: 32 bit
        short: 16 bit
        byte: 8 bit
        Totale bit: 88
        128 
        */

        //si
    }
    
}
