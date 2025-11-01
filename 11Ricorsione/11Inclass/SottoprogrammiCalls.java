
public class SottoprogrammiCalls {

    private static int raddoppia(int valore) {

        System.out.println("Inizio: raddoppia");
        int risultato = valore * 2;
        System.out.println("Fine: raddoppia");
        return risultato;

    }

    private static int raddoppiaESommaUno(int valore) {

        System.out.println("Inizio: raddoppiaESommaUno");
        int risultato = raddoppia(valore) + 1;
        System.out.println("Fine: raddoppiaESommaUno");
        return risultato;

    }
    public static void main(String[] args) {

        int valore = 5;

        System.out.println(raddoppiaESommaUno(valore));
        System.out.println("Fine programma");

        /*
        PS C:\Users\marko.mirkovic\JavaPrograms\11Ricorsione\11Inclass> java SottoprogrammiCalls
        Inizio: raddoppiaESommaUno
        Inizio: raddoppia
        Fine: raddoppia
        Fine: raddoppiaESommaUno
        11
        */
        
    }
    
}
