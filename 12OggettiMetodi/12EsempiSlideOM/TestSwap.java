class Dato {
    int a;
    int b;

    Dato(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void scambia() {
        int temp = a;
        a = b;
        b = temp;
    }

    void mostra() {
        System.out.println("a: " + a + ", b: " + b);
    }
}

public class TestSwap {
    public static void main(String[] args) {
        Dato dato = new Dato(20, 56);

        System.out.print("Prima -- ");
        dato.mostra();

        dato.scambia();

        System.out.print("Dopo -- ");
        dato.mostra();
    }
}
