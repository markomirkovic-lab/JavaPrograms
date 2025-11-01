import java.util.Scanner;

public class Es10_6_GenereV3 {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);        
        
        String nome;
        
        //-------------------------------------------------------
        //Se dobbiamo scrivere più di una volta l'espressione per uscire da ciclo, allora conviene
        //usare un boolean da valorizzare UNA sola volta, e poi riutilizzarlo più volte.
        boolean interrompiCiclo;
        
        do
        {
            System.out.print("Inserisci un nome (o 'quit' per terminare): ");
            nome=in.nextLine().trim();
            
            interrompiCiclo= nome.toLowerCase().equals("quit");

            if(!interrompiCiclo)
            {
                if(nome.toLowerCase().equals("andrea"))
                    System.out.println("Femminile e maschile");
                else if(nome.charAt(nome.length()-1)=='a')
                    System.out.println("Femminile");
                else
                    System.out.println("Maschile");
            }
        } while(!interrompiCiclo);
        
        in.close();
    }
}
