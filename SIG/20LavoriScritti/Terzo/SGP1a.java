package espe;

import java.util.Arrays;

public class SGP1a                                          
{
    public static double[] evalFraction(int[][] fraction)   
    {
        double[] ret= new double[fraction.length];          
        
        for(int r=0; r<fraction.length; r++)                
        {               
            ret[r]= fraction[r][0]/fraction[r][1];          
        }
        
        return ret;
    }
    
    
    public static void main(String[] args) throws Exception
    {
        int[][] n= { { 24, 8 },
                     { 12, 3 },
                     { 18, 0 },
                     { 100, 25 },
                     { 81, 9 } };        
        
        try                              
        {
            double[] f= evalFraction(n);    
            System.out.println( Arrays.toString(f) );        
        }
        catch(Exception e)
        {
            System.out.println("Divisione per Zero");   
        }
    }
    
}
