
public class IntroArray0 {
    public static void main(String[] args) {
        
        // Primo modo
        int[] voti;
        voti = new int[5];
        System.out.println(voti);

        // Secondo modo
        int[] voti2 = new int [5];
        System.out.println(voti2);

        // Terzo modo
        int[] voti3 = {28, 30, 25, 27, 29};
        System.out.println(voti3);

        // Prima cella ha indice 0

        // Assegnare valori
        voti[0] = 28; //primo elemento
        voti[1] = 30; //secondo elemento

        // Leggere valori
        int primoVoto = voti[0];
        System.out.println("Il primo voto e': " + primoVoto);

        // Lunghezza dell'array
        int numeroVoti = voti.length;

        // Attenzione: l'ultimo indice valido e' length-1
        // Questo e' coretto:
        int ultimoVoto = voti[voti.length - 1];

        // Questo compilera' ma dara' errore a runtime!
        // int errore = voti[voti.length]; // ArrayIndexOutOfBoundsException

        // Esempio pratico

        // Creiamo un array di temperature
        double[] temperature = new double[7]; // temperature della settimana

        // Inseriamo alcuni valori
        temperature[0] = 22.5;  // luendi'
        temperature[1] = 23.0;  // martedi'
        temperature[3] = 21.5;  // mercoledi'

        // Calcoliamo la media delle temperature
        double somma = 0;

        for (int i = 0; i < temperature.length; i++) {
            somma += temperature[i];
        }

        double media = somma / temperature.length; // divisione double
        System.out.println("La temperatura media e': " + media);

        /*
        Gli array hanno dimensione fissa
        Gli indici partono da 0
        Tutti gli elementi devono essere dello stesso tipo

        Possiamo accedere alla lunghezza con .length
        
        length per le stringe e' un metodo e ci vogliono le parentesi ()
        length per gli array e' un estensione della classe
         */



    }
    
}
