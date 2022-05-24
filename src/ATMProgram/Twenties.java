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
public class Twenties extends Handler {

    @Override
    public boolean dispense(ATM money) {

        int count = 0;
        int countedMoney = 0;
        while (money.getAmountToDispense() - countedMoney >= 20 && money.getTwenties() > 0) {
            money.setTwenties(money.getTwenties() - 1);
            count++;
            countedMoney += 20;
        }

        System.out.println("Number of $20 bills planned to be dispensed:" + count);
        money.setAmountToDispense(money.getAmountToDispense() - 20 * count);

        if (!successor.dispense(money)) {
            money.setTwenties(money.getTwenties() + count);
            return false;
        } else {
            return true;
        }
    }

}
