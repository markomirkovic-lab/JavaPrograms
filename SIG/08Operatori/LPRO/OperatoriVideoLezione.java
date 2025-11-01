

public class OperatoriVideoLezione {

    public static void main(String[] args) {
        
        int k = 3;
        int p = 9;

        System.out.println("k!=p \t\t\t" + (k!=p));
        System.out.println("k<p || k>p \t\t" + (k<p || k>p));

        System.out.println();

        System.out.println("k==p \t\t\t" + (k==p));
        System.out.println("!(k<p || k>p) \t\t" + (!(k<p || k>p)));
        System.out.println("!(k<p) && !(k>p) \t" + (!(k<p) && !(k>p)));
        // non rispetta l'uguaglianza == con k = 3, p = 9
        System.out.println("|| non rispetta l'uguaglianza == se k = 3 e p = 9 :");
        System.out.println("!(k<p) || !(k>p) \t" + (!(k<p) || !(k>p)));

        System.out.println();

        k = 3;
        p = 3;
        // rispetta l'uguaglianza == se k = 3 e p = 3
        System.out.println("|| rispetta l'uguaglianza == se k = 3 e p = 3 :");
        System.out.println("!(k<p) || !(k>p) \t" + (!(k<p) || !(k>p)));

        /*
        k!=p                    true
        k<p || k>p              true

        k==p                    false       USARE SEMPRE QUESTA
        !(k<p || k>p)           false       USARE SEMPRE QUESTA
        !(k<p) && !(k>p)        false       USARE SEMPRE QUESTA
        || non rispetta l'uguaglianza == se k = 3 e p = 9 :
        !(k<p) || !(k>p)        true        NON USARE QUESTA

        || rispetta l'uguaglianza == se k = 3 e p = 3 :
        !(k<p) || !(k>p)        true
        */


    }
    
}
