package espe4;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CheckPaths
{
    public static boolean toCheck(Path f)
    {
        boolean ret=true;                                       
        
        try
        {
            List<String> all= Files.readAllLines(f, Charset.forName("UTF-8"));
            for(int i=0; i<all.size(); i++)                                   
            {
                String line= all.get(i);                                                            
                
                char type= line.charAt(0);
                Path test= Paths.get(line.substring(2).trim()).normalize();   
                
                if(type=='f' && Files.exists(test) && !Files.isDirectory(test))
                {
                    System.out.println("OK\t" + test.toAbsolutePath() + " is a File!");
                }
                else if(type=='d' && Files.exists(test) && Files.isDirectory(test))
                {
                    System.out.println("OK\t" + test.toAbsolutePath() + " is a Directory!");
                }
                else                                                               
                {
                    System.out.println("KO!\t" + test.toAbsolutePath() + " error!");
                    ret= false;                                                    
                }                
            }            
        } 
        catch (IOException ex)
        {
            System.out.println("Error!");
            ret= false;
        }   
        
        return ret;
    }
    
    public static void main(String[] args)
    {
        Path f= Paths.get("." , "resources", "ZZZ_Check.txt");
        
        System.out.println( toCheck(f) );                     
    }
    
}
