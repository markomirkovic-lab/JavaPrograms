

public class FarfallinoMinuscolo 
{
    public static void main(String[] args)
    {
        String nome="  SiMonE  ";
        
        nome=nome.trim();//"SiMonE"        
        nome=nome.toLowerCase();//"simone"
        
        char consonante='ç';
        //                                       'ç'
        nome=nome.replaceAll("a", "a" + consonante + "a");
        nome=nome.replaceAll("e", "e" + consonante + "e");
        nome=nome.replaceAll("i", "i" + consonante + "i");
        nome=nome.replaceAll("o", "o" + consonante + "o");
        nome=nome.replaceAll("u", "u" + consonante + "u");
        
        System.out.println( nome );        
    }
}

