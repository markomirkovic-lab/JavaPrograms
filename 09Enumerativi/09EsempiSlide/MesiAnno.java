enum Mese {
    GENNAIO, FEBBRAIO, MARZO, APRILE, MAGGIO, GIUGNO, LUGLIO, AGOSTO, 
    SETTEMBRE, OTTOBRE, NOVEMBRE, DICEMBRE
}

public class MesiAnno {
    public static void main(String[] args) {

        int giorno = 31;
        Mese mese = Mese.DICEMBRE;
        int anno = 2017;

        System.out.println("Prima: " + giorno + " " + mese + " " + anno);

        if (giorno == 31 && mese == Mese.DICEMBRE) {
            giorno = 1;
            mese = Mese.GENNAIO;
            anno++;
        }

        System.out.println("Dopo: " + giorno + " " + mese + " " + anno);

        /*
        Prima: 31 DICEMBRE 2017
        Dopo: 1 GENNAIO 2018
        */
    }
}
