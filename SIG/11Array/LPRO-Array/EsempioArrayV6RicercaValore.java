/*
Cercare un valore in un array significa scorrere tutte le sue celle e se si trova
il valore cercato, si memorizza l'indice della cella nelal quale si trova.
*/

import java.util.Arrays;

public class EsempioArrayV6RicercaValore {

    public static void main(String[] args) {
        
        String[] giorno = {"Lunedi", "Martedi", "Mercoledi", "Giovedi", "Venerdi"};

        String trova = "Giovedi";

        int indiceTrovato = -1;// -1 perche' non e' un indice valido

        for(int i = 0; i < giorno.length; i++) {
            if(giorno[i].equals(trova)) {
                indiceTrovato = i;// memorizzo l'indice
                break;// interrompo il ciclo
            }
        }

        System.out.println("Array: " + Arrays.toString(giorno));

        if(indiceTrovato == -1) {
            System.out.println("Valore " + trova + " non trovato!");
        } else {
            System.out.println("Valore \"" + trova + "\" trovato all'indice: " + indiceTrovato);
        }

        System.out.println(giorno[indiceTrovato]);

        /*
        Array: [Lunedi, Martedi, Mercoledi, Giovedi, Venerdi]
        Valore "Giovedi" trovato all'indice: 3
        Giovedi 
        */

    }
    
}
