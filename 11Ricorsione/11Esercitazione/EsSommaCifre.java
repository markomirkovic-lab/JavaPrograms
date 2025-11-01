/*
Esercizio 1 - Somma cifre
Sviluppate un programma in grado di calcolare, ricorsivamente, la somma delle cifre
che compongono un numero.
Ad esempio, dato il numero 12974, il programma restituirà 23 (che é il risultato di 1 + 2 +
9 + 7 + 4).
*/
public class EsSommaCifre {

    private static int sommaLeCifre(int numero) {

        // Condizione di base
        if(numero < 10){
            return numero;
        }

        return numero % 10 + sommaLeCifre(numero / 10);



    }
    public static void main(String[] args) {


        int numero = 12974;

        System.out.println(sommaLeCifre(numero));
        
    }
}
