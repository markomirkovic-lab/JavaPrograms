public class EsempioStampaArray {
    private static void stampaArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array1 = { 7, 8, 9, 10, 11 };
        stampaArray(array1);

        int[] array2 = { 1, 2, 3, 4, 5 };
        stampaArray(array2);
    }
}
