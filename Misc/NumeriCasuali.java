public class NumeriCasuali {
    public static void main(String[] args) {
        // Numero casuale compreso tra 0.0 (incluso) e 1.0 (escluso)
        double numeroCasuale = Math.random();
        System.out.println(numeroCasuale);

        // Numero casuale compreso tra 0 (incluso) e 100 (escluso)
        int intCasuale = (int) (100 * numeroCasuale);
        System.out.println(intCasuale);

         // Numero casuale compreso tra 0 (incluso) e 25 (escluso)
        int intCasuale2 = (int) (25 * numeroCasuale);
        System.out.println(intCasuale2);

        // Numero casuale compreso tra 10 (incluso) e 50 (escluso)
        // 50 - 10 = 40 -> 40*
        int intCasuale3 = (int) (40 * numeroCasuale + 10);
        System.out.println(intCasuale3);

        /*
        Assuming the upper is the upper bound and lower is the lower bound, 
        then you can make a random number, r, between the two bounds with:
        int r = (int) (Math.random() * (upper - lower)) + lower;
        */

        // Numero casuale compreso tra 1 (incluso) e 100 (escluso)
        int intCasuale4 = (int) (100 * numeroCasuale + 1);
        System.out.println(intCasuale4);

        System.out.println("-------");

        /*
        for(int i = 1; i <101; i++) {
            int intCasuale5 = (int) (101 * numeroCasuale);
            System.out.println(intCasuale5);
            if(intCasuale5 == 100)
            break;
            System.out.println(intCasuale5);
        }
        */

        /*
        for (int i = 1; i <= 100 ; i++)
            {
                int Random = (int)(Math.random()*100);
                System.out.println(Random);
            }
        */

        /*
        // da 1 (compreso) a 100 (compreso)
        for (int i = 1; i <= 10000000 ; i++)
            {
                int random = (int)(Math.random()*100 + 1);// + 1 upper band is inclusive
                System.out.println(random);
                    if(random == 0)
                    break;//ctrl+c
            }
        */

        // da 0 (compreso) a 100 (compreso)
        for (int i = 1; i <= 10000000 ; i++)
            {   
                int min = 0;
                int max = 100;
                int random = (int)Math.floor(Math.random() * (max - min + 1) + min);// + 1 upper band is inclusive
                System.out.println(random);
                    if(random == 100)
                    break;//ctrl+c
            }

        // nextInt version
        //Random random = new Random();
        //int randomNumber = random.nextInt(upperBound - lowerBound) + lowerBound;




    }
}
