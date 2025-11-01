class Automobile {
    boolean motoreAcceso = false;
    boolean autistaPresente = false;
    boolean porteChiuse = true;
    double temperaturaMotore = 25.8;
    String livelloBenzina = "Pieno";

    void mostraCaratteristiche() {
        System.out.println();
        System.out.println("Motore acceso: " + motoreAcceso);
        System.out.println("AutistaPresente: " + autistaPresente);
        System.out.println("Porte chiuse: " + porteChiuse);
        System.out.println("Temperatura motore: " + temperaturaMotore);
        System.out.println("Livello benzina: " + livelloBenzina);
        System.out.println();
    }

    void apriPorte() {
        porteChiuse = false;
    }

    boolean saliInAuto() {
        if (porteChiuse)
            return false;
        autistaPresente = true;
        porteChiuse = true;
        return true;
    }

    boolean accendiMotore() {
        if (!autistaPresente || livelloBenzina.equals("Vuoto"))
            return false;
        temperaturaMotore = 46.2;
        if (livelloBenzina.equals("Pieno"))
            livelloBenzina = "Metà";
        else
            livelloBenzina = "Vuoto";
        return true;
    }

    double temperaturaMotore() {
        return temperaturaMotore;
    }

    void impostaTemperaturaMotore(double temperatura) {
        temperaturaMotore = temperatura;
    }
}

public class TestAutomobile {
    public static void main(String[] args) {
        Automobile laMiaAuto = new Automobile();

        laMiaAuto.apriPorte();

        boolean isInAuto = laMiaAuto.saliInAuto();
        if (!isInAuto)
            return;

        boolean isAutoAccesa = laMiaAuto.accendiMotore();
        if (!isAutoAccesa)
            return;

        double temperatura = laMiaAuto.temperaturaMotore();
        System.out.println("Temperatura motore: " + temperatura);

        Automobile laTuaAuto = new Automobile();
        laTuaAuto.impostaTemperaturaMotore(21.7);

        Automobile[] automobili = new Automobile[10];
        automobili[0] = new Automobile();
        automobili[1] = new Automobile();
        automobili[2] = automobili[0];
        automobili[3] = new Automobile();
        // ...
        for (Automobile automobile : automobili)
        if (automobile != null)
        automobile.mostraCaratteristiche();
        System.out.println("0 e 1 uguali? "
        + (automobili[0] == automobili[1]));// false
        System.out.println("0 e 2 uguali? "
        + (automobili[0] == automobili[2]));// true
        


    }
}
