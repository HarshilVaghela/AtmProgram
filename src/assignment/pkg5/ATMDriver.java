/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg5;

import java.util.Scanner;

/**
 *
 * @author Harshilkumar Vaghela(Student number: 3116318)
 * @date Assignment-5(Date: April 7,2021)
 */
public class ATMDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Handler fifties = new Fifties();
        Handler twenties = new Twenties();
        Handler tens = new Tens();
        Handler error = new Error();

        fifties.setSuccessor(twenties);
        twenties.setSuccessor(tens);
        tens.setSuccessor(error);

        ATM atm = new ATM(10, 10, 100);

        System.out.println("Enter the amount or enter 0 to end the process: ");
        Scanner kb = new Scanner(System.in);
        int value = kb.nextInt();

        while (value != 0) {
            atm.setAmountToDispense(value);
            fifties.dispense(atm);
            //for knowing what is the amount in atm
            System.out.println("Total money left in atm: " + atm.total());
            System.out.println("Enter the amount or enter 0 to end the process: ");
            value = kb.nextInt();
        }
    }

}
