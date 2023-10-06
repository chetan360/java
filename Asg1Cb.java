import java.util.Scanner;

class MatOperation2 {
    int[][] Mat;
    Scanner sc = new Scanner(System.in);
    int m, n;

    MatOperation2(int m, int n) {
        this.m = m;
        this.n = n;
        Mat = new int[m][n];
    }

    public void inputMat() {
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                Mat[i][j] = sc.nextInt();
            }
        }
    }

    public static int sumOfDigonal(MatOperation2 A) {
        int sum = 0;
        for(int i=0; i<A.m; i++) {
            for(int j=0; j<A.n; j++) {
                if(i == j) {
                    sum += A.Mat[i][j];
                }
            }
        }
        return sum;
    }

    public static int sumOfUpperDigonal(MatOperation2 A) {
        int sum = 0;
        for(int i=0; i<A.m; i++) {
            for(int j=0; j<A.n; j++) {
                if(i < j) {
                    sum += A.Mat[i][j];
                }
            }
        }
        return sum;
    }

    public static int sumOfLowerDigonal(MatOperation2 A) {
        int sum = 0;
        for(int i=0; i<A.m; i++) {
            for(int j=0; j<A.n; j++) {
                if(i > j) {
                    sum += A.Mat[i][j];
                }
            }
        }
        return sum;
    }

}

public class Asg1Cb {
    public static void main(String args[]) {
        MatOperation2 A, B, D, E;
        Scanner sc = new Scanner(System.in);
        int m1, n1, m2, n2;

        while(true) {
            System.out.println("\n           Matrix Operations");
            System.out.println("1. Sum of digonal elements.");
            System.out.println("2. Sum of upper digonal elements.");
            System.out.println("3. Sum of lower digonal elements.");
            System.out.println("4. Exit");

            System.out.println("----------------------------------------------");
            System.out.println("Enter your choice.");
            int ch = sc.nextInt();

            switch(ch)  {
                case 1:
                    System.out.println("Enter order of A :");
                    m1 = sc.nextInt();
                    n1 = sc.nextInt();
                    A = new MatOperation2(m1, n1);
                    System.out.println("Enter values of Matrix A :");
                    A.inputMat();
                    System.out.println("Sum of digonal elements = " + MatOperation2.sumOfDigonal(A));
                    break;
                case 2:
                    System.out.println("Enter order of A :");
                    m1 = sc.nextInt();
                    n1 = sc.nextInt();
                    A = new MatOperation2(m1, n1);
                    System.out.println("Enter values of Matrix A :");
                    A.inputMat();
                    System.out.println("Sum of upper digonal elements = " + MatOperation2.sumOfUpperDigonal(A));
                    break;
                case 3:
                    System.out.println("Enter order of A :");
                    m1 = sc.nextInt();
                    n1 = sc.nextInt();
                    A = new MatOperation2(m1, n1);
                    System.out.println("Enter values of Matrix A :");
                    A.inputMat();
                    System.out.println("Sum of lower digonal elements = " + MatOperation2.sumOfLowerDigonal(A));
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
