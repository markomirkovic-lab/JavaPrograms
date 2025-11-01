package espe;

import java.util.Arrays;

public class SGT1a                                      
{
    public static double[] sumEveryColumn(double[][] m) 
    {
        double[] ret= new double[m[0].length];          
        
        for(int c=0; c<m[0].length; c++)                
        {
            ret[c]=0.0;
            for(int r=0; r<m.length; r++)               
            {
                if(!Double.isNaN(m[r][c]))              
                    ret[c]+=m[r][c];                    
            }
        }
        
        return ret;
    }
    
    
    public static void main(String[] args)
    {
        double[][] test= { {  3.14, -1   , 7.58 , Double.NaN },        
                           { 12.1 ,  0   , 9.32 , -11        },
                           {  5   ,  2.71, 0.214,   0.2      } };
        
        
        double[] tot= sumEveryColumn(test);                            
        System.out.println( Arrays.toString(tot) );                    
    }
    
}
