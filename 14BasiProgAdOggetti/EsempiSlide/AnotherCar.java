public class AnotherCar {
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

    // metodo di comportamento della classe
    // Usare un metodo di comportamento della classe (non statico) quando il metodo 
    // deve accedere o modificare lo stato di un'istanza specifica.
    void show() {
        System.out.println("Model: " + this.carModel + ", Number of doors: " + 
        this.carNumDoors + ", isElectric: " + this.carIsElectric);
    }

    void show2() {
        System.out.println("Model: " + carModel + ", Number of doors: " + 
        carNumDoors + ", isElectric: " + carIsElectric);
    }

    // Usare un metodo statico quando il metodo non dipende dallo stato di un'istanza 
    // specifica e può essere utilizzato in modo generico su qualsiasi istanza passata 
    // come parametro.
    void show(AnotherCar anotherCar) {
        System.out.println("Model: " + anotherCar.carModel + ", Number of doors: " + 
        anotherCar.carNumDoors + ", isElectric: " + anotherCar.carIsElectric);
    } 

    static void show2(AnotherCar anotherCar) {
        System.out.println("Model: " + anotherCar.carModel + ", Number of doors: " + 
        anotherCar.carNumDoors + ", isElectric: " + anotherCar.carIsElectric);
    } 


    public static void main(String[] args) {
        AnotherCar car1 = new AnotherCar("Ford", 5);
        AnotherCar car2 = new AnotherCar("Opel", 4, true);

        // usando il meotod void show()
        car1.show();
        car2.show();
        //Model: Ford, Number of doors: 5, isElectric: false
        //Model: Opel, Number of doors: 4, isElectric: true

        car1.show2();
        car2.show2();
        //Model: Ford, Number of doors: 5, isElectric: false
        //Model: Opel, Number of doors: 4, isElectric: true

        System.out.println("///");

        // usando il metodo void show(AnotherCar anotherCar):
        car1.show(car1);
        car2.show(car2);
        //Model: Ford, Number of doors: 5, isElectric: false
        //Model: Opel, Number of doors: 4, isElectric: true

        // +++

        // Per quanto sotto, bisogna invoicare invece un metodo statico:
        // static void show2(AnotherCar anotherCar)
        
        //show(car1);
        //show(car2);

        /*
        System.out.println("///");

        AnotherCar myCar1 = car1;
        AnotherCar myCar2 = car1;

        show(myCar1);
        show(myCar2);
        */

        /*
        Model: Ford, Number of doors: 5, isElectric: false
        Model: Opel, Number of doors: 4, isElectric: true
        ///
        Model: Ford, Number of doors: 5, isElectric: false
        Model: Ford, Number of doors: 5, isElectric: false
        */

    }
}
