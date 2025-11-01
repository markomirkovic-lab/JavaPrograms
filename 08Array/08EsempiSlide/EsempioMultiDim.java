public class EsempioMultiDim {
    public static void main(String[] args) {
        String[][] nomi = { { "Mr. ", "Mrs. ", "Ms. " }, { "Smith", "Jones", "Brown" } };
        System.out.println(nomi[0][0] + nomi[1][0]); // Mr. Smith
        System.out.println(nomi[0][2] + nomi[1][1]); // Ms. Jones
    }
}
