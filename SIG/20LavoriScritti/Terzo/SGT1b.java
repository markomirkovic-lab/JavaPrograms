package espe;

import java.util.Arrays;

public class SGT1b                                      
{
    public static double[] sumEveryRow(String[][] m)    
    {
        double[] ret= new double[m.length];             
        
        for(int r=0; r<m.length; r++)                   
        {
            ret[r]=0.0;
            for(int c=0; c<m[r].length; c++)            
            {
                ret[r]+=Double.parseDouble(m[r][c]);    
            }
        }
        
        return ret;
    }
    
    
    public static void main(String[] args)
    {
        String[][] test= { {  "3.14", "-1"   , "7.58" },         
                           { "12.1" ,  "0"   , "9.32" , "-11" },
                           {  "5"   ,  "2.71"      } };
        
        
        double[] tot= sumEveryRow(test);                   
        System.out.println( Arrays.toString(tot) );        
    }
    
}
