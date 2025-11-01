public class Employee {
    static int nextId;

    int id;
    String name = "";
    double salary;

    // Object initialization block
    {
        id = nextId;
        nextId++;
    }
}
