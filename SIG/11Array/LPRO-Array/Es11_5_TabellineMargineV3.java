import java.util.Scanner;

public class Es11_5_TabellineMargineV3 {
    

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int[][] matrice;
        int lato;
        
        System.out.print("Dimensione massima della matrice delle tabelline? ");
        lato = input.nextInt();
        lato++;     //Incremento di uno per i bordi
        
        matrice = new int[lato][lato];
        
        //Valorizzo
        for(int riga=0; riga < matrice.length; riga++)   //invece di m.length si poteva usare anche lato
        {
            for(int colonna = 0; colonna < matrice[riga].length; colonna++)
            {
                if(riga == 0 && colonna == 0)
                    matrice[riga][colonna]=0;          
                else if(riga == 0 && colonna != 0)   //Scrivo il bordo delle righe
                    matrice[riga][colonna]=colonna;
                else if(riga != 0 && colonna == 0)   //Scrivo il bordo delle colonne
                    matrice[riga][colonna]=riga;
                else
                    matrice[riga][colonna]=(riga)*(colonna);
            }
        }
        
        
        //Stampo
        for(int riga=0; riga<matrice.length; riga++)   //invece di m.length si poteva usare anche lato
        {
            // Stampa la linea superiore della griglia (solo per l'inizio di ogni riga)
            for(int colonna=0; colonna<matrice[riga].length; colonna++)
            {
                System.out.print("+-------");
            }
            // Chiude l'ultima colonna della riga superiore
            System.out.println("+");

            // Stampa i valori con i bordi verticali
            for(int colonna=0; colonna<matrice[riga].length; colonna++)
            {
                System.out.printf("| %3d \t", matrice[riga][colonna]);
            }
            // Chiude l'ultima colonna della riga
            System.out.println("|");


            // Stampa la linea inferiore della griglia (per chiudere la riga)
            // Solo per l'ultima (matrice.length-1)
            if(riga == matrice.length-1) {

                for(int colonna = 0; colonna < matrice[riga].length; colonna++ ) {

                    System.out.print("+-------");
                }
                // Chiude l'ultima colonna della riga
                System.out.println("+");
            }
            
            
        }// end for
        
  
        /*
        Dimensione massima della matrice delle tabelline? 4
        +-------+-------+-------+-------+-------+
        |   0   |   1   |   2   |   3   |   4   |
        +-------+-------+-------+-------+-------+
        |   1   |   1   |   2   |   3   |   4   |
        +-------+-------+-------+-------+-------+
        |   2   |   2   |   4   |   6   |   8   |
        +-------+-------+-------+-------+-------+
        |   3   |   3   |   6   |   9   |  12   |
        +-------+-------+-------+-------+-------+
        |   4   |   4   |   8   |  12   |  16   |
        +-------+-------+-------+-------+-------+

        */
    }// end main
}
