/*
5.5 Stringa
Stampate la posizione dove inizia la parola “bello” della stringa “Programmare è bello”.
Stampate, estraendolo dalla stringa, tutto quello che si trova fra are e ello.
*/

public class Es5_5_Stringa {

    public static void main(String[] args) {
        //                01234567891011121314
        String stringa = "Programmare e' bello";
        //                        |        |
        //                        8        17

        String nuova = stringa.substring(11, 17);

        System.out.println(stringa);
        System.out.println(nuova);
        System.out.println();
        System.out.println(stringa.substring(
                                   stringa.lastIndexOf("are")+"are".length(),
                                   stringa.lastIndexOf("llo"))
                          );
        System.out.println();
        System.out.println("are".length());
        System.out.println();
        System.out.println(stringa.substring(
                            stringa.lastIndexOf("are"),
                            stringa.lastIndexOf("llo"))
                          );
        System.out.println();
        System.out.println(stringa.lastIndexOf(stringa));//0
        System.out.println(stringa.lastIndexOf("are"));//8
        System.out.println(stringa.lastIndexOf("llo"));//17
        
    }
    
}
