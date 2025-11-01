package serie16_files;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SnippetSerie16_Manipolare_Paths_e_Files_parte2_Leggere_e_scrivere_files_di_testo 
{
    public static void main(String[] args) throws IOException 
    {                
        Path dc= Paths.get(".", "divina_commedia.txt");
        
        
        //Manipolare un file di testo. Il file di testo viene visto interamente e manipolato a livello di char
        leggiFileDiTestoUnCharAllaVolta(dc);
        

        //Manipolare un file di testo, una linea alla volta        
        leggiFileDiTestoUnaRigaAllaVolta(dc);
        

        //Manipolare un file di testo, una linea alla volta, variante 2        
        leggiFileDiTestoUnaRigaAllaVolta_v2(dc);                
    }
    
    
    /**
     * Questo metodo riceve in argomento un file di testo e lo manipola un carattere alla volta.
     * 
     * @param fileDaLeggere 
     */
    public static void leggiFileDiTestoUnCharAllaVolta(Path fileDaLeggere)
    {
        //Nella cartella del progetto netbeans ho copiato il testo della divina_commedia.txt
        //prelevato da http://www.gutenberg.org/cache/epub/1000/pg1000.txt
        
        try {
            //Trasferisco il file in memoria
            byte[] buffer = Files.readAllBytes(fileDaLeggere);

            //Trasformo l’array in stringa
            String testo= new String(buffer, Charset.forName("UTF-8"));                

            //Faccio passare l’intera stringa alla ricerca delle lettere e le conto
            int contaLettere=0;
            int contaCaratteriAlfabetici=0;
            int contaRitorniACapo=0;

            for(int i=0; i< testo.length(); i++)
            {
                char l= testo.charAt(i);

                if( Character.isAlphabetic(l) ) contaCaratteriAlfabetici++;

                if( l>='a' && l<='z' || l>='A' && l<='Z') contaLettere++;            

                if( l=='\n') contaRitorniACapo++;
            }
            
            //Se non finisce con un ritorno a capo, significa che l'ultima riga contiene qualcosa, quindi incremento il contatore delle righe
            if(!testo.endsWith("\n")) contaRitorniACapo++;            

            //Stampo a schermo quante lettere ho trovato       
            System.out.println("La divina commedia contiene: " + contaLettere + " caratteri 'a'..'z'");        
            System.out.println("La divina commedia contiene: " + contaCaratteriAlfabetici + " caratteri alfabetici");        
            System.out.println("La divina commedia è inoltre composta da " + contaRitorniACapo + " righe di testo");
        } 
        catch (IOException ex) 
        {
            System.out.println("Si è verificato un errore. " + ex.getMessage());
        }
    }
    
    
    
    /**
     * Questo metodo illustra come leggere un file di testo separandolo in linee.
     * 
     * @param fileDaLeggere 
     */
    public static void leggiFileDiTestoUnaRigaAllaVolta(Path fileDaLeggere)
    {
        try
        {
            //Leggo il file ed effettuò già la separazione delle righe
            List<String> lineeGiàSeparate= Files.readAllLines(fileDaLeggere, Charset.forName("UTF-8"));

            //Ora ho un array (una List, la spiegheremo in dettaglio più avanti)
            //dove ogni cella contiene una riga
            for(int i=0; i< lineeGiàSeparate.size(); i++)
            {
                String lineaAttuale= lineeGiàSeparate.get(i);            
            }
            System.out.println("Linee contenute: " +lineeGiàSeparate.size());
        }
        catch (IOException ex) 
        {
            System.out.println("Si è verificato un errore. " + ex.getMessage());
        }            
    }
    
    
    /**
     * Questo metodo illustra come leggere un file di testo separandolo in linee.<p>
     * A differenza del metodo precedente questo legge il file per intero e poi lo suddivide in righe<p>
     * senza utilizzare il metodo già presente nella classe Files.
     * 
     * @param fileDaLeggere 
     */    
    public static void leggiFileDiTestoUnaRigaAllaVolta_v2(Path fileDaLeggere)
    {
        try
        {
            //Leggo il file 
            byte[] all= Files.readAllBytes(fileDaLeggere);
            
            
            //Lo trasformo in stringa
            String testo= new String(all, Charset.forName("UTF-8"));


            //Se fosse un file generato dai sistemi Microsoft avrebbe i ritorni a capo 
            //composti da due char: \r\n.
            //Quindi per comodità li converto tutti nel ritorno a capo classico \n
            testo= testo.replaceAll("\r\n", "\n");

            
            //Se fosse un file generato dai vecchi sistemi Mac avrebbe i ritorni a capo 
            //composti dal char: \r
            //Quindi per comodità li converto tutti nel ritorno a capo classico \n
            testo= testo.replaceAll("\r", "\n");  
            

            //Se fosse un file generato dai sistemi Unix, il ritorno a capo sarebbe già quello classico \n
            //quindi non effettuo nessuna modifica

            
            
            //Se non finisce con un ritorno a capo, significa che l'ultima riga contiene qualcosa, quindi aggiungo un \n per poterla contare
            if(!testo.endsWith("\n")) testo+="\n";


            //Ora separo le righe
            String[] linee= testo.split("\n");
                    
            
            for(int i=0; i< linee.length; i++)
            {
                String lineaAttuale= linee[i];            
            }
            System.out.println("Linee contenute: " + linee.length);
        }
        catch (IOException ex) 
        {
            System.out.println("Si è verificato un errore. " + ex.getMessage());
        }        
    }    
}
