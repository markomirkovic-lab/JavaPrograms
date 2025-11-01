public class SnippetSerie06_4_QuartaParte_Stringhe_Avanzate 
{
    public static void main(String[] args) 
    {
        //Uso avanzato delle stringhe
        
        //-----------------------------------------------------------------------------------------------------
        //Esempio 1, estrarre una parte di stringa, ad esempio il prefisso locale di un numero di telefono
        String tel= "+41 (0)91 111 22 33";
        //           0123456789012345678

        //indexOf(String str, int fromIndex)
        
        //Una volta individuato i separatori che delimitano l'elemento da trovare
        int inizio= tel.indexOf(" ")+1;           //Cerco il primo spazio. Essendo un solo char, aggiungo uno per partire dalla posizione seguente
        int fine= tel.indexOf(" ", inizio);       //Cerco il secondo spazio partendo dal charAt dopo il primo
        System.out.println("inizio: " + inizio);//4
        System.out.println("fine: " + fine);    //9

        //Trovati i due limiti, estraggo la sottostring
        String prefissoLocale= tel.substring(inizio, fine);   //Si parte sempre dalla posizione iniziale
        
        System.out.println( prefissoLocale );//091

        
        
        //-----------------------------------------------------------------------------------------------------
        //Esempio 2, estrarre una parte di stringa, ad esempio il dominio da un indirizzo email
        String email= "pinco.pallino@edu.ti.ch";

        //lastIndexOf(String str) Returns the index within this string of the last occurrence of the specified substring. 
        
        //Una volta individuato i separatori che delimitano l'elemento da trovare
        inizio= email.indexOf("@")+1;               //Cerco il primo '@'. Essendo un solo char, aggiungo uno per partire dalla posizione seguente
        fine= email.lastIndexOf(".");               //Cerco l'ultimo punto

        //Trovati i due limiti, estraggo la sottostring
        String dominio= email.substring(inizio, fine);   //Si parte sempre dalla posizione iniziale +1
        
        System.out.println( dominio );//edu.ti




        
        
        //-----------------------------------------------------------------------------------------------------
        //Esempio 3, estrarre una parte di stringa, delimitata da parole e non da singoli char
        String t= "Questa è una STOP frase telegrafica STOP con le frasi STOP separate dalla stringa STOP";
        //         012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789

        //indexOf(String str, int fromIndex)
        
        //Una volta individuato i separatori che delimitano l'elemento da trovare

        int inizio0 = 0;
        int fine0 = t.indexOf("STOP", 0);
        String tt0 = t.substring(inizio0, fine0);
        System.out.println(tt0);



        inizio= t.indexOf("STOP")+"STOP".length();               //Cerco il primo delimitatore, essendo una parola devo aggiungere la sua lunghezza per determinare la posizione finale del delimitatore
        fine= t.indexOf("STOP", inizio);
        System.out.println("inizio: " + inizio);//17
        System.out.println("fine: " + fine);//36

        //Trovati i due limiti, estraggo la sottostring
        String tt= t.substring(inizio+1, fine);   //Si parte sempre dalla posizione iniziale +1
        
        System.out.println( tt );//frase telegrafica

        //--

        int inizio2= fine+"STOP".length();               //Cerco il primo delimitatore, essendo una parola devo aggiungere la sua lunghezza per determinare la posizione finale del delimitatore
        int fine2= t.indexOf("STOP", inizio2);
        System.out.println("inizio2: " + inizio2);
        System.out.println("fine2: " + fine2);

        //Trovati i due limiti, estraggo la sottostring
        String tt2= t.substring(inizio2+1, fine2);   //Si parte sempre dalla posizione iniziale +1
        
        System.out.println( tt2 );//

        int inizio3= fine2+"STOP".length();               //Cerco il primo delimitatore, essendo una parola devo aggiungere la sua lunghezza per determinare la posizione finale del delimitatore
        int fine3= t.indexOf("STOP", inizio3);
        System.out.println("inizio3: " + inizio3);
        System.out.println("fine3: " + fine3);


        //Trovati i due limiti, estraggo la sottostring
        String tt3= t.substring(inizio3+1, fine3);   //Si parte sempre dalla posizione iniziale +1
        
        System.out.println( tt3 );//

    }
}
