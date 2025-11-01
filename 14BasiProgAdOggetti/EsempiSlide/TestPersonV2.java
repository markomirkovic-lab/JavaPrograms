class PersonV2 {
    String firstName;
    String lastName;
    int age;
    double shoeSize;

    PersonV2(String firstName, String lastName, int age, double shoeSize) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.shoeSize = shoeSize;
    }

    void showPerson() {
        System.out.println(firstName + " " + lastName + ", " + age +
                " years, " + shoeSize);
    }
}

public class TestPersonV2 {
    public static void main(String[] args) {
        PersonV2 person1 = new PersonV2("Jane", "Doe", 25, 42.5);
        PersonV2 person2 = new PersonV2("John", "Doe", 68, 40.5);

        person1.showPerson();
        person2.showPerson();
    }
}
