package samepackage;

public class Customer {
    public int cNo;
    private String cName;
    protected String cAddress;
    String number; // friendly access

    public Customer() {
        this.cNo = 0;
        this.cName = "";
        this.cAddress = "";
        this.number = "";
    }

    //all members are accessed in this class
    public Customer(int cNo, String cName, String cAddress,
    String number) {
        this.cNo = cNo;
        this.cName = cName;
        this.cAddress = cAddress;
        this.number = number;
        
        System.out.println("Customer name " + cName + " Only accessible in Customer class.");
        System.out.println("Customer number " + number + " Only accessible in Same package.");
    }
}

