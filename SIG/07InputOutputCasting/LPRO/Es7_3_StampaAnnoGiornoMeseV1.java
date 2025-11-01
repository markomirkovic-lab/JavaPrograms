/*
7.3 Anno mese giorno
In una variabile long è presente una data espressa nel formato ISO (AAAAMMGG).
Scrivete un programma estragga e stampi l’anno, il mese e il giorno contenuto nella data.
Es:
long data=20140923;
//Dovrà stamparmi 2014, 9, 23 
*/
import java.util.Scanner;

public class Es7_3_StampaAnnoGiornoMeseV1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int dataIso;//aaaammgg
        int anno;
        int mese;
        int giorno;

        System.out.print("Scrivi una data in formato ISO [aaaammgg]: ");
        dataIso = input.nextInt();

        anno = dataIso / 10000;
        System.out.println("Anno: \t" + anno);

        mese = (dataIso / 100) % 100;
        System.out.println("Mese: \t" + (mese < 10 ? "0" + mese : mese));

        giorno = (dataIso % 100);
        System.out.println("Giorno: " + (giorno < 10 ? "0" + giorno : giorno));

        input.close();
    }
    
}
