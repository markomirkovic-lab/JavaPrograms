
import java.util.Scanner;

public class SnippetsSerie11_Array_multidimensionali_e_loro_manipolazione
{
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);

        //Chiediamo all'utente di inserire la dimensione della matrice
        System.out.print("Inserisci quante righe dovrà avere la matrice: ");
        int righe= in.nextInt();
        in.nextLine();

        System.out.print("Inserisci quante colonne dovrà avere la matrice: ");
        int colonne= in.nextInt();
        in.nextLine();


        //Dichiarazione di un array a due dimensioni (solitamente noto come matrice)
        int[][] matrice;

        //Instanziazione della matrice
        matrice= new int[righe][colonne];       //La prima dimensione per convenzione sono le righe, la seconda le colonne, come in matematica
        
        
        
        System.out.println("\n\n\n--------------------------------------------------");
        
        //Proviamo a risolvere l'esercizio
        //      https://gitalb.github.io/eserciziario2.0/array/2017/03/21/matricelrtd.html
        //Scrivi un programma che:
        //
        //    Crea una matrice con le dimensioni definite dall’utente
        //    Riempie la matrice disponendo dei valori crescenti da sinistra a destra, dall’alto verso il basso.
        //    Stampa lo stato della matrice
        //
        //Esempio, per una matrice di 5 x 5:
        //
        //      0	1	2	3	4	
        //      5	6	7	8	9	
        //      10	11	12	13	14	
        //      15	16	17	18	19	
        //      20	21	22	23	24	
        //
        //Il programma deve funzionare correttamente anche per matrici rettangolari. Esempio (7 x 2):
        //
        //      0	1	
        //      2	3	
        //      4	5	
        //      6	7	
        //      8	9	
        //      10	11	
        //      12	13	
        //
        //Quando hai finito, prova a risolvere questo esercizio e i successivi senza usare variabili di supporto per gestire il valore crescente (usando solo le variabili indice di riga e colonna).        

        for(int r=0; r<matrice.length; r++)                 //Ciclo per tutte le righe. Per ottenerle chiedo alla matrice la sua lunghezza
        {
            for(int c=0; c<matrice[r].length; c++)          //Ciclo per tutte le colonne di quella specifica riga!
            {
                matrice[r][c]= r*matrice[r].length + c;     //Formula per calcolare il numero della cella partendo dagli indici di riga e colonna
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
        
        
        System.out.print("Inserisci il numero della cella (ad esempio la 12 è quella centrale in una 5x5: ");
        int cella= in.nextInt();
        in.nextLine();
        
        //Calcoliamo le coordinate partendo dalla cella
        int riga= cella/matrice[0].length;
        int colonna= cella%matrice[0].length;
        System.out.println("r: " + riga + "\tc: " + colonna);
        
        
        
        
        System.out.println("\n\n\n--------------------------------------------------");
        //Proviamo ora quest'altro esercizio
        //      https://gitalb.github.io/eserciziario2.0/array/2017/03/21/matricetdlr.html
        //      0	5	10	15	20	
        //      1	6	11	16	21	
        //      2	7	12	17	22          
        //      3	8	13	18	23	
        //      4	9	14	19	24	        
        
        for(int r=0; r<matrice.length; r++)                 //Ciclo per tutte le righe. Per ottenerle chiedo alla matrice la sua lunghezza
        {
            for(int c=0; c<matrice[r].length; c++)          //Ciclo per tutte le colonne di quella specifica riga!
            {
                matrice[r][c]= r + c*matrice[r].length;     //Formula per calcolare il numero della cella partendo dagli indici di riga e colonna
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
        

        //Variante due
        System.out.println("\nVariante due");
        for(int r=0; r<matrice.length; r++)                 //Ciclo per tutte le righe. Per ottenerle chiedo alla matrice la sua lunghezza
        {
            for(int c=0; c<matrice[r].length; c++)          //Ciclo per tutte le colonne di quella specifica riga!
            {
                matrice[r][c]= c*matrice.length + r;        //Formula per calcolare il numero della cella partendo dagli indici di riga e colonna
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

        
        
        
        
        System.out.println("\n\n\n--------------------------------------------------");
        //Proviamo ora quest'altro esercizio
        //      https://gitalb.github.io/eserciziario2.0/array/2017/03/21/matricerldt.html
        //      24	23	22	21	20	
        //      19	18	17	16	15	
        //      14	13	12	11	10	
        //      9	8	7	6	5	
        //      4	3	2	1	0		        
        
        for(int r=0; r<matrice.length; r++)                 //Ciclo per tutte le righe. Per ottenerle chiedo alla matrice la sua lunghezza
        {
            for(int c=0; c<matrice[r].length; c++)          //Ciclo per tutte le colonne di quella specifica riga!
            {
                int rVirtuale= matrice.length-1-r;          //Trasformo l'indice di riga: 0-->5,  1-->4, ..., 4-->0
                int cVirtuale= matrice[r].length-1-c;       //Trasformo l'indice di colonna: 0-->5,  1-->4, ..., 4-->0
                matrice[r][c]= rVirtuale*matrice[r].length + cVirtuale;     //Formula per calcolare il numero della cella partendo dagli indici di riga e colonna
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
        
    }
}
