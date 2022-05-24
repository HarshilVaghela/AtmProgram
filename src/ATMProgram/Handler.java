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
public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract boolean dispense(ATM money);
}
