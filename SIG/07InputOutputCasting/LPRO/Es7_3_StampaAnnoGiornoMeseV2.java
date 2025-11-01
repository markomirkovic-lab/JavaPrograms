/*
7.3 Anno mese giorno
In una variabile long è presente una data espressa nel formato ISO (AAAAMMGG).
Scrivete un programma estragga e stampi l’anno, il mese e il giorno contenuto nella data.
Es:
long data=20140923;
//Dovrà stamparmi 2014, 9, 23 
*/
import java.util.Scanner;

public class Es7_3_StampaAnnoGiornoMeseV2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int dataIso;//aaaammgg
        int anno;
        int mese;
        int giorno;

        System.out.print("Scrivi una data in formato ISO [aaaammgg]: ");
        dataIso = input.nextInt();

        anno = dataIso / (100 * 100);
        // 20250124 / 10000 = 2025
        System.out.println("Anno: \t" + anno);

        mese = (dataIso - (anno * 100 * 100)) / 100;
        // 20250124 - 2025 * 10000
        // 20250124 - 20250000 = 0124
        // 0124 / 100 = 1
        System.out.println("Mese: \t" + (mese < 10 ? "0" + mese : mese));
        
        giorno = (dataIso - (anno * 100 * 100)) - (mese * 100);
        // 20250124 - (2025 * 10000) - (1 * 100)
        // 20250124 - 20250000 - 100
        // 0124 - 100 = 24
        System.out.println("Giorno: " + (giorno < 10 ? "0" + giorno : giorno));

        input.close();
    }
    
}
