public class PrePostIncremento {
    public static void main(String[] args) {
        int i = 2, j = 3, k = 4;

        i++; // i = i + 1
        --j; // j = j - 1
        k *= i + j; // k = k * (i + j)
        System.out.println("Step 1: i=" + i + ", j=" + j + ", k=" + k);

        i = k % j; // i = k modulo j
        j = k / 3; // integer division
        System.out.println("Step 2: i=" + i + ", j=" + j + ", k=" + k);

        i = 2;
        j = i++; // j = i; i = i + 1;
        k = ++i; // i = i + 1; k = i;
        System.out.println("Step 3: i=" + i + ", j=" + j + ", k=" + k);
    }
}
