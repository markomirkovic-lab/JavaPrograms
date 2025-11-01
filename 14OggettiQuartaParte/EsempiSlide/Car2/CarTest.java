
public class CarTest {
    public static void main(String[] args) {
        String defaultModel = Car.getDefaultModel();
        System.out.println(defaultModel);

        Car car = new Car();
        car.carModel = "Opel";

        String carModel = car.getCarModel();
        System.out.println(carModel);
    }

}
