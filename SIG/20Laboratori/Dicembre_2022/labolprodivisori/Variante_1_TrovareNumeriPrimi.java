package labolprodivisori;

public class Variante_1_TrovareNumeriPrimi
{
    public static void main(String[] args)
    {
        long msec= System.currentTimeMillis();
        
        
        int trovati=0;
        
        int nroMax= 1000000;
        System.out.println(nroMax);
        
        
        for(int nro=2; nro<=nroMax; nro++)
        {        
            int resto= nro;
            int divisore=2;                                                 //Il primo divisore primo è 2

            while(resto!=1)
            {
                if(resto%divisore==0)                                       //Se il numero è divisible
                {
                    break;
                }
                else
                {
                    if(divisore==2) divisore=3;                             //Il secondo divisore è 3
                    else divisore+=2;                                       //Tranne il 2 tutti gli altri numeri primi sono dispari, quindi incremento di 2
                }
            }
            
            if(divisore==nro) System.out.println(nro + " è il " + (++trovati) + "° numero primo");
        }
        
        
        System.out.println("Ci ho messo: " + (System.currentTimeMillis()-msec)/1000.0 + " sec");
    }
}
