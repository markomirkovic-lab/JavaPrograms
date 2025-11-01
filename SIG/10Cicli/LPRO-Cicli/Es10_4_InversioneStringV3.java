import java.util.Scanner;

public class Es10_4_InversioneStringV3 {

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);  
        
        String frase= in.nextLine();        
        
        //Testato con
        //  "a    b    c"
        //  "    a   b"
        //  "a    b   "
        
        String trimmato = "";
        String trimmatoInverso = "";
        
        //Scorro la frase
        frase= frase.trim();

        for(int i=0; i<frase.length(); i++)
        {                                          
            if(frase.charAt(i)==' ' || frase.charAt(i)=='\t')           //Se è uno spazio
            {
                for(int j=i+1; j<frase.length(); j++)                   //Vado avanti fino a che...
                {
                    if(frase.charAt(j)==' ' || frase.charAt(j)=='\t')   //... trovo spazi, li ignoro, spostando l'indice i
                    {
                        i=j;                        
                    }
                    else
                    {
                        break;                                          //... non è uno spazio, smetto di cercare e riprendo a scorrere la stirnga con i
                    }
                }
            } else {
                trimmato += frase.charAt(i); //Aggiungo il carattere
            }                        
        }
        System.out.println("trimmato:\t\t [" + trimmato + "]");    
        
        // Trimato inverso
        for(int i=frase.length()-1; i >= 0; i--)
        {                                          
            if(frase.charAt(i)==' ' || frase.charAt(i)=='\t' || frase.charAt(i)==' ' + '\t' || frase.charAt(i)=='\t'+' ')           //Se è uno spazio
            {
                for(int j=i-1; j<frase.length(); j++)                   //Vado avanti fino a che...
                {
                    if(frase.charAt(j)==' ' || frase.charAt(j)=='\t')   //... trovo spazi, li ignoro, spostando l'indice i
                    {
                        i=j;                        
                    }
                    else
                    {
                        break;                                          //... non è uno spazio, smetto di cercare e riprendo a scorrere la stirnga con i
                    }
                }
            } else {
                trimmatoInverso += frase.charAt(i); //Aggiungo il carattere
            }                        
        }
        System.out.println("trimmato inverso:\t [" + trimmatoInverso + "]");

        // Chiusura scanner
        in.close();
    }
}
