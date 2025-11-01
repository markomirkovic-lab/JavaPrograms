package labolprodivisori;

public class Variante_2_TrovareINumeriPrimiConArray
{
    public static void main(String[] args)
    {
        long msec= System.currentTimeMillis();
        
        int trovati=0;
        
        int nroMax= 1000000;
        System.out.println(nroMax);
        
        int[] primi= new int[nroMax/2+1];
        int primiIndex=-1;
        boolean divisibile=false;
        
        
        for(int i=2; i<nroMax; i++)
        {
            divisibile= false;
            
            for(int p=0; p<=primiIndex; p++)
            {
                if(i%primi[p]==0)
                {
                    divisibile= true;
                    break;
                }
            }
            if(!divisibile)
            {
                primi[++primiIndex]= i;
                //System.out.println(i + " è il " + (++trovati) + "° numero primo");
            }
        } 
        
        
        System.out.println("Ci ho messo: " + (System.currentTimeMillis()-msec)/1000.0 + " sec");
    }
}
