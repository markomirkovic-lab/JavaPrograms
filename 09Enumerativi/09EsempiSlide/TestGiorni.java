enum Giorno {
    // index
    // 0        1       2           3       4       5       6
    LUNEDI, MARTEDI, MERCOLEDI, GIOVEDI, VENERDI, SABATO, DOMENICA
}

public class TestGiorni {
    public static void main(String[] args) {

        System.out.print("Il secondo giorno è: ");
        System.out.println(Giorno.values()[1].toString().toLowerCase());


        Giorno giornoDellaSettimana = Giorno.VENERDI;

        System.out.print("Il quinto giorno è: ");
        System.out.println(Giorno.values()[giornoDellaSettimana.ordinal()]);


        for (Giorno giorno : Giorno.values()) {
            System.out.print(giorno + " è il giorno numero ");
            System.out.println(giorno.ordinal() + 1);
        }

        /*
        Il secondo giorno è: martedi
        Il quinto giorno è: VENERDI
        LUNEDI è il giorno numero 1
        MARTEDI è il giorno numero 2
        MERCOLEDI è il giorno numero 3
        GIOVEDI è il giorno numero 4
        VENERDI è il giorno numero 5
        SABATO è il giorno numero 6
        DOMENICA è il giorno numero 7
        */
    }
}
