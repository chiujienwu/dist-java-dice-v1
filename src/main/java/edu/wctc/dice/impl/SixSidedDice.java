package edu.wctc.dice.impl;
import edu.wctc.dice.iface.DieRoller;
import java.util.Random;

public class SixSidedDice implements DieRoller{

    public SixSidedDice() {
        System.out.println("SixSidedDice constructor");
    }

    @Override
    public int getRollValue () {
        Random random = new Random();
        int value = random.nextInt(6) + 1;
        System.out.println(value);
        return value;
    }

}
