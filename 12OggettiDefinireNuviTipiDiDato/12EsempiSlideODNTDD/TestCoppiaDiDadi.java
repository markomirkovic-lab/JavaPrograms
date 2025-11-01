class CoppiaDiDadi {
    int dado1;
    int dado2;

    CoppiaDiDadi() {
        dado1 = (int) (Math.random() * 6) + 1;
        dado2 = (int) (Math.random() * 6) + 1;
    }

    CoppiaDiDadi(int val1, int val2) {
        dado1 = val1 >= 1 && val1 <= 6 ? val1 : 1;
        dado2 = val2 >= 1 && val2 <= 6 ? val2 : 1;
    }
}

public class TestCoppiaDiDadi {

    private static void show(CoppiaDiDadi dadi) {

        System.out.println("Dado 1: " + dadi.dado1);
        System.out.println("Dado 2: " + dadi.dado2);

    }

    public static void main(String[] args) {
        CoppiaDiDadi dadi = new CoppiaDiDadi(1, 1);
        CoppiaDiDadi dadi2 = new CoppiaDiDadi();

        show(dadi);
        show(dadi2);

        // ...

        /*
        PS C:\Users\marko.mirkovic\JavaPrograms\12OggettiDefinireNuviTipiDiDato\12EsempiSlideODNTDD> java TestCoppiaDiDadi      
        Dado 1: 1
        Dado 2: 1
        Dado 1: 2
        Dado 2: 3
        */
    }
}
