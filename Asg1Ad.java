import java.util.Scanner;

public class Asg1Ad {
    public static void main(String[] args) {
        int[] arr = new int[10];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 values :");
        for(int i=0; i<10; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array in reverse order :");
        for(int i=9; i>=0; i--) {
            System.out.println(arr[i]);
        }
    }
}
