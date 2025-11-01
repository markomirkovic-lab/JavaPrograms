/*
Puoi passare args dal main ad altri metodi, oppure creare nuovi array 
di stringhe e passarli a metodi che accettano String[] come parametro.

args è semplicemente un array di stringhe, quindi può essere manipolato 
come qualsiasi altro array in Java.
*/
public class StampaArgs {

    public static void elaboraArgomenti(String[] args) {
        for (String arg : args) {
            System.out.print(arg.toUpperCase() + " ");
        }
    }

    public static void main(String[] args) {
        String[] mieiArgomenti = {"Ciao", "Mondo", "Java"};
        elaboraArgomenti(mieiArgomenti);
    }
}