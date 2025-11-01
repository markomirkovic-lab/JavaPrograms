class Rectangle {
    int x, y;
    int width, height;

    Rectangle() {
        this(0, 0, 0, 0);
    }

    Rectangle(int width, int height) {
        this(0, 0, width, height);
    }

    Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}

public class TestRectangle {

    private static void mostra(Rectangle rectangle) {
        System.out.println("Rectangle");
        System.out.println("x: " + rectangle.x);
        System.out.println("y: " + rectangle.y);
        System.out.println("width: " + rectangle.width);
        System.out.println("height: " + rectangle.height);
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(5, 10);
        Rectangle rectangle3 = new Rectangle(1, 2, 3, 4);

        mostra(rectangle1);
        System.out.println();

        mostra(rectangle2);
        System.out.println();

        mostra(rectangle3);
        System.out.println();

        /*
        PS C:\Users\marko.mirkovic\JavaPrograms\12OggettiDefinireNuviTipiDiDato\12EsempiSlideODNTDD> java TestRectangle
        Rectangle
        x: 0
        y: 0
        width: 0
        height: 0

        Rectangle
        x: 0
        y: 0
        width: 5
        height: 10

        Rectangle
        x: 1
        y: 2
        width: 3
        height: 4
        */
    }
}
