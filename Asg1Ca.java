/*
a) Write a program to accept n names of country and display them in descending
order.
*/

import java.util.Scanner;
import java.util.Arrays;

public class Asg1Ca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many countries : ");
        int n = sc.nextInt();
        String[] contryNames = new String[n];

        sc.nextLine();
        System.out.println("Enter " + n + " country names :");
        for(int i=0; i<n; i++) {
            contryNames[i] = sc.nextLine();
        }

        Arrays.sort(contryNames);

        System.out.println("Country names in sorted order : ");
        for(int i=0; i<n; i++) {
            System.out.println(contryNames[i]);
        }
    }
}
