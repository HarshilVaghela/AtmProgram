/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATMProgram;

/**
 *
 * @author Harshilkumar Vaghela(Student number: 3116318)
 * @date Assignment-5(Date: April 7,2021)
 */
public class ATM {

    private int fifties;
    private int twenties;
    private int tens;
    private int amountToDispense;//no

    public ATM(int f, int tw, int te) {
        fifties = f;
        twenties = tw;
        tens = te;
    }

    public ATM() {
        this(0, 0, 0);
    }

    public int getFifties() {
        return fifties;
    }

    public int getTwenties() {
        return twenties;
    }

    public int getTens() {
        return tens;
    }

    public void setFifties(int fifties) {
        this.fifties = fifties;
    }

    public void setTwenties(int twenties) {
        this.twenties = twenties;
    }

    public void setTens(int tens) {
        this.tens = tens;
    }

    public int total() {
        return fifties * 50 + twenties * 20 + tens * 10;
    }

    public int getAmountToDispense() {
        return amountToDispense;
    }

    public void setAmountToDispense(int amountToDispense) {
        this.amountToDispense = amountToDispense;
    }
}
