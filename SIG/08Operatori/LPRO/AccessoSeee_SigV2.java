
import java.util.Scanner;

public class AccessoSeee_SigV2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean afcCommercio = false;
        boolean afcInformatico = false;
        boolean afcMediamatico = false;
        boolean maturita = false;
        boolean accesso = false;
        boolean inserimentoFinito = false;
        double anniEsperienza = 0;

        
        System.out.print("Hai un AFC commercio? [si/no]: ");
        afcCommercio = input.next().toLowerCase().trim().charAt(0) == 's' ? true : false;
        input.nextLine();

        System.out.print("Hai un AFC informatico? [si/no]: ");
        afcInformatico  = input.next().toLowerCase().trim().charAt(0) == 's' ? true : false;
        input.nextLine();

        System.out.print("Hai un AFC mediamatico? [si/no]: ");
        afcMediamatico = input.next().toLowerCase().trim().charAt(0) == 's' ? true : false;
        input.nextLine();

        System.out.print("Hai una Maturita'? [si/no]: ");
        maturita = input.next().toLowerCase().trim().charAt(0) == 's' ? true : false;
        input.nextLine();

        System.out.print("Quanti anni di esperienza hai? [numero]: ");
        anniEsperienza = input.nextDouble();
        input.nextLine();

        // Espressione booleana di accesso
        accesso = afcCommercio || afcInformatico || afcMediamatico || 
                 (maturita && (anniEsperienza >= 3.0));// parentesi non necessarie, && ha precdenza su ||

        System.out.println("Accesso: " + accesso);
        System.out.println("-------");

        System.out.println("In base ai tuoi diplomi l'accesso e' " + (accesso ? "consentito" : "rifiutato"));
        
        input.close();

    }
    
}
