enum TipoBicchiere {
    FLUTE, TUMBLER, HIGHBALL, MARTINI
}

class Ingrediente {
    private final static int QUANTITA_DEFAULT = 10;
    private final static String INGREDIENTE_DEFAULT = "acqua tonica";

    String nome;
    int quantita;

    Ingrediente(String nome, int quantita) {
        if (quantita <= 0) {
            quantita = QUANTITA_DEFAULT;
        }
        if (nome == null || nome.equals("")) {
            nome = INGREDIENTE_DEFAULT;
        }
        this.nome = nome;
        this.quantita = quantita;
    }

    void mostra() {
        System.out.println("Ingrediente: " + nome + ", " + quantita + " millilitri");
    }

    Ingrediente copia() {
        return new Ingrediente(nome, quantita);
    }
}

class Cocktail {
    private final static int MAX_INGREDIENTI_DEFAULT = 10;
    private final static TipoBicchiere TIPO_BICCHIERE_DEFAULT = TipoBicchiere.FLUTE;

    TipoBicchiere bicchiere;
    Ingrediente[] ingredienti;
    int nrIngredienti;

    Cocktail(int maxIngredienti, TipoBicchiere bicchiere) {
        if (maxIngredienti <= 0) {
            maxIngredienti = MAX_INGREDIENTI_DEFAULT;
        }
        if (bicchiere == null) {
            bicchiere = TIPO_BICCHIERE_DEFAULT;
        }
        this.ingredienti = new Ingrediente[maxIngredienti];
        this.bicchiere = bicchiere;
    }

    boolean aggiungi(Ingrediente ingrediente) {
        if (ingrediente == null) {
            return false;
        }

        if (nrIngredienti == ingredienti.length) {
            return false;
        }

        ingredienti[nrIngredienti++] = ingrediente;
        return true;
    }

    int calcolaVolumeTotale() {
        int volumeTotale = 0;

        for (int i = 0; i < nrIngredienti; i++) {
            volumeTotale += ingredienti[i].quantita;
        }

        return volumeTotale;
    }

    void mostra() {
        System.out.println(
                "Cocktail con bicchiere " + bicchiere + ", volume totale " + calcolaVolumeTotale() + " millilitri");
        for (int i = 0; i < nrIngredienti; i++) {
            ingredienti[i].mostra();
        }
        System.out.println();
    }

    Cocktail copia() {
        Cocktail copia = new Cocktail(nrIngredienti, bicchiere);
        for (int i = 0; i < nrIngredienti; i++) {
            copia.aggiungi(ingredienti[i].copia());
        }

        return copia;
    }
}

public class CocktailTest {

    private static void aggiungiIngrediente(Cocktail cocktail, Ingrediente ingrediente) {
        boolean aggiunto = cocktail.aggiungi(ingrediente);
        if (aggiunto) {
            System.out.println("Aggiunto ingrediente " + ingrediente.nome);
        } else {
            System.out.println("Impossibile aggiungere ingrediente " + ingrediente.nome);
        }

        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("Creazione cocktail 1: Gin Fizz");
        Cocktail cocktail1 = new Cocktail(4, TipoBicchiere.HIGHBALL);
        aggiungiIngrediente(cocktail1, new Ingrediente("Gin", 45));
        aggiungiIngrediente(cocktail1, new Ingrediente("Succo di limone fresco", 30));
        aggiungiIngrediente(cocktail1, new Ingrediente("Sciroppo di zucchero", 10));
        aggiungiIngrediente(cocktail1, new Ingrediente("Soda", 60));
        aggiungiIngrediente(cocktail1, new Ingrediente("Succo d'arancia", 80));

        System.out.println();

        System.out.println("Creazione cocktail 2: Dry Martini");
        Cocktail cocktail2 = new Cocktail(8, TipoBicchiere.MARTINI);
        aggiungiIngrediente(cocktail2, new Ingrediente("Gin", 60));
        aggiungiIngrediente(cocktail2, new Ingrediente("Vermut dry", 10));
        aggiungiIngrediente(cocktail2, new Ingrediente("Liquido delle olive", 5));
        System.out.println();

        Cocktail cocktail3 = cocktail1.copia();
        if (cocktail3.ingredienti != null && cocktail3.ingredienti[0] != null) {
            cocktail3.ingredienti[0].quantita /= 2;
        }

        System.out.println("Cocktail 1:");
        cocktail1.mostra();

        System.out.println("Cocktail 2:");
        cocktail2.mostra();

        System.out.println("Cocktail 3:");
        cocktail3.mostra();
    }
}
