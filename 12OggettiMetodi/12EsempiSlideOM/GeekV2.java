class GeekV2 {
    private int num;
    private String n;

    // Accessor (getter) methods
    public int getNumber() { 
      return num; 
    }

    public String getName() { 
      return n; 
    }

    // Mutator (setter) methods
    public void setNumber(int num) { 
      this.num = num; 
    }

    public void setName(String n) { 
      this.n = n; 
    }

    // Other methods
    public void printDetails() {
        System.out.println("Number: " + num);
        System.out.println("Name: " + n);
    }

    /*
    The Geek class contains private fields num and n, with getter and setter 
    method to access and modify their values. The printDetails() method 
    prints the values of num and n to the console. In the main method, 
    the setNumber, setName, and printDetails methods are called to set 
    and display the object’s details.
    */

    // Main method to run the code
    public static void main(String[] args) {
        GeekV2 g = new GeekV2();
        g.setNumber(123);   // Set the number
        g.setName("GFG Write");   // Set the name
        g.printDetails();  

        // Number: 123
        // Name: GFG Write
    }
}