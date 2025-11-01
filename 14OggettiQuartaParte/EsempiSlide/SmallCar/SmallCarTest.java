public class SmallCarTest {

    public static void main(String[] args) {
        SmallCar smallCar = new SmallCar();
        System.out.println(SmallCar.defaultModel);

        smallCar.setCarModel("Opel", "Ford");

        System.out.println(SmallCar.defaultModel);
        System.out.println(smallCar.getCarModel());
    }

}
