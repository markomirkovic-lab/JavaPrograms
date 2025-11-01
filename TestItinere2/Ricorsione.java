public class Ricorsione {

    private static int calcolaLunghezza(String str) {
        if (str.equals("")) {
            return 0;
        }
        return 1 + calcolaLunghezza(str.substring(1));
    }

    private static boolean isOrdinato(int[] arr, int currentIndex) {
        if (currentIndex >= arr.length - 1) {
            return true;
        }
        if (arr[currentIndex] > arr[currentIndex + 1]) {
            return false;
        }
        return isOrdinato(arr, currentIndex + 1);
    }

    private static void controllaArray(int[] array) {
        boolean ordinato = isOrdinato(array, 0);
        if (ordinato) {
            System.out.println("L'array è ordinato.");
        } else {
            System.out.println("L'array non è ordinato.");
        }
    }

    public static void main(String[] args) {
        String input = "Ma che bello programmare";
        int lunghezza = calcolaLunghezza(input);
        System.out.println("La lunghezza della stringa è: " + lunghezza);

        int[] uno = { 1, 2, 3, 5, 3 };
        controllaArray(uno);

        int[] due = { 1, 2, 3, 5 };
        controllaArray(due);
    }
}