

public class PrePostIncrement {
    public static void main(String[] args) {
        
        int n = 42;
        int p = ++n + n++; //n=43

        //p=43+43   //n=44
        System.out.println("n: " + n + "\tp = " + p);

        p = n++ + ++n; //n=46

        //p=46 + 4
        System.out.println("n: " + n + "\tp = " + p);


    }
    
}
