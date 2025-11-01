public class EsempioMostraValore {

    private static void mostraValoreSePositivo1(int valore) {
        if(valore >= 0)
            System.out.println(valore);
    }

    private static void mostraValoreSePositivo2(int valore) {
        if (valore < 0) {
            return;
        }
        System.out.println(valore);// non dovrebbe stampare causa return, ma stampa lo stesso???
    }

    public static void main(String[] args) {
        
        mostraValoreSePositivo1(-1);//
        mostraValoreSePositivo2(-1);//
        mostraValoreSePositivo1(1);// 1
        mostraValoreSePositivo2(1);// 1

    }
    
}
