package differentpackage;

import samepackage.Customer;

public class CustomerChild extends Customer {
    public CustomerChild() {
        System.out.println("Customer Address " + cAddress + " Only accessible in Customer class And CustomerChild class." );
    }
}