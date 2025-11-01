

public class OperatoreTernario {

    public static void main(String[] args) {

        /*
        Operatore ternario

        Come dice il nome e' un operatore che necessita di tre operandi.
        (fn excel se())

        operando 1              ?   operando 2                  : operando 3                    ;
        espressione di test     ?   espressione se test == true : espressione se test == false  ;
        */
        
        char genere = 'd';
        String saluto = genere == 'd' ? "Gentile signora " : "Egregio signore ";

        // excel: se( D2 = "d", "Gentile signora ", "Egregio signore ")

        System.out.println(saluto);

    }
    
}
