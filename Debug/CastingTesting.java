public class CastingTesting {

    public static void main(String[] args) {
        

        double a = 40.9393034;
        int b = 100;

        double c = a * b;

        System.out.println(c);//4093.93034

        System.out.println(40.9393034 * 100);//4093.93034

        System.out.println(Math.round(40.9393034*100));//4094

        System.out.println(Math.round(40.9393034*100) / 100);//40

        double d = Math.round(40.9393034*100);
        System.out.println(d);//40.94
        System.out.println(d/100);//40.94
        double e = d / 100;
        System.out.println(e);//40.94

        double d2 = Math.round(40.9393034*100);
        //                    (40.9393034) casta a double il risultato 
        //          Math.round(4093.93034) casta a long
        //                     4094        long 
        //                     4094.0      casta a double 
        System.out.println("d2 " + d2);//d2 4094.0
        double e2 = d2 / 100;
        System.out.println(e2);//40.94

        double d3 = Math.round(40.9393034*100.0);
        //                    (40.9393034) casta a double il risultato 
        //          Math.round(4093.93034) casta a long
        //                     4094        long 
        //                     4094.0      casta a double 
        System.out.println("d3 " + d3);//d3 d3 4094.0



        System.out.println((40.9393034*100) / 100);//40.9393034

        System.out.println( (long) (40.9393034*100) / 100);//40
        //                          40 * 100 / 100
        //                          4000 / 100
        //                          40

        System.out.println(Math.round(40.9393034*100.0) / 100);//40
        //                            4093.93034        / 100
        //                            40    casta a long                          

        System.out.println(Math.round(40.9393034*100.0) / 100.0);//40.94
        //                            (40.9393034) double * double = double il risultato 
        //                  Math.round(4093.93034) casta a long
        //                             4093
        //                             4093             / 100.0     casta a double
        //                             40.93                        double
        

    }
}