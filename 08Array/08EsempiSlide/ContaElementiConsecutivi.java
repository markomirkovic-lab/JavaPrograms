public class ContaElementiConsecutivi {
    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++)
        //                  [0;6]
            arr[i] = (int) (Math.random() * 7);// 1 2 5 2 0 2 2 2 5 0

        int cnt = 0;

        for (int i = 0; i < arr.length - 1; i++) {// arr.length - 1 = 10 - 1 = 9 -> da 0 a 9 = 10
            //System.out.println(arr[i + 1]);// index: 1 2 3 4 5 6 7 8 9 --- 2 5 2 0 2 2 2 5 0
            if (arr[i] == arr[i + 1])
                cnt++;
        }

        System.out.print("Contenuto array: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        
        System.out.println("\nNumero di elementi consecutivi: " + cnt);

        /*
        Contenuto array: 3 0 5 1 6 5 0 4 6 3 
        Numero di elementi consecutivi: 0
        PS C:\Users\marko.mirkovic\JavaPrograms\08Array\08EsempiSlide> java ContaElementiConsecutivi
        Contenuto array: 3 3 3 4 5 5 6 4 6 0 
        Numero di elementi consecutivi: 3

        // Contenuto array: 3 3 3 4 5 5 6 4 6 0 
        // cnt++            0 1 2     3
        */
    }
}
