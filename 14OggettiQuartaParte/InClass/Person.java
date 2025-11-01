
public class Person {
    String name;
    String surname;

    public Person(String name, String surname) {
        this.name = name == null || name.isBlank() ? "Unknown" : name;
        this.surname = surname == null || surname.isBlank() ? "Unknown" : surname;
    }

    void show(){
        System.out.println(name + " " + surname);
    }
}
