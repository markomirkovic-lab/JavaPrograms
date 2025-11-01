// Creating a method
// that prints a message
public class Method {

    /*
    Syntax of a Method
    <access_modifier> <return_type> <method_name>( list_of_parameters)
    {
        //body
    }


    Key Components of a Method Declaration:
    Modifier: It specifies the method’s access level (e.g., public, private, protected, or default).
    Return Type: The type of value returned, or void if no value is returned.
    Method Name: It follows Java naming conventions; it should start with a lowercase verb and use 
                 camel case for multiple words.
    Parameters: A list of input values (optional). Empty parentheses are used if no parameters are
                needed.
    Exception List: The exceptions the method might throw (optional).
    Method Body: It contains the logic to be executed (optional in the case of abstract methods).
    */
  
    // Method to print message
    public void printMessage() {
        System.out.println("Hello, Geeks!");
    }

    public static void main(String[] args) {
      
        // Create an instance of the Method class
        Method m = new Method();
        m.printMessage();  // Calling the method


        //Hello, Geeks!
    }
}
