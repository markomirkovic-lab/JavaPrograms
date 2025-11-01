public class Automobile {

    private static String modelloDefault = "Aston Martin";

    private static void setModello(String modelloAuto, String modelloDefault) {
        // ...
        System.out.println("Nella procedura setModello(), Automobile.modelloDefault = " + Automobile.modelloDefault);
        // Nella procedura setModello(), Automobile.modelloDefault = Aston Martin
        System.out.println("Nella procedura setModello(), modelloDefault = " + modelloDefault);
        // Nella procedura setModello(), modelloDefault = Ferrari
        // ...
    }

    public static void main(String[] args) {
        String modelloDefault = "Ford";
        // ...

        System.out.println("Automobile.modelloDefault = " + Automobile.modelloDefault);
        // Automobile.modelloDefault = Aston Martin
        System.out.println("modelloDefault = " + modelloDefault);
        // modelloDefault = Ford
        // ...

        setModello("Audi", "Ferrari");

        // ...
        Automobile.modelloDefault = "Tesla";
        System.out.println("Automobile.modelloDefault = " + Automobile.modelloDefault);
        // Automobile.modelloDefault = Tesla
        System.out.println("modelloDefault = " + modelloDefault);
        // modelloDefault = Ford
        // ...

        /*
        Automobile.modelloDefault = Aston Martin
        modelloDefault = Ford
        Nella procedura setModello(), Automobile.modelloDefault = Aston Martin
        Nella procedura setModello(), modelloDefault = Ferrari
        Automobile.modelloDefault = Tesla
        modelloDefault = Ford
        */
    }
}
