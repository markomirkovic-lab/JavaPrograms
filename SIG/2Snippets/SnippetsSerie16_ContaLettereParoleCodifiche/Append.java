package serie16;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Append
{
    public static void main(String[] args)
    {
        Path f= Paths.get(".", "resources", "testo.txt");


        
        
        //Salvo il file, specificando che deve essere creato, eliminandolo se c'è già
        //Il CREATE_NEW vi evita il controllo
        //      Files.exists(f);
        //perché se il file non esiste lo crea, altrimenti solleva un'eccezione evitando di effettuare degli APPEND
        try
        {            
            String testo= "tanto va";
            Files.write(f, testo.getBytes(Charset.forName("UTF-8")), StandardOpenOption.CREATE_NEW);
            
            
            
            //Aggiungo del testo, questa operazione la devo eseguire DOPO il CREATE_NEW
            //per avere la certezza che il file venga creato
            try
            {            
                String aggiungi= "\r\nla gatta al lardo";
                Files.write(f, aggiungi.getBytes(Charset.forName("UTF-8")), StandardOpenOption.APPEND);

                aggiungi= "\r\nche ci lascia";
                Files.write(f, aggiungi.getBytes(Charset.forName("UTF-8")), StandardOpenOption.APPEND);

                aggiungi= "\r\nlo zampino";
                Files.write(f, aggiungi.getBytes(Charset.forName("UTF-8")), StandardOpenOption.APPEND);
            } 
            catch (IOException ex)
            {
                System.out.println("Errore in scrittura/append!");
            }            
        } 
        catch (IOException ex)
        {
            System.out.println("Errore in scrittura CREATE_NEW!");
        }


        
        //Salvo nel file. Se il file esiste già non lo tocca in alcun modo
        //Il CREATE quindi crea un file solo non esiste
        try
        {            
            String testo= "tanto va";
            Files.write(f, testo.getBytes(Charset.forName("UTF-8")), StandardOpenOption.CREATE);
        } 
        catch (IOException ex)
        {
            System.out.println("Errore in scrittura CREATE!");
        }        
        
        
        
        //Leggiamolo
        try
        {            
            String letto= new String( Files.readAllBytes(f), Charset.forName("UTF-8"));
            
            System.out.println("\n\n\nIl file contiene:");
            System.out.println(letto);
        } 
        catch (IOException ex)
        {
            System.out.println("Errore in lettura!");
        }        
        
        
    }
}
