/*
b) Define Student class(roll_no, name, percentage) to create n objects of the
Lab Assignments Student class. Accept details from the user for each object. Define a static
method sortStudent which sorts the array on the basis of percentage.
 */

import java.util.Scanner;

class Student {
    int roll_no;
    String name;
    float percentage;

    Student() {
        this.roll_no = 0;
        this.name = "";
        this.percentage = 0.0f;
    }

    Student(int roll_no, String name, float percentage) {
        this.roll_no = roll_no;
        this.name = name;
        this.percentage = percentage;
    }

    public String toString() {
        return roll_no + " " + name + " " + percentage;
    }

    public static void sortStudent(Student s[], int n) {
        for(int i=1; i<n; i++) {
            for(int j=0; j<n-i; j++) {
                if(s[j].percentage > s[j+1].percentage) {
                    Student t = s[j];
                    s[j] = s[j+1];
                    s[j+1] = t;
                }
            }
        }
    }
}

public class Asg2Ab {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("How many Students :");
        n = sc.nextInt();

        int roll_no;
        String name;
        float percentage;

        Student[] s = new Student[n];
        for(int i=0; i<n; i++) {
            System.out.println("Enter (roll_no, name, persentage) of Student " + (i+1) +" :");
            roll_no = sc.nextInt();
            name = sc.next();
            percentage = sc.nextFloat();

            s[i] = new Student(roll_no, name, percentage);
        }

        Student.sortStudent(s, n);

        System.out.println("Sorted students by percentage :");
        for(int i=0; i<n; i++) {
            System.out.println(s[i]);
        }
    }
}
