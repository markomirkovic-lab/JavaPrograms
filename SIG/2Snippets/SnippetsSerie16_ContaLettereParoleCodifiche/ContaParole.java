package serie16;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ContaParole 
{
    public static void main(String[] args) throws IOException 
    {                
        Path dc= Paths.get(".", "resources", "divina_commedia.txt");
        //   dc= Paths.get(".\\resources\\divina_commedia.txt");
        
        
        //Manipolare un file di testo. Il file di testo viene visto interamente e manipolato a livello di char
        int w= wordCount(dc);
        
        if(w==-1) System.out.println("Errore nella lettura del file");
        else System.out.println(dc.getFileName() + " contiene " + w + " parole!");
        
        
        wholeLetterCount(dc);
        wholeLetterCount2(dc);
    }
    
    
    /**
     * Questo metodo riceve in argomento un file di testo e lo manipola un carattere alla volta.
     * 
     * @param fileDaLeggere 
     */
    public static int wordCount(Path fileDaLeggere)
    {
        //Nella cartella del progetto netbeans ho copiato il testo della divina_commedia.txt
        //prelevato da http://www.gutenberg.org/cache/epub/1000/pg1000.txt
        
        try {
            //Trasferisco il file in memoria
            byte[] buffer = Files.readAllBytes(fileDaLeggere);

            //Trasformo l’array in stringa
            String testo= new String(buffer, Charset.forName("UTF-8")); 
            
            
            //Trasformo i ritorni a capo MS e Apple in Unix
            testo= testo.replace("\r\n", "\n").replace('\r', '\n'); 
            
            
            //Aggiungo un carattere separatore alla fine, per garantire di contare l'ultima parola
            testo+=".";

            int w=0;
            for(int i=0; i<testo.length()-1; i++)
            {
                if( !isSeparator(testo.charAt(i)) && isSeparator(testo.charAt(i+1)) ) w++;
            }
            
            return w;
        } 
        catch (IOException ex) 
        {
            System.out.println("Si è verificato un errore. " + ex.getMessage());
            return -1;
        }
    }
    
    
    public static boolean isSeparator(char c)
    {
        //Soluzione ottimale
        //if( Character.isLetterOrDigit(c) ) return false;
        //else return true;
        
        /*
        char[] sep= {' ', '\n', '\t' ,'.','~' };
        for(int i=0; i<sep.length; i++) 
            if(c==sep[i]) return true;
        return false;
        */
        
        /*
        String sep2= " .,-!$\n\t\r";
        for(int i=0; i<sep2.length(); i++) 
            if(c==sep2.charAt(i)) return true;
        return false;
        */
        
        //Soluzione artigianale, dovrete usarla per i casi speciali
        switch(c)
        {
            case ' ':
            case '\t':                
            case '.':
            case ',':
            case ';':    
            case ':':
            case '!':    
            case '?':
            case '\n':    
            case '\r':
                return true;
            default:
                return false;
        }
    }
    
    
    
    public static int letterCount(String s, char c)
    {
        int tot=0;
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)==c) tot++;
        }
        return tot;
    }
    
    
    
    public static void wholeLetterCount(Path fileDaLeggere)
    {
        //Nella cartella del progetto netbeans ho copiato il testo della divina_commedia.txt
        //prelevato da http://www.gutenberg.org/cache/epub/1000/pg1000.txt
        
        try {
            //Trasferisco il file in memoria
            byte[] buffer = Files.readAllBytes(fileDaLeggere);

            //Trasformo l’array in stringa
            String testo= new String(buffer, Charset.forName("UTF-8")); 
            
            
            //Trasformo i ritorni a capo MS e Apple in Unix
            testo= testo.replace("\r\n", "\n").replace('\r', '\n'); 
            

            String lettere= "abcdefghijklmnopqrstuvwxyz";
            for(int l=0; l<lettere.length(); l++)
            {
                int cc= letterCount(testo, lettere.charAt(l));
                System.out.println( lettere.charAt(l) + ": " + cc);
            }
        } 
        catch (IOException ex) 
        {
            System.out.println("Si è verificato un errore. " + ex.getMessage());
        }
    }  
    
    public static void wholeLetterCount2(Path fileDaLeggere)
    {
        //Nella cartella del progetto netbeans ho copiato il testo della divina_commedia.txt
        //prelevato da http://www.gutenberg.org/cache/epub/1000/pg1000.txt
        
        try {
            //Trasferisco il file in memoria
            byte[] buffer = Files.readAllBytes(fileDaLeggere);

            //Trasformo l’array in stringa
            String testo= new String(buffer, Charset.forName("UTF-8")); 
            
            
            //Trasformo i ritorni a capo MS e Apple in Unix
            testo= testo.replace("\r\n", "\n").replace('\r', '\n'); 
            

            int[] cont= new int[26];
            char[] contc= new char[26];
            for(int l='a'; l<='z'; l++)     //Riempio l'array delle lettere
                contc[l-'a']=(char)l;            
            for(int l=0; l<testo.length(); l++)
            {
                if(testo.charAt(l)>='a' && testo.charAt(l)<='z')
                {
                    cont[testo.charAt(l)-'a']++;                    
                }
            }
            
            for(int l=0; l<cont.length; l++)
            {
                System.out.println( contc[l] + ": " + cont[l]);
            }
        } 
        catch (IOException ex) 
        {
            System.out.println("Si è verificato un errore. " + ex.getMessage());
        }
    }      
}