package edu.wctc.dice.impl;
import edu.wctc.dice.iface.DieRoller;
import java.util.Random;

public class EightSidedDice implements DieRoller{

    public EightSidedDice() {
        System.out.println("EightSidedDice constructor");
    }

    @Override
    public int getRollValue () {
        Random random = new Random();
        int value = random.nextInt(8) + 1;
        System.out.println(value);
        return value;
    }

}