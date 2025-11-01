import java.util.Scanner;

public class Es10_4_InversioneStringV2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci una cifra: ");
        String cifra = input.nextLine();
        String cifraTrimmata = cifra.trim();

        String numero = "";
        String numeroInverito = "";

        // numero originale
        for(int i = 0; i < cifraTrimmata.length(); i++) {

            if(cifraTrimmata.charAt(i) != ' ' && cifraTrimmata.charAt(i) != '\t') {
                numero += cifra.charAt(i);
            }
        }
        System.out.println("numero: \t\t" + numero);

        // numero invertito
        for(int i = cifraTrimmata.length()-1; i >= 0; i--) {

            if(cifraTrimmata.charAt(i) != ' ' && cifraTrimmata.charAt(i) != '\t') {
                numeroInverito += cifra.charAt(i);
            }
        }
        System.out.println("numero invertito: \t" + numeroInverito);

        // close scanner
        input.close();
    }
    
}

