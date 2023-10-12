/*
 a) Write a menu driven program to perform the following operations on a set of integers
as shown in the following figure. A load operation should generate 10 random
integers (2 digit) and display the number on screen. The save operation should save
the number to a file number.txt. The short menu provides various operations and the
result is displayed on the screen.
*/


class InvalidNameException extends Exception {
    InvalidNameException(String message) {
        super(message);
    }
}

class Employee2 {
    String name;

    Employee2(String name) {
        this.name = name;
    }

    public boolean isValid(String name) {
        //regular Expression for store a to z and A to Z
        String regularExp = "^[a-zA-Z]+$";
        return name.matches(regularExp);
    }
}

public class Asg4Cb {
    public static void main(String[] args) {
        Employee2 emp = new Employee2("Chetan123");
            try {
            if(emp.isValid(emp.name)) {
                System.out.println(emp.name);
            } else {
                throw new InvalidNameException("Name is Invalid.");
            }
        } catch(InvalidNameException e) {
            System.out.println(e.getMessage());
        }
    }
}
