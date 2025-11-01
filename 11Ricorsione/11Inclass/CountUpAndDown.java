

public class CountUpAndDown {

    private static void countUp(int n) {

        //if(n == 0) {
        //    return;
        //}

        // parte da zero

   
        if(n < 0) {
            return;
        }

        int value = n - 1;

        countUp(value);// n-1

        System.out.println(n);

        /*
        countUp(3)
                        n-1  = 3 - (3 - 1) = 3 - 2 = 1
            countUp(2)
                            n-1 = 3 - ( 2 - 1) = 2
                countUp(1)
                                n-1 = ./.
            countUp()
                            1
        countUp()
                        2
        






        PS C:\Users\marko.mirkovic\JavaPrograms\11Ricorsione\11Inclass> java CountUpAndDown      
        Count up
        1
        2
        3
        4
        5
        6
        7
        8
        9
        10
        */

    }



    public static void main(String[] args) {
        
        System.out.println("Count up");
        countUp(3);

    }
    
}
