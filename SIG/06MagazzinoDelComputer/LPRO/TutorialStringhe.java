
public class TutorialStringhe {

    public static void main(String[] args) 
    {
        //           0123456789ABCD
        String nome="Simone Giudice";
        String nome2="SiMonE GiuDicE";
        
               
        System.out.println( nome.equals(nome2) );//false
        System.out.println( nome.equalsIgnoreCase(nome2) );//true
        
        System.out.println( nome.length()  );//14
        System.out.println( nome.charAt(7) );//'G'

        System.out.println( nome.indexOf("di") );//10
        System.out.println( nome.toLowerCase() );//"simone giudice"
        nome = nome.toLowerCase();//   "simone giudice"
        System.out.println( nome );//"simone giudice"
        
        System.out.println( nome.replace("mo", "$") );//"si$ne siuidice"
        System.out.println( nome.replace('e', '$') );//"simon$ siudic$"

        System.out.println( nome.substring(5, 8) );//"e g"
        
        System.out.println( nome.charAt( nome.length()-1 )  );//e
               
        System.out.println( nome.toUpperCase().replace("E", "Ë").equals("SIMONE GIUDICE") ); 
        //"SIMONË GIUDICË".equals."SIMONE GIUDICE"    false

        /*
        false
        true
        14
        G
        10
        simone giudice
        simone giudice
        si$ne giudice
        simon$ giudic$
        e g
        e
        false
        */
    }
}
