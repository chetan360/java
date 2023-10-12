/*
c) Write a menu driven program to perform the following operations on
multidimensional array ie matrix :
    i. Addition
    ii. Multiplication
    iii. Transpose of any matrix.
    iv. Exit 
*/

import java.util.Scanner;

class MatOperation {
    int[][] Mat;
    Scanner sc = new Scanner(System.in);
    int m, n;

    MatOperation(int m, int n) {
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

    public static void addition(MatOperation A, MatOperation B) {
        if(A.m == B.m && A.n == B.n) {
            MatOperation C = new MatOperation(A.m, A.n);
            System.out.println("Resultent Matrix is :");
            for(int i=0; i<C.m; i++) {
                for(int j=0; j<C.n; j++) {
                    C.Mat[i][j] = A.Mat[i][j] + B.Mat[i][j];
                    System.out.print(C.Mat[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Rule of addition of matrices faild.");
            return;
        }
    }

    public static void multiplication(MatOperation A, MatOperation B) {
        if(A.m == B.n) {
            MatOperation C = new MatOperation(A.m, B.n);
            for(int i=0; i<A.m; i++) {
                for(int j=0; j<B.n; j++) {
                    for(int k=0; k<A.n; k++) {
                        C.Mat[i][j] += A.Mat[i][k] * B.Mat[k][j];
                    }
                }
            }

            System.out.println("Resultent Matrix is :");
            for(int i=0; i<C.m; i++) {
                for(int j=0; j<C.n; j++) {
                    System.out.print(C.Mat[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Rule of multiplication of matrices faild.");
            return;
        }
    }

    public static void transpose(MatOperation A) {
        System.out.println("Resultent Matrix is :");
        for(int i=0; i<A.n; i++) {
            for(int j=0; j<A.m; j++) {
                System.out.print(A.Mat[j][i] + " ");
            }
            System.out.println();
        }
    }
}

public class Asg1Bc {
    public static void main(String args[]) {
        MatOperation A, B, D, E;
        Scanner sc = new Scanner(System.in);
        int m1, n1, m2, n2;

        while(true) {
            System.out.println("\n           Matrix Operations");
            System.out.println("1. Addition.");
            System.out.println("2. Multiplication.");
            System.out.println("3. Transpose.");
            System.out.println("4. Exit");

            System.out.println("----------------------------------------------");
            System.out.println("Enter your choice.");
            int ch = sc.nextInt();

            switch(ch)  {
                case 1:
                    System.out.println("Enter order of A :");
                    m1 = sc.nextInt();
                    n1 = sc.nextInt();
                    A = new MatOperation(m1, n1);
                    System.out.println("Enter values of Matrix A :");
                    A.inputMat();

                    System.out.println("Enter order of B :");
                    m2 = sc.nextInt();
                    n2 = sc.nextInt();
                    B = new MatOperation(m2, n2);
                    System.out.println("Enter values of Matrix B :");
                    B.inputMat();
                    MatOperation.addition(A, B);
                    break;
                case 2:
                    System.out.println("Enter order of A :");
                    m1 = sc.nextInt();
                    n1 = sc.nextInt();
                    A = new MatOperation(m1, n1);
                    System.out.println("Enter values of Matrix A :");
                    A.inputMat();

                    System.out.println("Enter order of B :");
                    m2 = sc.nextInt();
                    n2 = sc.nextInt();
                    B = new MatOperation(m2, n2);
                    System.out.println("Enter values of Matrix B :");
                    B.inputMat();
                    MatOperation.multiplication(A, B);
                    break;
                case 3:
                    System.out.println("Enter order of A :");
                    m1 = sc.nextInt();
                    n1 = sc.nextInt();
                    A = new MatOperation(m1, n1);
                    System.out.println("Enter values of Matrix A :");
                    A.inputMat();
                    MatOperation.transpose(A);
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
