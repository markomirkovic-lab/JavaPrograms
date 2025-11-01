public class TrovaMassimo {
    public static void main(String[] args) {
        
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) (Math.random() * 7);

        // Importante assegnare il primo valore dell'array come max
        // per avere un paragone eseguito correttamente in seguito
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        System.out.print("Contenuto array: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        
        System.out.println("\nValore massimo: " + max);
    }
}
