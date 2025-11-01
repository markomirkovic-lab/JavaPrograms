import java.util.Scanner;

public class RilevamentoVelocitaV2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int velocitaRilevata;
        int limiteVelocita;
        int deltaVelocita;
        int multa = 0;
        boolean denuncia = false;

        System.out.print("Inserisci la velocita': ");
        velocitaRilevata = input.nextInt();

        System.out.print("Inserisci il limite della velocita': ");
        limiteVelocita = input.nextInt();

        deltaVelocita = velocitaRilevata - limiteVelocita;

        if(deltaVelocita <= 0) {
            multa = 0;
            denuncia = false;
        } else if(deltaVelocita <= 5) {
            multa = 40;
            denuncia = false;
        } else if(deltaVelocita <= 10) {
            multa = 120;
            denuncia = false;
        } else if(deltaVelocita <= 15) {
            multa = 250;
            denuncia = false;
        } else {// else if(deltaVelocita >= 16)
            multa = 0;
            denuncia = true;
        }

        System.out.println("Velocita' rilevata: \t" + velocitaRilevata);
        System.out.println("Limite di velocita': \t" + limiteVelocita);
        System.out.println("Delta velocita': \t" + deltaVelocita);
        System.out.println("Multa: \t\t\t" + multa);
        System.out.println("Denuncia: \t\t" + denuncia);

        input.close();
       
    }
    
}
