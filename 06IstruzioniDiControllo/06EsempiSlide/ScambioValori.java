public class ScambioValori {
    public static void main(String[] args) {

        int x = 1;
        int y = 0;
        {
            // Questo blocco scambia i valori di x e y.
            int temp; // Variabile temporanea utilizzata nel blocco.
            temp = x; // Memorizza il valore di x in temp.
            x = y; // Copia il valore di y in x.
            y = temp; // Copia il valore di temp in y.
            System.out.println("temp: " + temp);
        }

        System.out.println("x: " + x);
        System.out.println("y: " + y);

        /*
        temp: 1
        x: 0
        y: 1
        */
        

    }
}
