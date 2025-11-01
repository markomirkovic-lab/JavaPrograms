public class TrovaMassimoV2 {

    public static int max(int[] arr, int max, int i) {
        if (i == arr.length)
            return max;
        if (arr[i] > max)
            max = arr[i];
        return max(arr, max, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 5, 1000, 7 };
        System.out.println(max(arr, Integer.MIN_VALUE, 0));
    }
}