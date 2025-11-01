class Data {
    int a;
    int b;

    Data(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void swap() {
        int temp = a;
        a = b;
        b = temp;
    }

    void show() {
        System.out.println("a: " + a + ", b: " + b);
    }
}

public class TestSwap {
    public static void main(String[] args) {
        Data data = new Data(20, 56);

        System.out.print("Before -- ");
        data.show();

        data.swap();

        System.out.print("After -- ");
        data.show();

        /*
        Before -- a: 20, b: 56
        After -- a: 56, b: 20
        */
    }
}
