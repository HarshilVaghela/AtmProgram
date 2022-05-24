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
public class Error extends Handler {

    @Override
    public boolean dispense(ATM money) {

        if (money.getAmountToDispense() > money.total()) {
            System.out.println("Error: The amount entered is too big for this ATM. Please try entering a smaller amount.\n---No bills were dispensed---");
            return false;
        } else if (money.getAmountToDispense() > 0 && money.getAmountToDispense() % 10 != 0) {
            System.out.println("Error: There are no $5, $2s or $1 bills in the ATM.\n---No bills were dispensed---");

            return false;
        } else {
            System.out.println("--------Bills dispensed----------");

            return true;
        }

    }

}
