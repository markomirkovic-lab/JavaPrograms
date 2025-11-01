class Car {
    boolean engineIsOn = false;
    boolean driverIsIn = false;
    boolean doorsAreClosed = true;
    double engineTemperature = 25.8;
    String fuelLevel = "Full";

    void openDoors() {
        doorsAreClosed = false;
    }

    boolean sitIn() {
        if (doorsAreClosed)
            return false;
        driverIsIn = true;
        doorsAreClosed = true;
        return true;
    }

    boolean turnEngineOn() {
        if (!driverIsIn || fuelLevel.equals("Empty"))
            return false;
        engineTemperature = 46.2;
        if (fuelLevel.equals("Full"))
            fuelLevel = "Middle";
        else
            fuelLevel = "Empty";
        return true;
    }

    double getEngineTemperature() {
        return engineTemperature;
    }

    void setEngineTemperature(double temperature) {
        engineTemperature = temperature;
    }

    void show() {
        System.out.println("engineIsOn: " + this.engineIsOn);
        System.out.println("driverIsIn: " + this.driverIsIn);
        System.out.println("doorsAreClosed: " + this.doorsAreClosed);
        System.out.println("engineTemperature: " + this.engineTemperature);
        System.out.println("fuelLevel: " + this.fuelLevel);
    }
}

public class TestCar {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.openDoors();

        boolean isIn = myCar.sitIn();
        if (!isIn)
            return;

        boolean isOn = myCar.turnEngineOn();
        if (!isOn)
            return;
        double temperature = myCar.getEngineTemperature();
        System.out.println("The temperature is: " + temperature);
        System.out.println("///");
        Car yourCar = new Car();
        yourCar.setEngineTemperature(21.7);

        myCar.show();
        System.out.println("///");
        yourCar.show();

        /*
        The temperature is: 46.2
        ///
        engineIsOn: false
        driverIsIn: true
        doorsAreClosed: true
        engineTemperature: 46.2
        fuelLevel: Middle
        ///
        engineIsOn: false
        driverIsIn: false
        doorsAreClosed: true
        engineTemperature: 21.7
        fuelLevel: Full
        */
    }
}
