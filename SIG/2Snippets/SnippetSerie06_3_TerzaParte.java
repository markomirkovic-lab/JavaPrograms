public class SnippetSerie06_3_TerzaParte 
{
    /*
        Attenti all'indentazione!!!!!
        Esistono solo due modi.
    
        Primo modo: apertura sulla riga - nuova linea rientrata di un tab - chiusura allineata alla prima riga
              public static void main(String[] args) {    //Apertura sulla riga
                  int i;                                  //Nuova riga e rientro di un tab
                  i=7;
              }                                           //Chiusura allineata alla prima riga
    
        Secondo modo: apertura sulla riga seguente - nuova linea rientrata di un tab - chiusura allineata alla prima parentesi
              public static void main(String[] args) 
              {                                           //Apertura sulla nuova riga
                  int i;                                  //Nuova riga e rientro di un tab
                  i=7;
              }                                           //Chiusura allineata all'aperura
    */
    public static void main(String[] args) 
    {
        //Prima istruzione, che permette la stampa a video
        System.out.print( "Ciao" );         //Non va a capo dopo la stampa
        System.out.println( "Ciao" );       //Va a capo dopo la stampa
        
        
        
        //Dichiarazione di una variabile
        int i;
        
        //Dichiarazione di più variabili
        long l, l2, l3;
        
        //Inizializzazione
        i=3;
        l=l2=l3=78;     //Inizializzazione multipla

        //int a=b=c=d=3; non funziona
        int a,b,c,d; // prima dichiarare
        a=b=c=d=3;   // poi inizializzare

        //Dichiarazione e inizializzazione
        double base=8.567853;
        
        //Dichiarazione di costanti, il nome è tutto MAIUSCOLO
        final double PI=3.14;
                
        
        
        
        //Assegnazioni e precedenze
        i = 4;                  //Assegnazione semplice
        i = i + 3;              //Prende il valore i di, aggiunge 3, e sovrascrive il valore di con il nuovo valore!
        i = i + i * 3;          //Le espressioni sono lette da sinistra destra, rispettando le precedenze degli operatori!!!!!!!!!!!!
        //  -------->
                                //quindi prima fa i*3, poi prende il risultato (21) e vi aggiunge i (7).
                                //infine il risultato lo inserisce in i, che cambierà il suo valore da 7 a 28.
        System.out.println( i );//28
        
        i = 2 + 3 * (4 + 5);    //Con le parentesi possiamo alterare le precedenze. Prima esegue 4+5, poi farà 3*9, poi 2+27, infine assegna 29 a i.
        System.out.println( i );//29
        
        
        
        //Rassegna di tipi
        char carattere;         //2B. Carateri UNICODE. i Primi 128 corrispondo all'ASCII.      
        short interoCorto;      //2B. Numeri da               -32768 a                    32767                        
        int intero;             //4B. Numeri da          -2147483648 a               2147483647               
        long interoLungo;       //8B. Numeri da -9223372036854775808 a      9223372036854775807
        float singola;          //4B. Numeri da            +-1.4e-45 a           +-3.4028235e38
        double doppia;          //8B. Numeri da           +-4.9e-324 a +-1.7976931348623157e308
        boolean bool;           //2B. Valori True o False.
        String s;               //2B per ogni lettera contenuta + 2B per immagazzinare la lunghezza della stringa.
        
        
        
        //Letterali
        carattere = 'c';          //Carattere UNICODE
        carattere = '\'';         //Carattere speciale ', viene anticipato da un \
        carattere = '\"';         //Carattere speciale ", viene anticipato da un \
        carattere = '\\';         //Carattere speciale \, viene anticipato da un \
        carattere = '\n';         //Carattere speciale ritorno a capo, viene anticipato da un \
        carattere = '\t';         //Carattere speciale tabulatore, viene anticipato da un \. Attenti: la sua dimensione di solito è di 8 caratteri ma può cambiare su ogni PC.
        carattere = '\u2660';     //Carattere UNICODE espresso con valore esadecimale. In questo esempio un Picche. Attenti: il font potrebbe non avere il disegno.        
        
        intero = 7;               //In base 10
        intero = 07;              //In base 8, i numeri iniziano con uno 0
        intero = 0x12A;           //In base 16, i numeri iniziano con uno 0x
        intero = 0b1001;          //In base 2, i numeri iniziano con uno 0b
        
        interoCorto = 7;          //In base 10
        interoCorto = 07;         //In base 8, i numeri iniziano con uno 0
        interoCorto = 0x12A;      //In base 16, i numeri iniziano con uno 0x
        interoCorto = 0b1001;     //In base 2, i numeri iniziano con uno 0b
        
        interoLungo = 7L;         //In base 10
        interoLungo = 07L;        //In base 8, i numeri iniziano con uno 0
        interoLungo = 0x12AL;     //In base 16, i numeri iniziano con uno 0x
        interoLungo = 0b1001L;    //In base 2, i numeri iniziano con uno 0b
        
        singola = 3.4F;           //Solo in base 10
        singola = 3.4e2F;         //Con esponente
        singola = 3.F;            //L'importante è che ci sia il punto deicmale
        
        doppia = 3.4;             //Solo in base 10
        doppia = 3.4e2;           //Con esponente
        doppia = 3.;              //L'importante è che ci sia il punto deicmale

        s = "c \n \\ \" \u2660";  //Come per i char potete inserire caratteri speciali
        System.out.println(s); // c
                               // \ " ?
        s = "   Scuola SSSE-SIG   ";

        
        
        
        //Operazione con le stringhe
        //Le stringhe NON sono tipi primitivi ma oggetti. Il nome dle tipo iniza con una Maiuscola (String e non string).
        //Gli oggetti possono compiere della zione, grazie ai loro metodi.
        //I metodi sono richiamabili usando il punto dopo l'oggetto.
        s.length();                         //Lunghezza della stringa, ...
        System.out.println( s.length() );   //...21 char
        
        char cc;
        cc = s.charAt(0);         //Primo char della stringa        
        cc = s.charAt(s.length()-1);    //Ultimo char della stringa      
        
        String t;
        t = s + s;                      //Concatenare le string
        t = "ciao " + "a" + " tutti";
        t = "ciao " + s;
        
        t = s.toUpperCase();            //Stringa in maiuscolo
        t = s.toLowerCase();            //Stringa in minuscolo
        t = s.trim();                   //Stringa senza spazi prima e dopo il testo: "Scuola SSSE-SIG"
        
        i = s.indexOf("Scuola");        //Cerca la stringa "Scuola" in s. restituisce -1 se non la trova oppure l'indice da dove parte, in questo caso 3
        System.out.println(i);
        
        i = s.lastIndexOf("S");         //Cerca la stringa "S" in s, partendo dal fondo. restituisce -1 se non la trova oppure l'indice da dove parte, in questo caso 15
        System.out.println(i);

        //             012345678901234
        String test = "abcdeabcdeabcde";
        System.out.println(test.lastIndexOf("abcde"));//10
        
        t = s.substring(8);             //Taglia la stringa dalla posizione 8 fino alla fine: "a SSSE-SIG   "
        System.out.println( t );
        
        t = s.substring(8,12);          //Taglia la stringa dalla posizione 8 fino alla posizione 11: "a SS"
        System.out.println( t );
        
        //È possibile combinare in sequenza i metodi
        t = s.trim().toLowerCase().substring(3,7);      //Tolgo gli spazi prima e dopo (trim). Il risultato lo metto tutto in minuscolo (toLowerCase). Il risultato lo ritaglio dalla posizione 3 alla 6 (substring). "ola"
        System.out.println( t );
        
        //È possibile eseguire i metodi anche sui letterali stringa, non solo sulle variabili
        t = "Scuola".toUpperCase();
        
        //Gli oggetti NON si confrontano con == ma si usa il metodo equals.
        System.out.println( s.equals(t) );              //s è uguale a t? risultato false
        
        t = "ciao";
        System.out.println( t.equals("ciao") );         //t è uguale a "ciao"? risultato true
        
        
        
                
        //Attenti
        //L'uguale è l'operatore con la priorità minore!
        doppia = 7/2;     //Prima esegue una divisione (tra interi!!!!) e poi assegna al double. Il risultato sarà quindi 3.0
        System.out.println( doppia );
        
        doppia = 7.0/2;   //Ora invece, siccome nell'espressione c'è un double (7.0) il risultato sarà 3.5
        System.out.println( doppia );

        //I numeri in virgola, quando cambiano di base (da 10 a 2) non hanno SEMPRE una rappresentazione precisa, a causa dell'arrotondamento!
        doppia = 0.001345 + 0.001123;     //Dovrebbe dare 0.002468
        System.out.println( doppia );     //E infatti con il double lo fa
        
        singola = 0.001345F + 0.001123F;  //Dovrebbe dare 0.002468
        System.out.println( singola );    //Ma con il float sbaglia! 0.0024680002
        
        
        
        
        //Casting implicito. È quando Java riesce a convertire fra loro i formati (di solito i più piccoli sono convertiti nei più grandi.
        //Attenti: la stringa è considerata la più grande.
        doppia = singola + 3;           //singola viene castata a double, come pure il letterale 3.
        
        s = "ciao " + singola + i;      //interpeta da sinistra a destra, quindi casta singola a String e la unisce a "ciao ", poi casta i a String e la unisce al risultato precedente
        System.out.println( s );

        s = "ciao " + (singola + i);    //Ora è più chiaro, prima somma singola e i, opportumanete castate a double, e poi le unisce alla stringa "ciao "
        System.out.println( s );

        s = "ciao " + singola * i;      //Sempre da sinistra a destra, rispettando le precedenze: prima moltiplica poi casta a stringa e unisce il risultato a "ciao "
        System.out.println( s );
        
        s = singola + i + "ciao";       //Sempre da destra sinistra,  prima somma singola e i, opportumanete castate a double, e poi le unisce alla stringa "ciao"
        System.out.println( s );
        
        //Casting esplicito. È quando il programmatore forza la conversione, spesso per convertire a una variabile da un tipo più grande a uno più piccolo.
        singola = (float)doppia;        //Forzo la ocnversione di doppia in un float, cosciente che perderò precisione
        
        //--

        System.out.println();

        s = "ciao " + 3 + 2;      //interpeta da sinistra a destra, quindi casta singola a String e la unisce a "ciao ", poi casta i a String e la unisce al risultato precedente
        System.out.println( s );  //ciao 32

        s = "ciao " + (3 + 2);    //Ora è più chiaro, prima somma singola e i, opportumanete castate a double, e poi le unisce alla stringa "ciao "
        System.out.println( s );  //ciao 5

        s = "ciao " + 3 * 2;      //Sempre da sinistra a destra, rispettando le precedenze: prima moltiplica poi casta a stringa e unisce il risultato a "ciao "
        System.out.println( s );  //ciao 6
        
        s = 3 + 2 + "ciao";       //Sempre da destra sinistra,  prima somma singola e i, opportumanete castate a double, e poi le unisce alla stringa "ciao"
        System.out.println( s );  //5ciao
        
        
    }
}
