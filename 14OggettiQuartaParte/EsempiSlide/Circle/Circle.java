public class Circle {
    static int numberOfCircles;
    double radius;

    Circle(double radius) {
        this.radius = radius <= 0 ? 1 : radius;
        numberOfCircles++;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }
}
