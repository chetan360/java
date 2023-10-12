/*
 c) Write a menu driven program to perform the following operations
    i. Calculate the volume of cylinder. (hint : Volume: π × r² × h)
    ii. Find the factorial of given number.
    iii. Check the number is Armstrong or not.
    iv. Exit
 */

import java.util.Scanner;

public class Asg1Ac {
    public static double voiumeOfCylinder(double r, double h) {
        return 3.14 * (r * r) * h;
    }

    public static int factorial(int n) {
        int f = 1;
        while(n > 1) {
            f *= n--;
        }

        return f;
    }

    public static boolean isArmstrong(int n) {
        int t = n;
        int sum = 0;
        while(t != 0) {
            int r = t%10;
            sum += (r * r * r);
            t /= 10;
        }

        if(sum == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("\n               Menu");
            System.out.println("1. Calculate valume of cylinder.");
            System.out.println("2. Find the factorial of given number.");
            System.out.println("3. Check the Number is armstrong or not.");
            System.out.println("4. Exit");

            System.out.println("----------------------------------------------");
            System.out.println("Enter your choice.");
            int ch = sc.nextInt();

            switch(ch)  {
                case 1:
                    System.out.println("Enter radius of the cylinder :");
                    double r = sc.nextDouble();

                    System.out.println("Enter hight of the cylinder :");
                    double h = sc.nextDouble();

                    System.out.println("Volume of the Cylinder is " + voiumeOfCylinder(r, h));
                    break;
                case 2:
                    System.out.println("Enter the number :");
                    int n = sc.nextInt();

                    System.out.println("Factorial is " + factorial(n));
                    break;
                case 3:
                    System.out.println("Enter the number :");
                    n = sc.nextInt();

                    if(isArmstrong(n)) {
                        System.out.println("The number is Armstrong.");
                    } else {
                        System.out.println("The number is not Armstrong.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Envalid choice.");
            }
        }
    }
}
