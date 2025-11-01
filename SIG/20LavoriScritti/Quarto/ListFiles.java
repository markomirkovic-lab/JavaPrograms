package espe4;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListFiles                                                          
{
    public static boolean toList(Path baseDir, Path writeFile)                  
    {
        if(Files.exists(writeFile)) return false;                               
        
        try                                                                     
        {
            String out="";
            
            String[] filesContenuti = baseDir.toFile().list();                  
            
            for(int i=0; i<filesContenuti.length; i++)                          
            {
                Path tmp= baseDir.resolve(Paths.get(filesContenuti[i]));        
                
                if(Files.isDirectory(tmp))                                      
                    out+="d " + tmp.toAbsolutePath() + "\n";
                else if(!Files.isDirectory(tmp))                                
                    out+="f " + tmp.toAbsolutePath() + "\n";                
            }

            System.out.println(out);                    
            Files.write(writeFile, out.getBytes(Charset.forName("UTF-8")));     
            
            return true;
        } 
        catch (IOException ex)
        {
            return false;
        }   
    }
    
    
    
    public static void main(String[] args) throws IOException
    {
        System.out.println( toList(Paths.get("."), Paths.get(".", "resources", "ZZZ_List.txt") ) ); 
    }
    
}
