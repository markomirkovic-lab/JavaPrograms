public class EsempioRiutilizzoStep1 {

    public static void main(String[] args) {
        int x = 5;
        int maxX = 100;
        int roundsX = 20;
        for (int i = 0; i < roundsX; i++) {
            if (x < maxX) {
                x += x;
            } else {
                break;
            }
        }
        System.out.println("x = " + x);// 160
    }
}