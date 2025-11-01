
import java.util.Arrays;

public class ArraysSortDesCicloFor {

    // Utilizzando cicli for
    // scambiare gli elementi dell'array partendo dalle estremità e avvicinandoti al centro:
    public static void invertiArrayUsandoCicloWhile(int[] a) {

        int inizio = 0;
        int fine = a.length - 1;

        for(int i = 0; i < fine; i++) {

            //Scambia gli elementi    indici                
            int temp = a[inizio];//   int temp = a[0];  int temp = a[1];    int temp = a[2];    int temp = a[3];
            a[inizio] = a[fine];//    a[0] = a[5];      a[1] = a[4];        a[2] = a[3];        a[3] = a[2];
            a[fine] = temp;//         a[5] = temp;      a[4] = temp;        a[3] = temp;        a[2] = temp;

            //Spostamento dei puntatori
            inizio++;
            fine--;

        }
    }

    public static void main(String[] args) {
        
        int[] a1 = { 1, 2, 3, 4, 5, 6 };
        int[] a2 = { 3, 1, 4, 2, 6, 5 };

        
        System.out.println("\nContenuto array: ");
        for(int element : a2) {
            System.out.print(element + " ");//3 1 4 2 6 5
        }
        System.out.println("\n");

        int[] arraySortDes1 = new int[a2.length];
        //int[] arraySortDes2 = new int[a2.length];
        //int[] arraySortDes3 = new int[a2.length];

        System.arraycopy(a2, 0, arraySortDes1, 0, a2.length);//OK per array di n dimensioni
        //Arrays.copyOf(arraySortDes1, a2.length);//OK per array di 1 dimensione

        // Inverti array usando i cicli
        invertiArrayUsandoCicloWhile(arraySortDes1);

        // Stampa array
        System.out.println("Inverti array usando i cicli - (ordinamento in base all'attuale array): ");
        for(int element : arraySortDes1) {
            System.out.print(element + " ");
        }

        System.out.println("\n");
        
        //--

        // Ordinare array - Asc
        Arrays.sort(arraySortDes1);//ora array e' ordinato in modo Asc
        // Inverti array usando i cicli
        invertiArrayUsandoCicloWhile(arraySortDes1);// ora array e' ordinato in modo Des

        // Stampa array
        System.out.println("Inverti array usando i cicli (ordinamento Desc): ");
        for(int element : arraySortDes1) {
            System.out.print(element + " ");
        }

        System.out.println("\n");
        
        /*
        
        Contenuto array:
        3 1 4 2 6 5 

        Inverti array usando i cicli - (ordinamento in base all'attuale array):
        5 6 2 4 1 3

        Inverti array usando i cicli (ordinamento Desc):
        6 5 4 3 2 1

        */
    }
    
}

