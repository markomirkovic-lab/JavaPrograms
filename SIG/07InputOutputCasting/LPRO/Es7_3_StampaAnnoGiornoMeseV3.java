import java.util.Scanner;

public class Es7_3_StampaAnnoGiornoMeseV3 {

    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);

        int dataIso;//aaaammgg
        int anno;
        int mese;
        int giorno;

        System.out.print("Scrivi una data in formato ISO [aaaammgg]: ");
        dataIso = input.nextInt();

        anno = dataIso / 10000;// / 100 * 100
        System.out.println("Anno: \t" + anno);

        mese = (dataIso/100) - (dataIso / 100 / 100 * 100);
        //       202210          20221011 / 100
        //                       202110 / 100
        //                       2022 * 100
        //       202210      -   202200         = 10
        System.out.println("Mese: \t" + (mese < 10 ? "0" + mese : mese));

        giorno = dataIso - ((dataIso/100) * 100);
        //       20221011 -  202210 * 100
        //       20221011 -  20221000           = 11
        System.out.println("Giorno: " + (giorno < 10 ? "0" + giorno : giorno));

        input.close();

        /*
        //        01234567
        int data= 20221011;     //Data ISO
        
        String meseString= "" + data;
        meseString= meseString.substring(4,6);
        System.out.println(meseString);//10
        
        int meseInt= (data/100)-(data /100 /100 *100);
        //           ( 202210 )-(data /100 /100 *100)        
        //           ( 202210 )-(202210    /100 *100)
        //           ( 202210 )-(2022           *100)
        //           ( 202210 )-(202200             )
        //           10
        System.out.println(meseInt);//10
        
        String mese= ("" + data).substring(4, 6);
        System.out.println(mese);//10
        */

        /*
        Scrivi una data in formato ISO [aaaammgg]: 20221011
        Anno:   2022
        Mese:   10
        Giorno: 11
        */
    }
    
}
