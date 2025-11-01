
import java.util.Scanner;

public class AccessoSeee_Sig {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean afcCommercio = false;
        boolean afcInformatico = false;
        boolean afcMediamatico = false;
        boolean maturita = false;
        boolean accesso = false;
        boolean inserimentoFinito = false;
        double anniEsperienza = 0;

        System.out.println("Inserisci i requisiti formali di accesso \n****************************************\n");

        do {

            System.out.print("AFC commercio [si/no]: ");
            //afcCommercio = input.next();
            afcCommercio = input.next().toLowerCase().trim().equals("si");
            //System.out.println("afcCommercio: " + afcCommercio);
            input.nextLine();

            System.out.print("AFC informatico [si/no]: ");
            afcInformatico = input.next().toLowerCase().trim().equals("si"); 
            //afcInformatico = Boolean.valueOf(input.next().toLowerCase().trim());
            input.nextLine();

            System.out.print("AFC mediamatico [si/no]: ");
            afcMediamatico = input.next().toLowerCase().trim().equals("si"); 
            //afcMediamatico = Boolean.valueOf(input.next().toLowerCase().trim());
            input.nextLine();

            System.out.print("Maturita' [si/no]: ");
            maturita = input.next().toLowerCase().trim().equals("si"); 
            //maturita = Boolean.valueOf(input.next().toLowerCase().trim());
            input.nextLine();

            System.out.print("Numero anni di esperienza: ");
            anniEsperienza = input.nextDouble();
            input.nextLine();

            inserimentoFinito = true;

        } while (!inserimentoFinito);

        // Espressione booleana di accesso
        accesso = afcCommercio || afcInformatico || afcMediamatico || 
                 (maturita && (anniEsperienza >= 3.0));// parentesi non necessarie, && ha precdenza su ||

        System.out.println("Accesso: " + accesso);
        System.out.println("-------");

        if(accesso) {
            System.out.println("L'accesso e' garantito.");
        } else {
            System.out.println("L'accesso e' negato.");
        }

        input.close();

    }
    
}
