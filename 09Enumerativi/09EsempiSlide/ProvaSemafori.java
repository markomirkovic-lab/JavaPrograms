enum Semaforo {
    ROSSO, GIALLO, VERDE
}

public class ProvaSemafori {
    public static void main(String[] args) {

        Semaforo sem1 = Semaforo.VERDE;
        Semaforo sem2 = Semaforo.ROSSO;

        if (sem1 == sem2) {
            System.out.println("Il colore dei semafori è uguale");
        } else {
            System.out.println("Il colore dei semafori è diverso");
        }

        /*
        Il colore dei semafori è diverso
        */
    }
}
