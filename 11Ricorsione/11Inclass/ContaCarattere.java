
/*
Data una stringa e un carattere, deve dire quante volte quel
carattere ha l'occorenza nella stringa
*/

public class ContaCarattere {

    private static int trovaQuanteVolteCompareUnChar(String stringa, char carattere) {

        int index = 0;

        int conta = 0;

        int lunghezza = stringa.length();

        // caso base
        if(stringa.isEmpty()){
            return 0;
        }

        //Boolean corrisponde = stringa.charAt(index) == carattere;

        //if(corrisponde){
        //    conta++;
        //}

        //String nuovaStringa = stringa.substring(index+1, lunghezza-1);

        int conteggio = (stringa.charAt(index) == carattere) ? 1 : 0;


        return conteggio + trovaQuanteVolteCompareUnChar(stringa.substring(1), carattere);
        //return trovaQuanteVolteCompareUnChar(nuovaStringa, carattere);

    }
    
    public static void main(String[] args) {

        String stringa = "tutti";

        char carattere = 't';

        System.out.println(trovaQuanteVolteCompareUnChar(stringa, carattere));
        


    }
    
}
