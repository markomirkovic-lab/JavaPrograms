import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Comparator;

public class SnippetSerie16_Manipolare_Paths_e_Files_parte1 
{
    public static void main(String[] args) throws IOException 
    {
        //Classi e librerie per:
        //- descrivere i files e le directory, e navigare attraverso i path
        //      Path e Paths
        //- manipolare i files, come fate dal File Explorer
        //      Files
        //
        //
        //Di seguito trovate alcune operazioni di base che potete riutilizzare.
        
        
        //------------------------------------------------------------------------------------------
        //Ok, partiamo con un percorso relativo.
        //Proviamo a capire quando parte un programma da NetBeans in quale directory si trova
        Path io= Paths.get(".");    //. vuol dire qui, nella mia directory  
        
        io= io.toAbsolutePath();    //Chiedo di trasformare il mio percorso relativo in assoluto        
        System.out.println(io);     //Scopriamo che mi trovo nella directory del progetto NetBeans
        
        
        io= io.normalize();         //Tolgo tutti i riferimenti relativi
        System.out.println(io);     //È sparito l'ultimo '.'
        System.out.println("-------------------\n\n\n");
        
        
        
     
        //------------------------------------------------------------------------------------------
        //Bene, ora creiamo una sottodirectory chiamata "sub1", che contiene a sua volta "sub2"
        Path subDir= Paths.get(".\\sub1\\sub2");
        
        //Risolviamo il percorso relativo rispetto alla nostra directory
        subDir= io.resolve(subDir).normalize();
        
        System.out.println(subDir);
        System.out.println("-------------------\n\n\n");
        
        
        
        
        //------------------------------------------------------------------------------------------
        //Adesso le creiamo.
        //!!!!!!!!! ATTENZIONE POTETE FARE DANNI !!!!!!!!                
        try 
        {            
            //  Se c'è già             ed è una directory
            if( Files.exists( subDir ) && Files.isDirectory(subDir) )    
            {
                System.out.println("Esiste già");
            }
            else
            {
                Files.createDirectories(subDir);
            }
            
            //createDirectories    crea tutte le directory inesistenti indicate nel path!
            //createDirectory      invece crea l'ultima directory indicata nel path, 
            //                     se in mezzo ne manca qualcuna, fallisce
            
            
            
            
            //------------------------------------------------------------------------------------------
            //Bene, ora creiamo un file vuoto nell'ultima directory
            Path file= subDir.resolve( Paths.get("esempio.txt") );
            
            
            //  Se il file esiste  ed è un file
            if( Files.exists(file) && !Files.isDirectory(file) )   
            {
                System.out.println("File esiste");
            }
            else
            {
                Files.createFile( file );
            }
            
            
            
            
            //------------------------------------------------------------------------------------------
            //Ora nel vostro progetto avrete
            //      sub1
            //          sub2
            //              esempio.txt
            System.out.println("-------------------\n\n\n");
            
            
            
            
            //------------------------------------------------------------------------------------------
            //Un po' di operazioni comuni, esempio la copia di un file
            file= subDir.resolve(file);                                         //Percorso assoluto per file
            Path file2= subDir.resolve( Paths.get("copia esempio.txt") );       //Punto ad un secondo file
            
            if( Files.exists(file2) )       //Se il secondo file non esiste
            {
                Files.delete(file2);        //Prima lo cancello
                Files.copy(file, file2);    //poi lo copio                
            }
            else
            {
                Files.copy(file, file2);    //Lo copia               
            }
            
            //Con questo codice sovrascrivete l'eventuale file già presente
            //Files.copy(file, file2, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("-------------------\n\n\n");
            


            
            //------------------------------------------------------------------------------------------
            //Infine navighiamo nel path
            System.out.println( subDir.getParent() );               //Equivale a spostarsi in ..
            System.out.println( subDir.getParent().getParent() );   //Equivale a spostarsi in ..\..
            System.out.println("-------------------\n\n\n");
            
            
            
            
            //------------------------------------------------------------------------------------------
            //Scorriamo tutte le directory sopra il nostro file 
            //file=C:\Temp\Serie16\Serie16_Files\sub1\sub2\esempio.txt
            System.out.println("Path: file.getRoot(): " + file.getRoot() );            
            for(int i=0; i< file.getNameCount(); i++)
            { 
                System.out.println( "\tfile.getName(" + i + "): " + file.getName(i) );
                
                //Non so solo il nome della directory intermedia
                //Ho pure il path                
                Path tmp= file.getRoot().resolve(file.subpath(0, i+1));
                System.out.println("\t\t\tfull path: " + tmp);
            }   
            System.out.println("file.getFileName(): " + file.getFileName());
            System.out.println("-------------------\n\n\n");
            
            
            
            
            //------------------------------------------------------------------------------------------
            //Per i più curiosi. Il carattere di separazione valido sul S.O. nel quale gira il software è
            char sep= File.separatorChar;
            
            
            
            
            
            //------------------------------------------------------------------------------------------
            //Il codice seguente, per ora troppo complesso da spiegarvi, potete usarlo per eliminare una directory
            //e TUTTO il suo contenuto, sottodirectory comprese            
            Path daEliminare= Paths.get("C:", "Temp", "daeliminare", "interno");
            if(!Files.exists(daEliminare))
            {
                Files.createDirectories(daEliminare);
            }
            
            //Se provo ad eliminare la directory superiore, mi risponderà picche, in quanto non è vuota
            daEliminare= daEliminare.getParent();   //Ora punta a c:\temp\daeliminare
            
            try
            {
                Files.delete(daEliminare);
            }
            catch(IOException e)
            {
                System.out.println("Directory piena. solleva eccezione!");
            }
            
            //Attenti, state agendo al di sotto dell'interfaccia grafica di MS/Unix/Mac. Se eliminate non finisce nel cestino!                        
            //!!!!!!!!! ATTENZIONE POTETE FARE DANNI !!!!!!!!                
            Files.walk(daEliminare)                     //Questo percorre la directory
                  .sorted(Comparator.reverseOrder())    //Ordina quanto è contenuto
                  .map(Path::toFile)                    //Ne estrae un array dei file scontenuti
                  .forEach(File::delete);               //Di ogni voce dell'array esegue l'elimina
            
            if( !Files.exists(daEliminare) )
            {
                System.out.println(daEliminare + " e tutto il suo contenuto sono stati eliminati!");
            }
            System.out.println("-------------------\n\n\n");
            
            
            
            
            //-------------------------------------------------------------------------------------
            //Un'ultima operazione che potete voler svolgere è recuperare tutti i files presenti in una directory            
            Path d= Paths.get("c:","Temp");
            System.out.println("Contenuto di: " + d);
            String[] filesContenuti = d.toFile().list();                                
            for(int i=0; i<filesContenuti.length; i++)
            {
                System.out.println( filesContenuti[i] );                            
            }   
            
        } 
        catch (IOException ex) 
        {
            System.out.println("Problema nella creazione: " + ex.getMessage());
        }

    }
    
}
