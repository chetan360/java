/*
d) Write a java program that take input as a person name in the format of first, middle
and last name and then print it in the form last, first and middle name, where in the
middle name first character is capital letter.
 */

import java.util.Scanner;

public class Asg2Ad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter name (frist middle last):");
        String fullName = sc.nextLine();

        String[] name = fullName.split(" ");

        String frist = name[0];
        String middle = name[1].substring(0, 1).toUpperCase() + name[1].substring(1);
        String last = name[2];

        System.out.println(last + " " + frist + " " + middle);
        sc.close();
    }    
}