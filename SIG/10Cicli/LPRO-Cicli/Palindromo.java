public class Palindromo 
{
    public static void main(String[] args)
    {
        String n="i topi non avevano nipoti";
        //String n = "Anna";
        //String n = "anina";
        
        String notSpaced="";
        n=n.toLowerCase().trim();
        for(int i=0; i<n.length(); i++)
        {
            if(n.charAt(i)!=' ')
                notSpaced+=n.charAt(i);
        }
        
        
        n=notSpaced;
        boolean palindromo=true;
        for (int i = 0; i < n.length()/2; i++)
        {
            //Verifico che la lettera a sinistra sia diversa da quella a destra
            //uso i come un delta, partendo da 0 per 'risalire' la stringa e da length()-1 per ridiscenderla
            if(n.charAt(0+i) != n.charAt(n.length()-1-i))
            {
                palindromo=false;
                break;
            }            
        }
        
        //---------------------------------------
        //Seconda variante, che implica un uso avanzato del for
        n=notSpaced;
        palindromo=true;
        // sx puntatore sinistra / dx puntatore a destra
        for (int sx = 0, dx= n.length()-1;      //Definisco un puntatore a sinistra, che parte da 0 e uno a destra che parte da length()-1
             sx<dx;                             //Avanzo fino a che i due puntatori si incrociano
             sx++, dx--)                        //Ogni volta incremento il puntatore da sinistra e decremento quello da destra
        {
            if(n.charAt(sx) != n.charAt(dx))
            {
                palindromo=false;
                break;
            }            
        }        
        
        
        //---------------------------------------
        if(palindromo)
            System.out.println("palindromo");
        else
            System.out.println("non palindromo");
        
        
        System.out.println("notSpaced: \t" + notSpaced);
        
        String reverse="";
        for(int i=n.length()-1; i>=0; i--)
            reverse+=n.charAt(i);
        
        System.out.println("reverse: \t" + reverse);
    }
}
