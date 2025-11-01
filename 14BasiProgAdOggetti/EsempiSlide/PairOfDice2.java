public class PairOfDice2 {
    int die1;
    int die2;

    PairOfDice2() {
        roll();
    }

    PairOfDice2(int val1, int val2) {
        die1 = val1 >= 1 && val1 <= 6 ? val1 : 1;
        die2 = val2 >= 1 && val2 <= 6 ? val2 : 1;
    }

    void roll() {
        die1 = (int) (Math.random() * 6) + 1;
        die2 = (int) (Math.random() * 6) + 1;
    }

    //requires static ?!
    // One rule-of-thumb: ask yourself "Does it make sense to call this method, 
    // even if no object has been constructed yet?" If so, it should definitely 
    // be static. ???
    static void show(PairOfDice2 pairOfDice2) {
        System.out.println("dice1: " + pairOfDice2.die1 + " dice2: " + pairOfDice2.die2);
    }

    public static void main(String[] args) {
        PairOfDice2 dice1 = new PairOfDice2(1, 1);
        PairOfDice2 dice2 = new PairOfDice2();

        show(dice1);
        System.out.println("die1: " + dice1.die1);
        System.out.println("die2: " + dice1.die2);
        System.out.println();
        show(dice2);
        System.out.println("die1: " + dice2.die1);
        System.out.println("die2: " + dice2.die2);

        /*
        dice1: 1 dice2: 1
        die1: 1
        die2: 1

        dice1: 5 dice2: 5
        die1: 5
        die2: 5
        */

    }
}
