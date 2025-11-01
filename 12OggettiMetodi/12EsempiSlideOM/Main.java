class Add {
    int s = 0;
    public int addTwoInt(int a, int b) {
        s = a + b;
        return s;
    }
}

class Main {
    public static void main(String[] args) {
        Add a = new Add();
        int res = a.addTwoInt(1, 2);
        System.out.println("Sum: " + res);  

        //Sum: 3
    }
}
