public class SommaNumeri {
    public static void main(String[] args) {

        double[] arr = new double[10];

        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) (Math.random() * 30);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.println();

        double somma = 0.;
        for (int i = 0; i < arr.length; i++)
            somma += arr[i];

        System.out.println("Somma: " + somma);

        /*
        18.0 19.0 11.0 26.0 8.0 1.0 25.0 17.0 14.0 7.0 
        Somma: 146.0
        */
    }
}
