package labolprodivisori;

public class Variante_0_Base
{
    public static void main(String[] args)
    {
        int nro= 129;
        System.out.println(nro);
        
        int resto= nro;
        int divisore=2;                                                 //Il primo divisore primo è 2
                
        while(resto!=1)
        {
            if(resto%divisore==0)                                       //Se il numero è divisible
            {
                System.out.println("Divisible per " + divisore);
                resto=resto/divisore;                                   //Nuovo numero
                divisore=2;                                             //Riparto con il divisore minimo
            }
            else
            {
                if(divisore==2) divisore=3;                             //Il secondo divisore è 3
                else divisore+=2;                                       //Tranne il 2 tutti gli altri numeri primi sono dispari, quindi incremento di 2
            }
        }
    }
}
