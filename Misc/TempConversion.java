/**
* Programma che converte la temperatura da Celsius a Fahrenheit. La
* temperatura da convertire va specificata come parametro al lancio
* (ad esempio: java TempConversion 20).
*/
public class TempConversion {
    /**
    * Procedura main , viene eseguita al lancio del programma
    */
    public static void main(String[] args) {

        if (args.length < 1) {
        System.out.println("La temperatura da convertire deve " +
        "essere passata come parametro al lancio. Ad " +
        "esempio: java TempConversion 10.5");
        return;
        }
        if (args.length > 1)
        System.out.println("L'applicazione richiede un solo " +
        "parametro; tutti gli altri sono ignorati.");
        
        // Converte il parametro ricevuto da String a double
        double celsius = Double.parseDouble(args[0]);

        // Mostra la temperatura in Celsius
        System.out.println("Temperatura in Celsius: " + celsius);
        
        // Converte e mostra la temperatura in Fahrenheit
        double fahrenheit = (celsius / 5.) * 9. + 32.;
        System.out.println("Temperatura in Fahrenheit: " + fahrenheit);
    }

}
