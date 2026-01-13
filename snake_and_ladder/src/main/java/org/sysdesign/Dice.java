package org.sysdesign;

public class Dice {

    // This class will take care of dice rolling
    // The thing is that there could be multiple of dice. This class should be able to handle that.

    private int numberOfDice;
    public Dice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    // There should be a method which returns the status of each dice
    // It should return a list of dice values
    // We should use the random for it
    public int[] roll() {
        int[] diceValues = new int[numberOfDice];
        for (int i = 0; i < numberOfDice; i++) {
            diceValues[i] = (int)(Math.random() * 6) + 1; // Random value between 1 and 6
        }
        return diceValues;
    }

}
