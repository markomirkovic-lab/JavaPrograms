public class MatriceEsempioBis {
    public static void main(String[] args) {
        
        int righe = 4, colonne = 10;
        double[][] laMiaMatrice = new double[righe][colonne];
        for (int i = 0; i < righe; i++)
            for (int j = 0; j < colonne; j++)
                laMiaMatrice[i][j] = (int) (Math.random() * 100);

        for (int i = 0; i < laMiaMatrice.length; i++) {// < righe
            for (int j = 0; j < laMiaMatrice[i].length; j++) {// < colonne
                System.out.print((laMiaMatrice[i][j]) + " ");
                //System.out.print(Arrays.toString(laMiaMatrice[i]) + " ");
                //System.out.print(Arrays.toString(laMiaMatrice));
            }
        System.out.println("");
        }

    }
}
