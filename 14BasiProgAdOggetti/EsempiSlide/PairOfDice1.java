public class PairOfDice1 {
    int die1;
    int die2;

    PairOfDice1(int val1, int val2) {
        die1 = val1 >= 1 && val1 <= 6 ? val1 : 1;
        die2 = val2 >= 1 && val2 <= 6 ? val2 : 1;
        //roll();
    }

    void roll() {
        die1 = (int) (Math.random() * 6) + 1;
        die2 = (int) (Math.random() * 6) + 1;
    }

    //requires static ?!
    static void show(PairOfDice1 pairOfDice1) {
        System.out.println("show(PairOfDice1 pairOfDice1): ");
        System.out.println("dice1: " + pairOfDice1.die1 + " dice2: " + pairOfDice1.die2);
    }

    void show(int die1, int die2) {
        System.out.println("show(): ");
        System.out.println("dice1: " + die1 + " dice2: " + die2);
    }

    void show2() {
        System.out.println("show2(): ");
        System.out.println("dice1: " + this.die1 + " dice2: " + this.die2);
    }

    void show3() {
        System.out.println("show3(): ");
        System.out.println("dice1: " + die1 + " dice2: " + die2);
    }


    public static void main(String[] args) {
        PairOfDice1 dice1 = new PairOfDice1(1, 3);
        // PairOfDice1 dice2 = new PairOfDice1(); // NON SI PUO FARE!

        PairOfDice1 dice2 = new PairOfDice1(0, 6);

        System.out.println(dice1);//PairOfDice1@4517d9a3
        show(dice1);//dice1: 1 dice2: 3
        show(dice2);//dice1: 1 dice2: 6
        System.out.println("///");
        dice1.show(0, 0);//dice1: 0 dice2: 0
        System.out.println("///");
        dice1.show2();//dice1: 1 dice2: 3
        dice2.show2();//dice1: 1 dice2: 6
        System.out.println("///");
        dice1.show3();//dice1: 1 dice2: 3
        dice2.show3();//dice1: 1 dice2: 6


        //show(dice1.die1, dice1.die1);

        /*
        PairOfDice1@4517d9a3
        show(PairOfDice1 pairOfDice1): 
        dice1: 1 dice2: 3
        show(PairOfDice1 pairOfDice1):
        dice1: 1 dice2: 6
        ///
        show():
        dice1: 0 dice2: 0
        ///
        show2():
        dice1: 1 dice2: 3
        show2():
        dice1: 1 dice2: 6
        ///
        show3():
        dice1: 1 dice2: 3
        show3():
        dice1: 1 dice2: 6
        */




    }
}
