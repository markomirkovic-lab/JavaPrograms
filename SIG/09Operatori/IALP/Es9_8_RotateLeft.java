/*
9.8 Rotate left
L’istruzione rotate dei microprocessori funziona in questo modo:
Se il byte iniziale è 10100000, dopo un rotate left sarà 01000001.
Notate quindi che esegue uno shift riportando a destra il bit significativo perso
(vedi pdf)
*/

public class Es9_8_RotateLeft {

    public static void main(String[] args) {
        
        /*
        Rotazione riportando i bit perso
         10100000
                    << 1
         01000001

         10111111
                    << 1
         01111111
        */

        byte byteIniziale = (byte) (0b10111111);
        byte byteFinale;
        byte mask = (byte) (0b10000000);
        byte carry;

        System.out.println(String.valueOf(byteIniziale));//-65
        /*
        10111111    (-) MSB = 1
        01000000    inversione bit
               1    +
        01000001 =  (-) 65
        */

        /*
        Verifica se il bit piu' significativo e' 1
        10111111
                    &  (and)
        10000000
                    =
        10000000            
        */
        //              op and
        if((byteIniziale & mask) == mask) {
            carry = 0b00000001;
        } else {
            carry = 0b00000000;
        }

        // Esecuzione dello shift
        /*
        10111111
                    << 1
        01111110            
        */
        byteIniziale = (byte) (byteIniziale << 1);


        // Aggungimento dello riporto
        /*
        01111110    (+) MSB = 0
                    |  (or)
        00000001
                    =
        01111111    = 127
        */
        //                               op or
        byteIniziale = (byte) (byteIniziale | carry);

        System.out.println(byteIniziale);//127

    }
    
}
