import java.util.Scanner;

public class Es10_6_GenereV2 {
    
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);  
       
        String nome;

        //---------------------------------------------------------
        //Versione un po' macchinosa, comporta la scrittura del criterio di 
        //uscita da ciclo, più di una volta. Alla riga 22 e alla riga 31
        do
        {
            System.out.print("Inserisci un nome (o 'quit' per terminare): ");
            nome=in.nextLine().trim();

            if(!nome.toLowerCase().equals("quit"))
            {
                if(nome.toLowerCase().equals("andrea"))
                    System.out.println("Femminile e maschile");
                else if(nome.charAt(nome.length()-1)=='a')
                    System.out.println("Femminile");
                else
                    System.out.println("Maschile");
            }
        } while(!nome.toLowerCase().equals("quit"));

        in.close();
    }
}
