public class CountDownAndUp {
    private static void countDown(int n) {
        System.out.print(n + " ");

        if (n == 0)
            return;

        countDown(n - 1);
    }

    private static void countUp(int n) {
        if (n == 0) {
            System.out.print(n + " ");
            return;
        }

        countUp(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        System.out.print("Count down: ");
        countDown(10);

        System.out.println("\n");
        System.out.print("Count up: ");
        countUp(10);
    }
}
