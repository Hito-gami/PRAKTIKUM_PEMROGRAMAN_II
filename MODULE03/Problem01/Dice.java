package MODULE03.Problem01;

import java.util.Random;

public class Dice {
    private int number;

    public Dice() {
        number = rollNumber();
    }

    private int rollNumber() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    public int getNumber(){
        return number;
    }
}