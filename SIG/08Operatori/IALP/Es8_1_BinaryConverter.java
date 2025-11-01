/*
8.1 BinaryConverter
Dichiarate una variabile di tipo byte (che occupa 1B di memoria) e inizializzatela ad un 
valore. 
Scrivete il codice che permetta di rappresentarla in formato binario.
Potete usare unicamente quanto visto fino ad ora a lezione.
Esempio: 
se inseriamo 7, verrà stampato a video 00000111
*/

public class Es8_1_BinaryConverter {

    public static void main(String[] args) {
        
        byte variabile = 7;

        //  7   6   5   4   3   2   1   0
        // 2^7 2^6 2^5 2^4 2^3 2^2 2^1 2^0
        // 128  64  32  16   8   4   2   1
        //   0   0   0   0   0   4   2   1

        int base = 2;
        int esponente = 0;
        int pos1,pos2,pos3,pos4,pos5,pos6,pos7,pos8;
        int var1,var2,var3,var4,var5,var6,var7,var8;

        /*
        int pos1=0, pos2=0, pos3=0, pos4=0, pos5=0, pos6=0, pos7=0, pos8=0;
        int var1=0, var2=0, var3=0, var4=0, var5=0, var6=0, var7=0, var8=0;
        */


        
        var8 = variabile          / (base*base*base*base*base*base*base); // 2^7
        var7 = (variabile - var8) / (base*base*base*base*base*base); // 2^6
        var6 = (variabile - var7) / (base*base*base*base*base); // 2^5
        var5 = (variabile - var6) / (base*base*base*base); // 2^4
        var4 = (variabile - var5) / (base*base*base); // 2^3
        var3 = (variabile - var4) / (base*base); // 2^2
        var2 = (variabile - var3) / (base); // 2^1
        var1 = (variabile - var2) / (1); // 2^0
        
        System.out.println(var8);
        System.out.println(var7);
        System.out.println(var6);
        System.out.println(var5);
        System.out.println(var4);
        System.out.println(var3);
        System.out.println(var2);
        System.out.println(var1);

        System.out.println("---");

        /*
        var8 = variabile          / (base*base*base*base*base*base*base); // 2^7
        var7 = (variabile - var8) / (base*base*base*base*base*base); // 2^6
        var6 = (variabile - var7) / (base*base*base*base*base); // 2^5
        var5 = (variabile - var6) / (base*base*base*base); // 2^4
        var4 = (variabile - var5) / (base*base*base); // 2^3
        var3 = (variabile - var4) / (base*base); // 2^2
        var2 = (variabile - var3) / (base); // 2^1
        var1 = (variabile - var2) / (1); // 2^0
        */

        // Horner inverso (modulo %)
        var3 = variabile;
        pos3 = variabile % base;
        var2 = ((var3 - pos3)/base);
        pos2 = var2 % base;
        var1 = ((var2 - pos2)/base);
        pos1 = var1 % base;

        //System.out.println(pos4);
        System.out.print(""+"00000"+pos3+pos2+pos1);
        
        //System.out.print(""+pos8+pos7+pos6+pos5+pos4+pos3+pos2+pos1+"");


    }
    
}
