public class TrovaMassimoV1 {
    public static int max(int[] arr, int i) {
        if (i == arr.length - 1)
            return arr[i];
        return Math.max(arr[i], max(arr, i + 1));
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 5, 1000, 7 };
        System.out.println(max(arr, 0));
    }
}