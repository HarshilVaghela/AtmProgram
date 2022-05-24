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
public class Fifties extends Handler {

    @Override
    public boolean dispense(ATM money) {

        int count = 0;
        int countedMoney = 0;
        while (money.getAmountToDispense() - countedMoney >= 50 && money.getFifties() > 0) {
            money.setFifties(money.getFifties() - 1);
            count++;
            countedMoney += 50;
        }

        System.out.println("Number of $50 bills planned to be dispensed:" + count);
        money.setAmountToDispense(money.getAmountToDispense() - 50 * count);

        if (!successor.dispense(money)) {
            money.setFifties(money.getFifties() + count);
            return false;
        } else {
            return true;
        }
    }
}
