package varie;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TextFormatter 
{
    public static String reformat(Path source)
    {
        /*
         ok il carattere a capo non è ammesso
         ok non ci sono spazi (' ') all’inizio e alla fine del testo
         ok non ci sono spazi multipli
         ok non ci sono spazi prima di un carattere di punteggiatura ('.', ',', ';', ':', '!', '?')
            dopo un carattere di punteggiatura c’è sempre uno spazio, a meno che:
         ok     sia l’ultimo carattere del testo (regola 2.)
                sia seguito da un altro carattere di punteggiatura (regola 4.)        
        */
        
        String d= "";
        
        try
        {
            
            
            
            byte[] buf= Files.readAllBytes(source);
            String s= new String(buf, Charset.forName("UTF-8"));
            s= s.trim();            
            
            System.out.println("-----------\n" + s + "\n--------------");           //Non era richiesto dall'esercizio, lo stampa solo per avere un output visivo

            for(int i=0; i<s.length()-1; i++)
            {
                char c= s.charAt(i);
                char cn= s.charAt(i+1);
                                
                if(c=='\r' || c=='\n')                                              //Se è un ritorno a capo eliminalo
                    d= d + "";                
                else if(c==' ' && cn==' ')                                          //Spazi multipli, vanno eliminati
                    d= d+ "";
                else if(c==' '  && isPunteggiatura(cn))                             //Spazio seguito da punteggiatura, va tolto
                    d= d+ "";
                else if(isPunteggiatura(c) && isPunteggiatura(cn))                  //punteggiatura seguita da punteggiatura, va lasciato senza agigugnere spazi 
                    d= d+ c;
                else if(isPunteggiatura(c) && (cn==' '))                            //Punteggiatura seguita da spazio, va lasciata
                    d= d+ c;
                else if(isPunteggiatura(c) && 
                        !(isPunteggiatura(cn) || cn==' ' || cn=='\r' || cn=='\n'))  //Punteggiatura non seguita da punteggiatura o spazi o ritorni a capo
                    d= d+ c + " ";
                else d= d+ c;    
                
                if(i==s.length()-2) d=d+ cn;                                        //L'ultimo carattere lo aggiungo
            }
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(TextFormatter.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return d;
    }
    
    
    
    public static boolean isPunteggiatura(char c)
    {
        if(".,;:!?".indexOf(c)>-1) return true;
        else return false;
    }
    
    
    public static void main(String[] args) 
    {
        String r= reformat(Paths.get(".", "resources","q.txt"));
        
        System.out.println(r);
        
        String expected= "John, Malkovich? John: Malkovich!!!! John Malkovich!?!? John; Malkovich...";        
        if(r.equals(expected))
            System.out.println("Test passed!");
        else
            System.out.println("Expected:\n" + expected);
    }
}
