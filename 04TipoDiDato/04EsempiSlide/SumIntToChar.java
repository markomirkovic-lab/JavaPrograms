public class SumIntToChar {

    public static void main(String[] args) {
        char c = '$'; // valore intero associato: 36

        int a = c + 1; // dal momento che 'c' è un char, Java converte automaticamente il carattere '$'
                       // nel suo valore intero

        char b = 97; // dal momento che 'b' è un char, Java converte automaticamente il valore intero
                     // nel rispettivo carattere 'a'

        System.out.println("Valore di a = c + 1: " + a);
        System.out.println("b: " + b);
    }
}