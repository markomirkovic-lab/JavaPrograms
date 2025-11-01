package labolprogennaio;

public class Variante_0_Base
{
    public static void main(String[] args)
    {
        int nro= 2*2*2*3*3*5*23;
        System.out.println(nro);
        
        int resto= nro;
        int divisore=2;
        while(resto!=1)
        {
            if(resto%divisore==0)
            {
                System.out.println("Divisible per " + divisore);
                resto=resto/divisore;
                divisore=2;
            }
            else
            {
                if(divisore==2) divisore=3;
                else divisore++;
            }
        }
    }
}
