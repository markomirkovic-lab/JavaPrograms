public class CircleTest {
    public static void main(String[] args) {
        System.out.println("Number of circles: " + Circle.numberOfCircles);
        Circle circle1 = new Circle(3);
        System.out.println("Area circle 1: " + circle1.getArea());
        Circle circle2 = new Circle(7);
        System.out.println("Area circle 2: " + circle2.getArea());
        System.out.println("Number of circles: " + Circle.numberOfCircles);
    }
}
