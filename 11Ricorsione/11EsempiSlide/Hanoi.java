public class Hanoi {
    private static void move(String start, String end) {
        System.out.println(start + " -> " + end);
    }

    private static void hanoi(int n, String start, String aux, String end) {
        if (n == 1) {
            move(start, end);
        } else {
            hanoi(n - 1, start, end, aux);
            hanoi(1, start, aux, end);
            hanoi(n - 1, aux, start, end);
        }
    }

    public static void main(String[] args) {
        hanoi(3, "A", "B", "C");
    }
}
