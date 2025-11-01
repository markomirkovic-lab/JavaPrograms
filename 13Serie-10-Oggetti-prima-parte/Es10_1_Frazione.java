/*
Sviluppate una classe che rappresenti una frazione (numeratore e denominatore).
Utilizzate questa classe in un programma che permetta di creare e immagazzinare 8
frazioni (inizializzate con valori a vostra scelta). Tutte le frazioni memorizzate dovranno
essere ridotte ai minimi termini, calcolando il massimo comun divisore (algoritmo di
Euclide):
“Dati due numeri naturali a e b (con a > b), si controlla se b è zero. Se lo
è, a è il MCD. Se non lo è, si calcola a / b e si assegna ad r il resto della
divisione. Se r è uguale a 0, allora si può terminare affermando che b
è il MCD cercato, altrimenti occorre assegnare a = b e b = r e ripetere
nuovamente la divisione.”
MCD e' il piu' grande divisore comun dei numeri considerati. Esempio pratico:
Calcoliamo il MCD di 48 e 18 usando l'algoritmo di Euclide:
a=48, b=18. 
Calcoliamo il resto: 48 mod 18 = 12
Assegniamo 
a=18, b=12
Calcoliamo il resto: 
18 mod 12 = 6.
Assegniamo 
a=12, b=6
Calcoliamo il resto: 
12 mod 6 = 0
Poiché il resto è 0, il MCD è 6, b=6.
--- semplificazione:
48 / 18 = 6 * 8 / 6 * 3 = 8/3
(48 / 6)  /  (18 / 6)  = 8/3  

Scrivete inoltre le procedure/funzioni necessarie per eseguire le seguenti operazioni:
• sommare due frazioni, ritornando il risultato in un nuovo oggetto
• moltiplicare due frazioni, ritornando il risultato in un nuovo oggetto
• calcolare l’opposto di una frazione, ritornando il risultato in un nuovo oggetto
• calcolare l’inverso di una frazione, ritornando il risultato in un nuovo oggetto
• stampare a schermo una frazione
Assicuratevi di collaudare, all’interno del programma, tutte le procedure/funzioni
sviluppate. 

Assicuratevi di collaudare, all’interno del programma, tutte le procedure/funzioni
sviluppate.

Somma di due frazioni: a / b + c / d = ad+bc / bd 

Prodotto di due frazioni: a / b * c / d = ac / bd

Opposto di a / b = − a / b

Inverso di a / b = b / a

*/

/**
 * Classe che rappresenta una frazione (numeratore e denominatore)
 */
class Frazione {
    long numeratore;
    long denominatore;



    Frazione(long numeratore, long denominatore) {
        this.numeratore = numeratore;

        if(denominatore == 0) {
            // Evitare di avere un denominatore uguale a 0
            this.denominatore = 1;
        } 
        else if (denominatore < 0) {
            // Fare in modo che il denominatore sia sempre positivo 
            // mantendo il segno della frazione invertendo il segno
            // del numeratore e del denominatore
            this.numeratore *= -1;
            this.denominatore *= -1;
        }
        else {
            // Quado il denominatore e' positivo
            this.denominatore = denominatore;
        }
    }

}

public class Es10_1_Frazione {


    /**
     * Calcola restituisce la somma delle due frazioni
     * 
     * @param frazione1 primo addendo
     * @param frazione2 secondo addendo
     * @return una nuova frazione, ridotta ai minimi termini, contentente la somma delle due frazioni
     */
    private static Frazione somma(Frazione frazione1, Frazione frazione2) {
        long numeratore = frazione1.numeratore * frazione2.denominatore + frazione2.numeratore * frazione1.denominatore;
        long denominatore = frazione1.denominatore * frazione2.denominatore;

        Frazione risultato = new Frazione(numeratore, denominatore);
        riduci(risultato);

        return risultato;
    }

    /**
     * Calcola e restituisce il prodotto della due frazioni
     * 
     * @param frazione1 primo moltiplicando
     * @param frazione2 secondo moltiplicando
     * @return una nuova frazione, ridotta ai minimi termini, contenente la moltiplicazione delle due frazioni
     */
    private static Frazione moltipilca(Frazione frazione1, Frazione frazione2) {
        long numeratore = frazione1.numeratore * frazione2.numeratore;
        long denominatore = frazione1.denominatore * frazione2.denominatore;

        Frazione risultato = new Frazione(numeratore, denominatore);
        riduci(risultato);

        return risultato;
    }

    /**
     * Calcola e restituisce l'opposto della frazione
     * 
     * @param frazione frazione di partenza
     * @return una nuova frazione che e' l'opposto di quella passata come parametro
     */
    private static Frazione opposto(Frazione frazione) {
        return new Frazione(frazione.numeratore * -1, frazione.denominatore);
    }

    /**
     * Calcola e restituisce l'inversa della frazione
     * 
     * @param frazione frazione di partenza
     * @return una nuova frazione che l'inversa di quella passata come parametro
     */
    private static Frazione inverso(Frazione frazione) {
        return new Frazione(frazione.denominatore, frazione.numeratore);

    }

    /**
     * Stampa a schermo la frazione
     * 
     * @param frazione frazione da stampare a schermo
     */
    private static void stampa(Frazione frazione) {
        System.out.println(frazione.numeratore + " / " + frazione.denominatore);
    }

    /**
     * Riduce la frazine ai minimi termini
     * 
     * @param frazione frazione da ridurre ai minimi termini
     */
    private static void riduci(Frazione frazione) {
        long mcd = 0;

        long numeratore = Math.abs(frazione.numeratore);
        long denominatore = Math.abs(frazione.denominatore);

        // primo valore deve essere maggiore del secondo
        if(numeratore > denominatore) {
            mcd = mCDivisore(numeratore, denominatore);
        }
        else if (numeratore < denominatore) {
            mcd = mCDivisore(denominatore, numeratore);
        }
        else {
            // se sono uguali, non serve calcolare il MCD
            mcd = numeratore;
        }

        // semplificazione della frazione    
        if(mcd != 0) {
            frazione.numeratore /= mcd;
            frazione.denominatore /= mcd;
        }
    }
 
    /**
     * mcd
     * si calcola a / b e si assegna ad r il resto della divisione utilizzando l'argorimo di Euclide. 
     * Se r è uguale a 0, allora si può terminare affermando che b è il MCD cercato, 
     * altrimenti occorre assegnare a = b e b = r e ripetere nuovamente la divisione.
     * @param a primo valore (deve essere maggiore di b)
     * @param b secondo valore (deve essere minore di a)
     * @return massimo comune divisiore tra a e b
     */
    private static long mCDivisore(long a, long b) {
        long r = a % b;
        while(r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }

    /*
    // Versione ricorsiva
    private static long MCD(long a, long b) {
        return b == 0 ? a : MCD(b, a % b);
    }
    */





    public static void main(String[] args) {
        
        /*
        double a = 48;
        double b = 18;
        double mcd = 48%18;//48 - (2*18) = 12 resto
        System.out.println(mcd);//12
        */

        //  programma che permetta di creare e immagazzinare 8 frazioni (inizializzate con valori a vostra scelta)
        Frazione[] frazioni = new Frazione[8];

        for(int i = 0; i < frazioni.length; i++) {
            Frazione frazione = new Frazione((long) (Math.random() * 15) + 1, (long) (Math.random() * 10) + 1);
            riduci(frazione);
            frazioni[i] = frazione;
        }

        System.out.println("--------------------");

        for(int i = 0; i < frazioni.length; i++) {
            System.out.print("Frazione " + (i+1) + " = ");
            stampa(frazioni[i]);
        }

        // Eseguire alcune operazioni sulle frazioni

        System.out.println("--------------------");

        System.out.print("Fr1 + Fr2 = ");
        stampa(somma(frazioni[0], frazioni[1]));

        System.out.print("fr3 * fr4 = ");
        stampa(moltipilca(frazioni[2], frazioni[3]));

        System.out.print("-fr5 = ");
        stampa(opposto(frazioni[4]));

        System.out.print("inversa fr 6 = ");
        stampa(inverso(frazioni[5]));

        System.out.println("--------------------");

        /*
        --------------------
        Frazione 1 = 5 / 2
        Frazione 2 = 15 / 1
        Frazione 3 = 2 / 3
        Frazione 4 = 14 / 9
        Frazione 5 = 11 / 10
        Frazione 6 = 5 / 4
        Frazione 7 = 10 / 1
        Frazione 8 = 3 / 2
        --------------------
        Fr1 + Fr2 = 35 / 2
        fr3 * fr4 = 28 / 27
        -fr5 = -11 / 10
        inversa fr 6 = 4 / 5
        --------------------
        */

    }
    
}
