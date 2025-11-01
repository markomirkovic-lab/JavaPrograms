public class CountRowColumn {

    public static void main(String[] args) {
        
        int[][] a = {
            {1, 2},
            {1, 2, 3, 4},
            {1, 2, 3, 4, 5, 6}
        };

        for(int column = 0; column < a[0].length; column++) {

            //if(column >= 0) {
                System.out.println(column);
                //return column;
            //}
        }
    }
    
}
