public class Bicycle {
    static int baseSpeed = 10;
    int relativeSpeed = 0;

    static int getBaseSpeed() {
        return baseSpeed;
    }

    static void increaseBaseSpeed() {
        baseSpeed += 10;
    }

    int getSpeed() {
        return baseSpeed + relativeSpeed;
    }

    void applyBrake(int decrement) {
        relativeSpeed -= decrement;
    }

    void speedUp(int increment) {
        relativeSpeed += increment;
    }
}
