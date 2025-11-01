/*
6.4 4L di acqua
È un gioco matematico: dovete misurare 4l di acqua ma avete a disposizione unicamente un 
recipiente da 5l e uno da 3l.
Scrivete l’algoritmo che risolve il problema.
In base all’esercizio 3.8, scrivete un programma che memorizzi nelle variabili l’acqua 
contenuta nei due recipienti.
Inserite manualmente i valori per ogni singolo passaggio, stampando ogni volta il valore dei 
due recipienti.
Pensate che il programma sarà usato in una scuola elementare per mostrare la soluzione ai 
bambini.
*/

public class Es6_4_4DlAcqua {

    public static void main(String[] args) {
        
        //0
        //0
        int litri5 = 0;
        int litri3 = 0;
        System.out.println("litri 5: " + litri5);
        System.out.println("litri 3: " + litri3);
        System.out.println();

        int rimanenza = 0;

        litri5 += 5;
        litri5 += -3;//litri5 = 2
        litri3 += 3;
        System.out.println("litri 5: " + litri5);
        System.out.println("litri 3: " + litri3);
        System.out.println();
        //----------
        litri3 = 0;//svuotamento
        litri5 += -2;//travasto da litri5 a litri3 litri5 = 0
        litri3 += 2;//rimanenza 
        System.out.println("litri 5: " + litri5);
        System.out.println("litri 3: " + litri3);
        System.out.println();
        //-----------
        litri5 += 5;//riempimento
        litri3 +=1;//travaso da litri5
        litri5 -=1;//travaso da litri5
        litri3 = 0;//svuotamento
        System.out.println("litri 5: " + litri5);
        System.out.println("litri 3: " + litri3);
        System.out.println();

        if(litri5 == 4) {

            System.out.println("4 litri sono stati misurati!");
        }

     }
    
}
