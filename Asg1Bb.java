class MyNumber {
    //private int data member
    private int n;

    //default constructor
    MyNumber() {
        this.n = 0;
    }

    //parameterised constructor
    MyNumber(int n) {
        this.n = n;
    }

    // to check number is -ve or not
    public boolean isNegative() {
        return n < 0;
    }

    // to check number is +ve or not
    public boolean isPositive() {
        return n > 0;
    }

    // to check number is zero or not
    public boolean isZero() {
        return n == 0;
    }

    // to check number is odd or not
    public boolean isOdd() {
        return n%2 != 0;
    }

    // to check number is even or not
    public boolean isEven() {
        return n%2 == 0;
    }
}

public class Asg1Bb {
    public static void main(String args[]) {
        //creating object of MyNumber class using constructor
        MyNumber n = new MyNumber(10);

        if(n.isNegative()) {
            System.out.println("Number is -ve");
        }
        
        if(n.isPositive()) {
            System.out.println("Number is +ve");
        }
        
        if(n.isZero()) {
            System.out.println("Number is Zero");
        }
        
        if(n.isOdd()) {
            System.out.println("Number is Odd");
        }
        
        if(n.isEven()) {
            System.out.println("Number is Even");
        }
    }
}

//for generate the html help file
//javadoc Asg1Bb.java