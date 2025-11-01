public class Car {

    static String defaultModel = "Aston Martin";

    void setModel(String carModel, String defaultModel) {
        // ...
        System.out.println(defaultModel);
        // ...
    }

    public static void main(String[] args) {
        String defaultModel = "Ford";
        System.out.println(defaultModel);
        // ...
        Car.defaultModel = "Tesla";
        // ...
    }
}
