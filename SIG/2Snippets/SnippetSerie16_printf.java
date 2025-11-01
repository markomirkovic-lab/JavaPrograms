public class SnippetSerie16_printf 
{
    public static void main(String[] args) 
    {
        //https://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html
        
        
        //Stampiamo il simbolo '%'
        //Essendo un carattere di controllo va "escapato"
        System.out.printf("%%\n");
        
        boolean b= true;
        int i= 13;
        double d= Math.PI;
        char c= 'c';
        String s= "ciao";
        
        //Il principio è semplice:
        //In una stringa inserite dei segnaposto che sono sempre in questo formato
        //  %qlT
        //dove
        //  %   è il carattere % e identifica l'inizio del segnaposto
        //  q   è un qualificatore, può non esserci
        //          -   allinea a sinistra
        //          +   stampa il segno del numero
        //  l   è la lunghezza da dedicare al campo, può anche non esserci
        //  T   è il tipo del segnaposto, fra i più comuni
        //          b   boolean
        //          c   char
        //          s   String
        //          d   intero in base dieci
        //          o   intero in base 8
        //          x   intero in base 16
        //          f   numero con la virgola
        //          e   come f, ma in formato esponenziale
        //          g   come f, ma in formato ingegneristico
        //
        //Esempi
        //  %-7.2f  Numero con la virgola, allineato a sinistra, con due decimali, su 7 spazi
        //  %7x     Numero intero in esadecimale, allineato a destra su 7 spazi
        System.out.printf("esempio 1 [%-7.2f]\n", d); //Le [] mostrano lo spazio riservato
        System.out.printf("esempio 2 [%7d]\n", i);    //Le [] mostrano lo spazio riservato
        System.out.printf("esempio 3 [%-7d]\n", i);   //Le [] mostrano lo spazio riservato
        System.out.printf("esempio 4 [%+7d]\n", i);   //Le [] mostrano lo spazio riservato
        
        
        System.out.printf("esempio 5 [%b] [%c] [%s] [%d] [%o] [%x] [%f] [%e] [%g]\n", b, c, s, i, i, i, d, d, d);
        
        //Posso anche memorizzare in una stringa, da stampare poi in seguito
        String tmp= String.format("%9x", i*i);
        System.out.println(tmp);
    }
}
