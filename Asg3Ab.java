/*
b) Define an abstract class Staff with protected members id and name. Define a
parameterized constructor. Define one subclass OfficeStaff with member
department. Create n objects of OfficeStaff and display all details.
*/

import java.util.Scanner;

abstract class Staff {
    protected int id;
    protected String name;

    Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class OfficeStaff extends Staff {
    OfficeStaff(int id, String name) {
        super(id, name);
    }

    public void display() {
        System.out.println("id = " + id);
        System.out.println("Name = " + name);
    }
}

public class Asg3Ab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many Staff : ");
        int n = sc.nextInt();

        OfficeStaff[] obj = new OfficeStaff[n];

        int id;
        String name;
        for(int i=0; i<n; i++) {
            System.out.println("Enter id :");
            id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter name :");
            name = sc.nextLine();
            obj[i] = new OfficeStaff(id, name);
        }

        System.out.println("-------------------------------");
        System.out.println("Office staff :");
        for(int i=0; i<n; i++) {
            obj[i].display();
        }
        sc.close();
    }
}
