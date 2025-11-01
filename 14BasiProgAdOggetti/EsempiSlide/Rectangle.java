import java.lang.reflect.Field;

public class Rectangle {
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

    int x(Rectangle rectangle) {
        return this.x;
    }

    int y(Rectangle rectangle) {
        return this.y;
    }

    void show() {
        System.out.println("x: " + this.x + " y: " + this.y + 
        " width: " + this.width + " length: " + this.height);
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(5, 6);
        Rectangle rect3 = new Rectangle(1, 2, 3, 4);

        rect1.show();
        rect2.show();
        rect3.show();

        /*
        x: 0 y: 0 width: 0 length: 0
        x: 0 y: 0 width: 5 length: 6
        x: 1 y: 2 width: 3 length: 4
        */

        System.out.println("///");
        rect1.x = 3;
        rect1.show();

        /*
        ///
        x: 3 y: 0 width: 0 length: 0
        */

        System.out.println("///");
        int x = rect1.x;
        System.out.println(x);

        /*
        ///
        3
        */

        System.out.println(rect1.x());

    }
}
