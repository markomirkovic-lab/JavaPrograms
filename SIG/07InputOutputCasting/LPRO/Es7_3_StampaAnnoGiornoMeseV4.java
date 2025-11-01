import java.util.Scanner;

public class Es7_3_StampaAnnoGiornoMeseV4 {

    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);

        int dataIso;//aaaammgg¨
        String dataIsoString = "";
        String anno;
        String mese;
        String giorno;

        System.out.print("Scrivi una data in formato ISO [aaaammgg]: ");
        dataIso = input.nextInt();

        dataIsoString = String.valueOf(dataIso);

        anno = dataIsoString.substring(0,4);
        System.out.println("Anno: \t" + anno);

        mese = dataIsoString.substring(4, 6);
        System.out.println("Mese: \t" + mese);

        giorno = dataIsoString.substring(6, 8);
        System.out.println("Giorno: " + giorno);

        input.close();

        /*
        //        01234567
        int data= 20221011;     //Data ISO
        
        String meseString= "" + data;
        meseString= meseString.substring(4,6);
        System.out.println(meseString);//10
              
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
