import java.util.Scanner;

public class Es11_5_TabellineMargineV2 {

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
            for(int colonna=0; colonna<matrice[riga].length; colonna++)
            {
                System.out.print(matrice[riga][colonna] + "\t");
            }
            System.out.println("");
        }          

        /*
        0       1       2       3       4
        1       1       2       3       4
        2       2       4       6       8
        3       3       6       9       12
        4       4       8       12      16
        */


    }

    
}
