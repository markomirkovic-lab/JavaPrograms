public class BicycleTest {
    public static void main(String[] args) {
        int baseSpeed = Bicycle.getBaseSpeed();
        System.out.println(baseSpeed);

        Bicycle myBike = new Bicycle();
        Bicycle.increaseBaseSpeed();
        myBike.speedUp(20);
        System.out.println(myBike.getSpeed());
        Bicycle mySecondBike = new Bicycle();
        Bicycle.increaseBaseSpeed();
        mySecondBike.speedUp(30);
        mySecondBike.applyBrake(15);
        System.out.println(mySecondBike.getSpeed());

        System.out.println(myBike.getSpeed());
    }

}
