/*
c) Write a java program to accept 5 numbers using command line arguments sort and
display them. 
*/

import java.util.Arrays;

public class Asg2Ac {
    public static void main(String[] args) {
        int[] arr = new int[5];

        if(args.length != 5) {
            System.out.println("Please provide 5 int args to cammand line.");
            return;
        }

        for(int i=0; i<5; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }

        Arrays.sort(arr);

        for(int i:arr) {
            System.out.print(i + " ");
        }
    }
}
