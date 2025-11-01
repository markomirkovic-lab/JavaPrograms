enum TipoPortata {
    PRIMO, SECONDO, DESSERT
}

class Piatto {
    String nome;
    TipoPortata tipo;
    String[] ingredienti;

    Piatto(String nome, TipoPortata tipo, String[] ingredienti) {
        this.nome = nome == null || nome.isBlank() ? "Piatto sconosciuto" : nome ;
        this.tipo = tipo == null ? TipoPortata.DESSERT : tipo;
        this.ingredienti = ingredienti == null ? new String[]{"Ingrediente sconosciuto"} : ingredienti;
    }

    void visualizza() {
        System.out.println("Piatto: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Ingredienti:");
        for (int i = 0; i < ingredienti.length; i++) {
            System.out.println("- " + ingredienti[i]);
        }
    }

    Piatto clona() {
        String[] nuoviIngredienti = new String[ingredienti.length];
        for (int i = 0; i < ingredienti.length; i++) {
            nuoviIngredienti[i] = ingredienti[i];
        }
        return new Piatto(this.nome, this.tipo, nuoviIngredienti);
    }
}

class Menu {
    String nome;
    Piatto[] piatti;
    int numPiatti;
    static final int DEFAULT_NUMERO_MASSIMO_PIATTI = 5;


    Menu(String nome, int numeroMassimoPiatti) {
        this.nome = nome == null || nome.isBlank() ? "Menu sconosciuto" : nome ;
        this.piatti = numeroMassimoPiatti > 0 ? new Piatto[numeroMassimoPiatti] : new Piatto[DEFAULT_NUMERO_MASSIMO_PIATTI];
        this.numPiatti = 0;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    boolean aggiungiPiatto(Piatto piatto) {
        if (numPiatti >= piatti.length || piatto == null) {
            return false;
        }

        piatti[numPiatti] = piatto;
        numPiatti++;
        return true;
    }

    void visualizza() {
        System.out.println("=== " + nome + " ===");
        if (numPiatti == 0) {
            System.out.println("Menu vuoto");
            return;
        }
        for (int i = 0; i < numPiatti; i++) {
            piatti[i].visualizza();
            System.out.println("---------------");
        }
    }

    Menu clona() {
        Menu nuovo = new Menu(this.nome, this.piatti.length);
        for (int i = 0; i < numPiatti; i++) {
            nuovo.aggiungiPiatto(piatti[i].clona());
        }
        return nuovo;
    }

    boolean rimuoviPiatto(String nomePiatto) {
        if(nomePiatto == null || nomePiatto.isBlank()){
            return false;
        }

        int indice = -1;
        for (int i = 0; i < numPiatti; i++) {
            if (piatti[i].nome.equals(nomePiatto)) {
                indice = i;
                break;
            }
        }

        if (indice == -1) {
            return false;
        }

        for (int i = indice; i < numPiatti - 1; i++) {
            piatti[i] = piatti[i + 1];
        }
        piatti[numPiatti - 1] = null;
        numPiatti--;
        return true;
    }
}

class MainTest {
    public static void main(String[] args) {
        // Test Parte 1
        String[] ingredientiRisotto = {
            "Riso", "Funghi porcini", "Parmigiano"
        };
        Piatto risotto = new Piatto("Risotto ai funghi", TipoPortata.PRIMO, ingredientiRisotto);
        
        System.out.println("=== Test Parte 1 ===");
        risotto.visualizza();
        
        // Test Parte 2
        String[] ingredientiPasta = {
            "Pasta", "Pesto", "Parmigiano"
        };
        Piatto pasta = new Piatto("Pasta al pesto", TipoPortata.PRIMO, ingredientiPasta);

        String[] ingredientiCrostata = {
            "Pasta frolla", "Crema pasticcera", "Frutta"
        };
        Piatto crostata = new Piatto("Crostata alla frutta", TipoPortata.DESSERT, ingredientiCrostata);
        
        System.out.println("\n=== Test Parte 2 ===");
        Menu menuGiorno = new Menu("Menu del giorno", 3);
        menuGiorno.aggiungiPiatto(crostata);
        menuGiorno.aggiungiPiatto(risotto);
        menuGiorno.aggiungiPiatto(pasta);

        String[] ingredientiPastaPomodoro = {
            "Pasta", "Pomodoro", "Basilico"
        };
        Piatto pastaPomodoro = new Piatto("Pasta al pomodoro", TipoPortata.PRIMO, ingredientiPastaPomodoro);
        menuGiorno.aggiungiPiatto(pastaPomodoro);  // Deve essere rifiutato
        menuGiorno.visualizza();
        
        // Test Parte 3
        System.out.println("\n=== Test Parte 3 ===");
        Menu menuSera = menuGiorno.clona();
        menuSera.setNome("Menu della sera");
        menuGiorno.rimuoviPiatto("Risotto ai funghi");
        
        System.out.println("Menu originale:");
        menuGiorno.visualizza();
        System.out.println("\nMenu clonato:");
        menuSera.visualizza();
    }
}
