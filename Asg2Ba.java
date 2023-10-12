/*
a) Write a Java program to create a Package SY which has a class SYMarks
(members – ComputerTotal, MathsTotal, and ElectronicsTotal). Create another
package TY which has a class TYMarks (members – Theory, Practicals). Create n
objects of Student class (having rollNumber, name, SYMarks and TYMarks). Add
the marks of SY and TY computer subjects and calculate the Grade (‘A’ for >= 70,
‘B’ for >= 60 ‘C’ for >= 50 , Pass Class for > =40 else ‘FAIL’) and display the result
of the student in proper format.
 */

import java.util.Scanner;

import SY.SYMarks;
import TY.TYMarks;

public class Asg2Ba {
    int rno;
    String name;
    SYMarks syMarks;
    TYMarks tyMarks; 

    Asg2Ba(int rno, String name, SYMarks syMarks, TYMarks tyMarks) {
        this.rno = rno;
        this.name = name;
        this.syMarks = syMarks;
        this.tyMarks = tyMarks;
    }

    public int calculateTotalMarks() {
        int syTotal = (syMarks.ComputerTotal + syMarks.ElectronicsTotal + syMarks.MathsTotal)/3;
        int tyTotal = (tyMarks.Practicals + tyMarks.Theory)/2;
        return (syTotal + tyTotal)/2;
    }

    public char Asg2Ba() {
        int total = calculateTotalMarks();
        
        if(total >= 70) {
            return 'A';
        } else if(total >= 60) {
            return 'B';
        } else if(total >= 50) {
            return 'C';
        } else if(total >= 40) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public void result() {
        System.out.println("****************************");
        System.out.println("Roll No. = " + rno);
        System.out.println("Name = " + name);
        System.out.println("Percentage = " + calculateTotalMarks() + "%");
        System.out.println("Grade = " + Asg2Ba());
        System.out.println("****************************");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("How many students :");
        n = sc.nextInt();

        Asg2Ba[] stud = new Asg2Ba[n];
        
        int rno, cs, math, elt, theory, pract;
        String name;
        for(int i=0; i<n; i++) {
            System.out.println("Enter roll no. :");
            rno = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter name :");
            name = sc.next();
            System.out.println("Enter SY (cs, math, elt) marks :");
            cs = sc.nextInt();
            math = sc.nextInt();
            elt = sc.nextInt();
            System.out.println("Enter TY (Theory, Practical) marks :");
            theory = sc.nextInt();
            pract = sc.nextInt();

            stud[i] = new Asg2Ba(rno, name, new SYMarks(cs, math, elt), new TYMarks(theory, pract));
            stud[i].result();
        }
    }    
}
