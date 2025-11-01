import java.util.Scanner;

public class Es10_5_TrimInternoV2 {
    
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);  
        
        System.out.print("Scrivi qualcosa con spazzi multipli tra parole: ");
        String frase= in.nextLine();        
        
        String trimmato= "";
        
        //Scorro la frase
        frase= frase.trim();
        for(int i=0; i<frase.length(); i++)
        {
            trimmato += frase.charAt(i);                                //Aggiungo il carattere
            
            if(frase.charAt(i)==' ' || frase.charAt(i)=='\t')           //Se è uno spazio
            {
                for(int j=i+1; j<frase.length(); j++)                   //Vado avanti fino a che... (j=i+1 verifica lo spazzio successivo)
                {
                    if(frase.charAt(j)==' ' || frase.charAt(j)=='\t')   //... trovo spazi, li ignoro, spostando l'indice i (preservando il primo spazio)
                    {
                        i=j;                        
                    }
                    else
                    {
                        break;                                          //... non è uno spazio, smetto di cercare e riprendo a scorrere la stirnga con i
                    }
                }
            } 
            /*
            012345678910
            Ciao   Mario
            012345678910
                x          if 1
                i=4
            012345678910
                 x         if 2
                 i=j = 5  
            012345678910
                  x        if 2
                  i=j = 6
                  break
            012345678910
            i =    7       all uscita dal primo ciclo for
            */                        
        }
        System.out.println("[" + trimmato + "]");                
    }

}
