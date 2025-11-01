
public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Mario", "Rossi");
        BankAccount bankAccount1 = new BankAccount(0,person1);
        bankAccount1.show();

        System.out.println();

        Person person2 = new Person("Luca", "Bianchi");
        BankAccount bankAccount2 = new BankAccount(0,person2);
        bankAccount2.show();

        System.out.println();

        System.out.println("Last assigned number: " + BankAccount.lastAssignedIdNumber);
        System.out.println("Total account: " + BankAccount.getTotalAccounts());
    }
}
