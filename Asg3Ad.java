/*
 d) Write a program to find the cube of given number using function interface.
 */

import java.util.Scanner;

interface Cube {
    public abstract int cube(int n);
}

public class Asg3Ad implements Cube {
    public int cube(int n) {
        return n * n * n;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int n = sc.nextInt();
        sc.close();

        Asg3Ad obj = new Asg3Ad();
        System.out.println("Cube of " + n + " = " + obj.cube(n));
    }
}
