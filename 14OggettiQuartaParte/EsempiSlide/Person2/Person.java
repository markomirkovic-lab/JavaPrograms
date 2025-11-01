public class Person {
    String firstName;
    int age;

    Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    Person(Person person) {
        firstName = person.firstName;
        age = person.age;
    }

    Person clonePerson() {
        return new Person(this);
    }

    void show() {
        System.out.println(firstName + " " + age);
    }
}
