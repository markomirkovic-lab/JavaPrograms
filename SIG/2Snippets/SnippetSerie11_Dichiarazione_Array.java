
import java.util.Arrays;
import java.util.Scanner;

public class SnippetSerie11_Dichiarazione_Array 
{
    public static void main(String[] args) 
    {
        Scanner in= new Scanner(System.in);
        
        //Dichiarazione di un array per il quale
        //sapete già prima di iniziare che dati conterrà.
        //Ad esempio un array che contiene i giorni della settimana
        String[] giornoSettimana= { "lunedì", "martedì", "mercoledì", "giovedì", "venerdì", "sabato", "domenica" };
        
        //Attenti gli indici iniziano sempre da 0.                             !!!
        System.out.println("Il 3° giorno della settimana è: " + giornoSettimana[2]);
        
        
        
        //Piccolo trucco, molto poco elegante!
        //Se vogliamo memorizzare i giorni dei mesi, e vogliamo usare il numero del mese come indice
        //dovremo "sprecare" lo spazio per la cella 0
        int[] giornoMese= { 0 , 31   , 28   , 31   , 30   , 31   , 30   , 31   , 31   , 30   , 31   , 30   , 31   };
        String[] nomeMese= {"", "gen", "feb", "mar", "apr", "mag", "giu", "lug", "ago", "set", "ott", "nov", "dic"};
        
        
        System.out.print("Che mese vuoi conoscere? ");
        int m= in.nextInt();
        in.nextLine();
        
        System.out.println("Il mese " + m + " si chiama \"" + nomeMese[m] + "\" e ha " + giornoMese[m] + " giorni.");




        //Quando invece dovete usare un array senza sapere cosa conterrà lo dovete...
        int[] a;            //Dichiarare
        a= new int[100];    //Allocare. Questa operazione occupa del tempo perchè deve trovare uno spazio contiguo in memeoria per 100 int (ovvero 400 Bytes consecutivi)
                            //          400 Bytes * 8 = 3200 bit (4 Bytes per ogni cella * 100 celle)
        //Ora proviamo ad scorrere tutti gli elementi e a inserire dati nell'array
        int somma=0;
        for(int i=0; i<a.length; i++)       //Molto simile alle stringhe, l'unica differenza è che length non è un metodo ma un attributo, non ha quindi le parentesi
        {
            somma+=i;
            a[i]= somma;                    //In ogni cella inseriremo la somma dei valori delle celle precedenti:
                                            //      a[0] == 0    a[1] == 1    a[2]== 1+2    a[3]==1+2+3
        }
        System.out.println("La somma dei primi 5 interi partendo da 0 è: " + a[4]);     //Dovrebbe stampare 10
        System.out.println(Arrays.toString(a));
        
        
        
        
        
        
        //Qualche parola sulle performances.
        //Usando "Gestione attività" di Windows (o "Task manager" di GNU/Linux o Mac OS) andremo a vedere quanta memoria occuperemo
        long timer= System.currentTimeMillis();     //Memorizzo il timer ad ora
        
        byte[] grandeQuantitàDiMemoria= new byte[2000000000];   //Riserviamo 2GB di memoria, se non ce ne sono di liberi e contigui, ci sarà un errore. Provate ad abbassare il valore
        //                              10 zeri  2'000'000'000 byte 

        timer= System.currentTimeMillis() - timer;  //Stoppiamo il cronometro
        
        System.out.println("Ci ho messo: " + timer + " millisecondi.");
        
        System.out.println("Premi return per terminare (nel frattempo guarda il task manager e vedrai che avrai 2 GB di RAM in meno.");
        in.nextLine();

        
        in.close();
            
    }
    
}
