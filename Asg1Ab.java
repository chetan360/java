/*
 b) Write a program to calculate perimeter and area of rectangle.
(hint : area = length * breadth , perimeter=2*(length+breadth))
*/

import java.util.Scanner;

public class Asg1Ab {

    public static double area(double l, double b) {
        return l * b;
    }

    public static double perimeter(double l, double b) {
        return 2*(l * b);
    }
    public static void main(String[] args) {
        double l, b;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter length of rectangle : ");
        l = sc.nextDouble();
        
        System.out.println("Enter breath of rectangle : ");
        b = sc.nextDouble();

        System.out.println("Area is : " + area(l, b));
        System.out.println("Perimeter is : " + perimeter(l, b));
    }
}
