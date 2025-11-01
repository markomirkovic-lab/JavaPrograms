class Automobile {
    boolean motoreAcceso = false;
    boolean autistaPresente = false;
    boolean porteChiuse = true;
    double temperaturaMotore = 25.8;
    String livelloBenzina = "Pieno";

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
    }
}
