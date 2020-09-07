package edu.wctc.dice.impl;

import edu.wctc.dice.iface.GameOutput;

public class ConsoleOutput implements GameOutput {
    @Override
    public void output(String text) {
        System.out.println(text);
    }
}
