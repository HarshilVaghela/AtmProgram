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
public class Tens extends Handler {

    @Override
    public boolean dispense(ATM money) {

        int count = 0;
        int countedMoney = 0;
        while (money.getAmountToDispense() - countedMoney >= 10 && money.getTens() > 0) {
            money.setTens(money.getTens() - 1);
            count++;
            countedMoney += 10;
        }

        System.out.println("Number of $10 bills planned to be dispened:" + count);

        money.setAmountToDispense(money.getAmountToDispense() - 10 * count);

        if (!successor.dispense(money)) {
            money.setTens(money.getTens() + count);
            return false;
        } else {
            return true;
        }
    }

}
