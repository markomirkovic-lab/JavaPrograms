class AnotherCar {
    String carModel = null;
    int carNumDoors = 0;
    boolean carIsElectric = false;

    AnotherCar(String model, int numDoors) {
        carModel = model;
        carNumDoors = numDoors;
    }

    AnotherCar(String model, int numDoors, boolean electric) {
        this(model, numDoors);
        carIsElectric = electric;
    }
}

public class TestAnotherCar {

    private static void mostra(AnotherCar car) {
        System.out.println("Car:");
        System.out.println("Model: " + car.carModel);
        System.out.println("Number of doors: " + car.carNumDoors);
        System.out.println("Is electric: " + car.carIsElectric);
    }

    public static void main(String[] args) {
        AnotherCar car1 = new AnotherCar("Fiat", 3);
        AnotherCar car2 = new AnotherCar("Testa", 5, true);

        mostra(car1);
        System.out.println();
        mostra(car2);

        /*
        Car:
        Model: Fiat
        Number of doors: 3
        Is electric: false

        Car:
        Model: Testa
        Number of doors: 5
        Is electric: true
        */
    }

}
