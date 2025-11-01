

public class PersonTest {

    public static void main(String[] args) {
        Person person1 = new Person("Mario", 18);

        Person person2 = person1.clonePerson();

        person1.show();
        person2.show();
    }

}
