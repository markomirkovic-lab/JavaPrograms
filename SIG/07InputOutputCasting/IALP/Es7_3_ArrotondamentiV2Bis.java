public class Es7_3_ArrotondamentiV2Bis {

    public static void main(String[] args) {
        double variable = 3.1492654;

        // Ottenere la parte intera
        int variableIntero = (int) variable; // 3

        // Ottenere la parte decimale
        double variableDecimale = variable % variableIntero; // 0.141592654

        // Portare la parte decimale a due cifre significative
        variableDecimale = variableDecimale * 1000;
        System.out.println(variableDecimale);// 149.2654
        // 0.1492654 * 1000
        // 149.2654

        // Estrarre la terza cifra decimale
        int thirdDecimal = (int) (variableDecimale % 10);
        System.out.println(thirdDecimal);//9
        // 149.2654 % 10 = 9.2654
        // (int) 9.2654 = 9

        // Verificare se arrotondare
        variableDecimale = (int) (variableDecimale / 10); // 14

        //  9            >= 5
        if (thirdDecimal >= 5) {
            variableDecimale++; // Aumenta la seconda cifra se necessario
            // 14 + 1 = 15
        }

        // Ripristinare la parte decimale a due cifre
        variableDecimale = variableDecimale / 100; // 0.15
        // 15 / 100 = 0.15

        // Calcolare il risultato finale
        double roundedVariable = variableIntero + variableDecimale; // 3.15
        //                       3              + 0.15
        // 3.15

        // Stampare il risultato
        System.out.println("Arrotondato a due cifre decimali: " + roundedVariable);
    }
    
}
