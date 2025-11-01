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

public class Creation                                                           
{
    public static boolean toCreate(String file)                                 
    {
        boolean ret=true;               
        
        try                                                                     
        {
            Path f= Paths.get(file);                                            
            
            List<String> all= Files.readAllLines(f, Charset.forName("UTF-8"));  
            for(int i=0; i<all.size(); i++)                                     
            {
                String line= all.get(i);                                                            
                
                char type= line.charAt(line.length()-1);
                Path test= Paths.get(line.substring(0, line.length()-1).trim()).normalize();
                
                if(Files.exists(test))                                                      
                {
                    System.out.println("KO!\t" + test.toAbsolutePath() + " exists!");
                    ret= false;
                }
                else if(type=='d' )                 
                {
                    Files.createDirectory(test);
                    System.out.println("OK\t" + test.toAbsolutePath() + " directory created!");
                }
                else if(type=='f' )                 
                {
                    Files.createFile(test);
                    System.out.println("OK\t" + test.toAbsolutePath() + " file created!");
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
        System.out.println( toCreate(".\\resources\\ZZZ_Create.txt") );   
    }
    
}
