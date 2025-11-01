
import java.util.Scanner;

public class SnippetsSerie11ArrayMultidimensionaliV4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //Chiediamo all'utente di inserire la dimensione della matrice
        System.out.print("Inserisci quante righe dovrà avere la matrice: ");
        int righe = input.nextInt();
        input.nextLine();

        System.out.print("Inserisci quante colonne dovrà avere la matrice: ");
        int colonne= input.nextInt();
        input.nextLine();


        //Dichiarazione di un array a due dimensioni (solitamente noto come matrice)
        int[][] matrice;

        //Instanziazione della matrice
        matrice= new int[righe][colonne];       //La prima dimensione per convenzione sono le righe, la seconda le colonne, come in matematica
        
        System.out.println("matrice.length: " + matrice.length);
        System.out.println("matrice[righe-1].length: " + matrice[righe-1].length);
        
        System.out.println("\n\n\n--------------------------------------------------");
        
        //Proviamo ora quest'altro esercizio
        /*
        MatriceLRDT Mar 21, 2017 array Livello 13 
        https://gitalb.github.io/eserciziario2.0/array/2017/03/21/matricelrdt.html

        Ora proviamo a ribaltare verticalmente la disposizione dei valori rispetto a quanto fatto nell’esercizio MatriceLRTD. Scrivi un programma che:

        Crea una matrice con le dimensioni definite dall’utente
        Riempie la matrice disponendo dei valori crescenti da sinistra a destra, dal basso verso l’alto
        Stampa lo stato della matrice
        Esempio, per una matrice di 5 x 5:

        20	21	22	23	24	
        15	16	17	18	19	
        10	11	12	13	14	
        5	6	7	8	9	
        0	1	2	3	4	
        Il programma deve funzionare correttamente anche per matrici rettangolari. Esempio (7 x 2):

        12	13	
        10	11	
        8	9	
        6	7	
        4	5	
        2	3	
        0	1
        */
        //
        //Quando hai finito, prova a risolvere questo esercizio e i successivi senza usare variabili di supporto per gestire il valore crescente (usando solo le variabili indice di riga e colonna).        

        int cnt = 1;
        for(int r=0; r<matrice.length; r++)                 //Ciclo per tutte le righe. Per ottenerle chiedo alla matrice la sua lunghezza
        {
            //cnt++;
            for(int c=0; c<matrice[r].length; c++)          //Ciclo per tutte le colonne di quella specifica riga!
            {
                //matrice[r][c]= matrice[r].length * matrice[r].length - cnt;     //Formula per calcolare il numero della cella partendo dagli indici di riga e colonna
                //cnt++;
                // ...

                int rigaVirtuale = matrice[r].length - 1 - r;// inversione righe
                // 5 - 1 - 0 = 4
                // 5 - 1 - 1 = 3
                //...
                //int colonnaVirtuale = matrice[r].length - 1 - c;// inversione colonne
                // 5 - 1 - 0 = 4
                // 5 - 1 - 1 = 3
                //...

                matrice[r][c]= rigaVirtuale * matrice[r].length + c;// c  invece di  + colonnaVirtuale
                
            }
        }
        
        //Stampa
        for(int r=0; r<matrice.length; r++)                 //Ciclo per tutte le righe. Per ottenerle chiedo alla matrice la sua lunghezza
        {
            for(int c=0; c<matrice[r].length; c++)          //Ciclo per tutte le colonne di quella specifica riga!
            {
                System.out.print(matrice[r][c] + "\t");     //Stampo la cella
            }
            System.out.println("");                       //Al termine della riga vado a capo
        }
        

        //-------------------------------------
        
        /*
        System.out.print("Inserisci il numero della cella (ad esempio la 12 è quella centrale in una 5x5: ");
        int cella= input.nextInt();
        input.nextLine();

        
        //Calcoliamo le coordinate partendo dalla cella
        System.out.println("matrice[0].length " + matrice[0].length);
        int riga = cella / matrice[righe-1].length;
        //          19 % 5 = 4
        int colonna = cella % matrice[righe-1].length;
        //          19 / 5 = 3
        System.out.println("r: " + riga + "\tc: " + colonna);//r: 4    c: 3
        */
        
        input.close();
        
    }
}



