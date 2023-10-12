/*
a) Using javap, view the methods of the following classes from the lang package:
java.lang.Object , java.lang.String and java.util.Scanner. and also Compile sample
program 8. Type the following command and view the bytecodes. javap -c MyClass.

javap java.lang.Object

javap java.lang.String

javap java.util.Scanner

sample program 8
public class MyClass {
    int num;
    public MyClass() {
        num=0;
    }

    public MyClass(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        MyClass m1 = new MyClass();
        if(args.length > 0) {
            int n = Integer.parseInt(args[0]);
            MyClass m2 = new MyClass(n);
            System.out.println(m1.num);
            System.out.println(m2.num);
        } else {
            System.out.println(“Insufficient arguments”);
        }
    }
}

javac Myclass.java

javap -c Myclass

*/