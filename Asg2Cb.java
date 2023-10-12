/*
b) Create four member variables for Customer class. Assign public, private, protected
and default access modifiers respectively to these variables. Try to access these
variables from other classes (Same package and Different package)
*/

import samepackage.Customer;
import differentpackage.CustomerChild;

public class Asg2Cb {
    public static void main(String[] args) {
        Customer c = new Customer(1, "Chetan", "xyz", "+(91)0000000000");
        CustomerChild c2 = new CustomerChild();
        System.out.println("Customer id " + c.cNo + " accessible every where.");
    }
}