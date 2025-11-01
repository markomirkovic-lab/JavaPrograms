public class Car {
    static String defaultModel = "Fiat";

    String carModel = null;

    Car(String model) {
        carModel = model;
    }

    String getCarModel() {
        return carModel;
    }

    static String getDefaultModel() {
        return defaultModel;
    }
}
