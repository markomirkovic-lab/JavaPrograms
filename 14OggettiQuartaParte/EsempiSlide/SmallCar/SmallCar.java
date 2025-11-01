public class SmallCar {
    String carModel = "Ford";
    static String defaultModel = "Fiat";

    String getCarModel() {
        return carModel;
    }

    void setCarModel(String carModel, String defaultModel) {
        this.carModel = carModel;
        SmallCar.defaultModel = defaultModel;
    }
}
