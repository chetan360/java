/* 
b)Define a class MyNumber having one private int data member. Write a default
constructor to initialize it to 0 and another constructor to initialize it to a value
(Use this). Write methods isNegative, isPositive, isZero, isOdd, isEven. Create an
object in main. Use command line arguments to pass a value to the object
(Hint : convert string argument to integer) and perform the above tests. Provide
javadoc comments for all constructors and methods and generate the html help file
*/

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
