
/*

Area 8x11. Albero di Natale
.....*.....
....*.*....
...*...*...
..*.....*..
.*.......*.
***********
.....*.....
.....*.....

*/
import java.util.Scanner;

public class FiguraAlberoDiNatale {


    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int lato;
        String messaggio = "Inserici (numero intero dispari diverso da zero) la grandezza \n" + //
                           "del lato della figura simetrica (lato x lato): ";
        
        System.out.print(messaggio);
        lato = input.nextInt();
        input.nextLine();
        System.out.println("");


        if (lato <= 0) {
            System.out.println("Errore: il lato deve essere un numero maggiore di zero.");
            input.close();
            return;
        }
        
        int righe = lato;
        int colonne = lato + (int) Math.ceil(lato * 0.375); // Calcolo proporzionale

        double proporzioneColonne;
        
        //proporzioneColonne = (lato + Math.abs(righe-colonne)) / lato;

        if(lato % 2 != 0) {
            //colonne = lato+((int) (lato*0.375));
            //colonne = lato + 3;
            //colonne = colonne + 1;
        } else {
            //colonne = lato+((int) (lato*0.375)+3);
            //colonne = lato + 4;
        }

        if(colonne % 2 == 0) {
            colonne++;
        }
        

        // Indici
        int prima = 0;
        int ultima = lato-1;
        int ultimaRiga = righe - 1;
        int ultimaClonna = colonne - 1;
        int metaColonna = colonne/2;

        System.out.println(colonne);
        System.out.println(metaColonna);
         
        for (int r = prima; r < righe; r++)             // Per ogni riga
        {
            for (int c = prima; c < colonne; c++)       // Per ogni colonna della riga
            {
                //                                      // Combinazioni di r e c

                // Trangolo
                if(r <= ((righe/3 * 2)+1)) {


                   // if(
                   // c-r<=ULTIMACOLONNA/2 && c==ULTIMACOLONNA/2+r ||          //Discesa a sinistra c-r: 5 4 3 2 1  0  &&  c: 5 6 7 8 9 10
                   // c+r>=ULTIMACOLONNA/2 && c==ULTIMACOLONNA/2-r ||          //Discesa a destra   c+r: 5 6 7 8 9 10  &&  c: 5 4 3 2 1  0
                   // ULTIMACOLONNA/2-r==0 ||                                  //Riga finale        5-5 == 0
                   // ULTIMACOLONNA/2-r<0 && c==ULTIMACOLONNA/2   )            //Gambo              5-r < 0  && c == 5

                    if( (r == 0 && c == metaColonna) ||
                        (c < metaColonna && Math.abs(r + c) == metaColonna) ||
                        (c > metaColonna && Math.abs(r - c) == metaColonna) ||
                        ( r == (righe/3 * 2)+1) ) {

                        System.out.print("*");

                    } else {

                            System.out.print(".");
                        }
                }
                    
                
                // Base
                if(r > (righe/3 * 2) + 1) {
                    
                    if(c == metaColonna) {
                        System.out.print("*");
                    } else {
                        System.out.print(".");
                    }
                    
                }
                 
            }
            System.out.println("");               // Terminata la riga vado a capo
        }

        System.out.println("");
        input.close();
    
    }
}

