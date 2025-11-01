/*
Main e' una procedura
I parametri della procedura main permettono di specificare degli
argomenti al momento del lancio del programma (info di config)
*/

public class TestArgomentiMain {
    public static void main(String[] args) {
        System.out.print("Argomenti: ");
        for (String arg : args)
            System.out.print(arg + " ");

            //PS C:\Users\marko.mirkovic\JavaPrograms\10SottoProgrammi\10EsempiSlide> java TestArgomentiMain Test 1 2 3
            //Argomenti: Test 1 2 3 
    }
}
