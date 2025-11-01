
public class Es5_5_IALP 
{
    public static void main(String[] args) 
    {
        final String S="ciao mi chiamo Simone e frequento la SSSE";
        //                      _______      ___
        //              000000000011111111112222
        //              012345678901234567890123
        
        
        String partenza= "chiamo";
        int partenzaIndex= S.indexOf(partenza) + partenza.length();
        System.out.println(partenzaIndex);//14
        
        String fine= " e ";
        int fineIndex= S.indexOf(fine);
        System.out.println(fineIndex);//21
        
        System.out.println();
        
        String sottostringa= S.substring(partenzaIndex, fineIndex);
        
        System.out.println("[" + sottostringa + "]");
        
        sottostringa= sottostringa.toUpperCase().trim();
        System.out.println("[" + sottostringa + "]");
        
        
        //Tutto in una volta
        sottostringa= S.substring(S.indexOf(partenza) + partenza.length(), S.indexOf(fine)).toUpperCase().trim();
        //            S.substring(8                   + partenza.length(), S.indexOf(fine)).toUpperCase().trim();
        //            S.substring(8                   + 5                , S.indexOf(fine)).toUpperCase().trim();
        //            S.substring(13                                     , S.indexOf(fine)).toUpperCase().trim();
        //            S.substring(13                                     , 21             ).toUpperCase().trim();
        //            " Simone"                                                            .toUpperCase().trim();
        //            " SIMONE"                                                                          .trim();
        //            "SIMONE"
        System.out.println("[" + sottostringa + "]");
        
        
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
                
                
                
                
        
        
    }
}
