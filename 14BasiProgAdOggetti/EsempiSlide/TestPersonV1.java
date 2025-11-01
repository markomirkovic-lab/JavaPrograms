class PersonV1 {
    String firstName;
    String lastName;
    int age;
    double shoeSize;

    PersonV1(String firstName, String lastName, int age, double shoeSize) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.shoeSize = shoeSize;
    }
}

public class TestPersonV1 {
    
    private static void showPerson(PersonV1 person) {
        System.out.println(person.firstName + " " + person.lastName + ", " +
                person.age + " years, " + person.shoeSize);
    }

    public static void main(String[] args) {
        PersonV1 person1 = new PersonV1("Jane", "Doe", 25, 42.5);
        PersonV1 person2 = new PersonV1("John", "Doe", 68, 40.5);

        showPerson(person1);
        showPerson(person2);
    }
}
