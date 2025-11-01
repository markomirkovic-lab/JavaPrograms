enum Mese {
    GENNAIO, FEBBRAIO, MARZO, APRILE, MAGGIO, GIUGNO, LUGLIO, AGOSTO, 
    SETTEMBRE, OTTOBRE, NOVEMBRE, DICEMBRE
}

enum Giorno {
    LUNEDI, MARTEDI, MERCOLEDI, GIOVEDI, VENERDI, SABATO, DOMENICA
}

public class GiorniEMesi {
    public static void main(String[] args) {

        Giorno giorno = Giorno.VENERDI;
        Mese mese = Mese.OTTOBRE;

        System.out.print("Sono della bilancia poiché sono nato in " + mese + "; ");
        System.out.println("è il " + (mese.ordinal() + 1) + "° mese dell'anno.");

        System.out.print("La settimana lavorativa termina al " + giorno + ". ");
        System.out.println(giorno + " è il " + (giorno.ordinal() + 1) + "° giorno della settimana.");

        /*
        Sono della bilancia poiché sono nato in OTTOBRE; è il 10° mese dell'anno.
        La settimana lavorativa termina al VENERDI. VENERDI è il 5° giorno della settimana.
        */
    }
}
