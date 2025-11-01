
/**
 * This class demonstrates the difference between static and instance members in Java.
 * It represents a bank account with both instance-specific data and class-level information.
 */
public class BankAccount {
    // Instance fields: each object has its own copy
    double balance;          // Specific to each account
    Person accountHolder;    // Each account has its own account holder
    int idNumber;           // Unique ID for each account

    // Static field: shared among all BankAccount objects
    // Used to generate unique ID numbers for all accounts
    // Funziona per qualsiasi tipo di campo, oggetti, array, etc.
    static int lastAssignedIdNumber = 0;

    /**
     * Constructor initializes instance fields.
     * Note how it uses the static field lastAssignedIdNumber to generate unique IDs.
     * This demonstrates how static fields maintain state across all instances.
     */
    public BankAccount(double balance, Person accountHolder) {
        this.balance = balance < 0 ? 0 : balance;
        this.accountHolder = accountHolder == null ? new Person("Unknown", "Unknown") : accountHolder;
        this.idNumber = ++lastAssignedIdNumber;  // Static field is incremented for each new account
    }

    /**
     * Instance method: can access both instance and static members
     * This method requires an instance because it uses instance fields
     */
    void show(){
        System.out.println("Bank account: id number " + idNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Account holder:");
        accountHolder.show();
    }

    /**
     * Static method: can only access static members
     * This method belongs to the class itself, not to any specific instance
     * It can be called without creating a BankAccount object
     */
    static int getTotalAccounts() {
        return lastAssignedIdNumber;  // Can access static fields
    }

    // Educational example of what NOT to do:
    /**
     * This commented-out code shows common mistakes with static methods
     * Static methods CANNOT directly access instance members (fields or methods)
     * because there is no specific instance to reference
     */
//    static void someMethod() {
//        System.out.println("Balance: " + balance); // Error: can't access instance field
//        show(); // Error: can't call instance method
//    }
}
