
import java.util.Arrays;

public class SnippetSerie14_Sort_E_Ricerca 
{
    //-------------------------------------------------------------------------
    
    /**
     * Algoritmo di selection sort su un array di int
     * 
     * @param array 
     */
    static void selectionSort(int[] array)
    {
        int minimo;

        for(int i = 0; i < array.length-1; i++)
        {
            //Il minimo è la cella attuale
            minimo = i;
            
            //Esamino il sottoarray partendo dalla prossima cella rispetto all'attuale
            for(int j = i+1; j < array.length; j++)
            {
                //Se trovo un valore inferiore, memorizzo la sua posizione
                if(array[j]<array[minimo])               
                    minimo = j;
            }
            
            //Se trovo un minimo diverso dalla cella attuale, allora lo scambio
            if(minimo!=i)
                changePosition(array,i,minimo);
        }
    }  
    
    
    
    //-------------------------------------------------------------------------
    
    /**
     * Algoritmo di insertion sort su un array di int
     * 
     * @param array 
     * @param posMin    indice iniziale del sottoarray da valutare
     * @param posMax    indice finale del sottoarray da valutare
     */
    static void insertionSort(int[] array, int posMin, int posMax)
    {
        int posizione;
        
        //Dobbiamo ordinare il sottoarray da min a max
        for(int i = posMin; i<posMax; i++)
        {
            posizione = i;
            for(int j=i-1; j>=0; j--)
            {
                if(array[posizione]<array[j])
                {
                    changePosition(array,posizione,j);
                    //La sua nuova posizione nel sotto-vettore
                    posizione = j;
                }
                else
                    //Significa che l'elemento è nella sua giusta
                    //posizione
                    break;
            }
        }
    }    
    
    
    
    //-------------------------------------------------------------------------
    
    /**
     * Algoritmo di bubble sort su un array di int
     * 
     * @param array 
     */
    static void bubbleSort(int array[])
    {
        boolean scambio=true;
        int attuale, successivo;
        int tmp;
    
        for(int i = 0; i < array.length; i++)
        {
            scambio = false;
            //Notate che questo secondo ciclo si arresta
            //al penultimo elemento dell'array
            for(int j = 0; j < array.length-1; j++)
            {
                attuale=j;
                successivo=j+1;
                
                //Se l' elemento attuale è maggiore del successivo...
                if(array[successivo]<array[attuale])
                {
                    //... allora scambiamoli
                    changePosition(array,attuale,successivo);
                    //segnalo che c'è stato uno scambio
                    scambio=true;
                }
            }
            //Qui termina il confronto fra tutti gli elementi,
            //partendo dal primo
            //se non ci sono stati scambi significa che l'array è ordinato
            //e quindi è inutile procedere
            if(!scambio)
                break;
        }
    }    
    
    
    //-------------------------------------------------------------------------
    
    /**
     * Algoritmo di quick sort su un array di int.<p>
     * Non lo abbiamo trattato a lezione ma ve lo lascio come regalo.
     * 
     * @param array 
     * @param begin     Indice iniziale del sottoarray da partizionare
     * @param end       Indice finale del sottoarray da partizionare
     */    
    private static int partition(int[] arr, int begin, int end) 
    {
        //Per semplicità prendiamo come pivot l'ultimo elemento dell'array
        //Tanto uno vale l'altro, a meno che non vogliamo calcolare la media o la mediana
        //che però è molto dispendioso in tempo!
        int pivot = arr[end-1];
        int i = begin;        

        //Percorro la mia parte di array
        //Faccio in modo che tutto ciò che è minore del pivot 
        //sia messo in cima alla parte di array
        for (int j = begin; j < end-1; j++) 
        {
            //Se è minore o uguale  
            if(arr[j]<= pivot)
            {
                changePosition(arr, i, j);
                i++;
            }
        }

        //Ho la certezza che tutto quello che è minore 
        //del pivot si trovi nell'array prima della posizione i
        //Quindi scambio il pivot con questa posizione.
        //L'algoritmo continuerà in due sotto-array
        changePosition(arr, i, end-1);
        
        return(i);
    }    
    
    
    private static void quickSort(int[] array, int begin, int end) 
    {
        if (begin < end) 
        {
            int partitionIndex = partition(array, begin, end);

            quickSort(array, begin, partitionIndex);
            quickSort(array, partitionIndex+1, end);
        }
    }    
    
    
    
    
    //-------------------------------------------------------------------------

    /**
     * Algoritmo di ricerca binaria su un array di int
     * 
     * @param array 
     */    
    public static int binarySearch(int[] array, int toFind)  
    {
        int start = 0;
        int end = array.length - 1;
        int centro = 0;
        
        int find=0;

        while(start<=end)
        {
            //Troviamo la metà
            centro = (start+end)/2;

            //Devo cercare nella metà inferiore?  
            if(toFind<array[centro])
                //Sposto il limite minimo
                end=centro-1;
            //Devo cercare nella metà superiore?
            else if(toFind>array[centro])
                start=centro+1;
            else
                //elemento si trova proprio sulla cella in questione
                return(centro); 
        }        
        return(-1);
    }  
    
    

    //-------------------------------------------------------------------------

    /**
     * Algoritmo di ricerca sequenziale su un array di int
     * 
     * @param array 
     */        
    public static int sequentialSearch(int[] array, int toFind)
    {
        for (int i = 0; i < array.length; i++) 
        {
            if(array[i]==toFind)
                return i;            
            else if(array[i]>toFind)    //Parziale ottimizzazione
                return -1;
        }
        
        return -1;
    }

    
    
    //-------------------------------------------------------------------------
    
    /**
     * Metodo usato per scambiare due posizioni nell'array
     * 
     * @param array
     * @param origine
     * @param destinazione 
     */
    static void changePosition(final int[] array, int origine, int destinazione)
    {
        int tmp;

        tmp = array[origine];
        array[origine] = array[destinazione];
        array[destinazione] = tmp;
    }    
    
    
    
    /**
     * Genera un array contenente numeri random da 1 a (dimensione*dimensione)
     * 
     * @param dimensione
     * @return 
     */
    public static int[] generaRandom( int dimensione )
    {
        int[] a= new int[dimensione];
        
        for(int i=0; i<a.length; i++)
        {
            a[i]= (int)(Math.random()* (dimensione*dimensione+1))+0;
        }
        
        return(a);
    }
    
    
    
    
    //-------------------------------------------------------------------------
    
    public static void main(String[] args) 
    {
        long startTime= 0;
        
        int[] a;
        int[] quick;
        int[] insertion;
        int[] selection;
        int[] bubble;
        
        
        //---------------------------------------------------------------------
        a= generaRandom(10); a[0]=9999999;
        
        quick= Arrays.copyOf(a, a.length);
        quickSort(quick, 0, quick.length);
        System.out.printf("%-15s %s%n", "Quick: ", Arrays.toString( quick ) );
        
        insertion= Arrays.copyOf(a, a.length);
        insertionSort(insertion, 0, insertion.length);
        System.out.printf("%-15s %s%n", "Insertion: ", Arrays.toString( insertion ) );

        selection= Arrays.copyOf(a, a.length);
        selectionSort(selection);
        System.out.printf("%-15s %s%n", "Selection: ", Arrays.toString( selection ) );
        
        bubble= Arrays.copyOf(a, a.length);
        bubbleSort(bubble);
        System.out.printf("%-15s %s%n", "Bubble: ", Arrays.toString( bubble ) );
        
        
        if( Arrays.equals(quick, insertion) && 
            Arrays.equals(insertion, selection) && 
            Arrays.equals(selection, bubble) )
            System.out.println("Array ordinati tutti identici");
        else
            System.out.println("Hai qualche problema negli algortimi di sort");
        
        
        System.out.println("\n\n\n");
        
        
        
        
        
        //---------------------------------------------------------------------
        //Facciamo dei giochi seri, misuriamo le performances
        System.out.println("Test su array di int da 100000!");
        int size= 100000;
        
        
        startTime= System.currentTimeMillis();               
        a= generaRandom(size);
        System.out.println("Genera: " + (System.currentTimeMillis()-startTime) + "msec");
        
        
        
        startTime= System.currentTimeMillis();               
        Arrays.copyOf(a, a.length);        
        System.out.println("Copia: " + (System.currentTimeMillis()-startTime) + "msec");        
        

        
        quick= Arrays.copyOf(a, a.length);        
        startTime= System.currentTimeMillis();               
        quickSort(quick, 0, quick.length);        
        System.out.println("Quick: " + (System.currentTimeMillis()-startTime) + "msec");
        
        

        insertion= Arrays.copyOf(a, a.length);        
        startTime= System.currentTimeMillis();               
        insertionSort(insertion, 0, insertion.length);        
        System.out.println("Insertion: " + (System.currentTimeMillis()-startTime) + "msec");
        
        
        
        selection= Arrays.copyOf(a, a.length);        
        startTime= System.currentTimeMillis();               
        selectionSort(selection);        
        System.out.println("Selection: " + (System.currentTimeMillis()-startTime) + "msec");       
        
        
        
        bubble= Arrays.copyOf(a, a.length);        
        startTime= System.currentTimeMillis();               
        bubbleSort(bubble);        
        System.out.println("Bubble: " + (System.currentTimeMillis()-startTime) + "msec");
        
        
        if( Arrays.equals(quick, insertion) && 
            Arrays.equals(insertion, selection) && 
            Arrays.equals(selection, bubble) )
            System.out.println("Array ordinati tutti identici");
        else
            System.out.println("Hai qualche problema negli algortimi di sort");
        
        
        System.out.println("\n\n\n");
        
        
        
        
        
        //--------------------------------------------------------------------
        System.out.println(a.length + " ricerche nell'array ordinato!");
        
        startTime= System.currentTimeMillis();               
        for(int i = 0; i < a.length; i++) 
        {
            int j= binarySearch(quick, a[i]);   //Cerco il valore a caso presente nell'array a originale          
        }
        System.out.println("BinarySearch: " + (System.currentTimeMillis()-startTime) + "msec");

        
        
        startTime= System.currentTimeMillis();               
        for(int i = 0; i < a.length; i++) 
        {
            int j= sequentialSearch(quick, a[i]);            
        }
        System.out.println("SequentialSearch: " + (System.currentTimeMillis()-startTime) + "msec");
        
    }

    
    
    
    
}
