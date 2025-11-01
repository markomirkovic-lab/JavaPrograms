public class IntAndChar {

    public static void main(String[] args) {
        char c = '$'; // Valore intero associato: 36

        int a = c + 1; // Dal momento che 'c' è un char, Java converte automaticamente il carattere '$'
                       // nel suo valore intero.

        char b = 97; // Dal momento che 'b' è un char, Java converte automaticamente il valore letterale
                     // nel rispettivo carattere 'a' (visto che il valore rientra nel range di
                     // valori rappresentabili da un char).

        // char bb = 65536; // Non compila perché 65536 e' fuori dal range di 'char'
                            // (0-65535).

        System.out.println("Valore di a = c + 1: " + a);
        System.out.println("b: " + b);

        int d = 98;
        char e = (char) d; // Il casting esplicito e' necessario perche' 'int' e 'char' sono tipi
                           // incompatibili (int e' a 32 bit e char e' a 16 bit).

        System.out.println("e: " + e);
    }
}