/*
 a) Create an interface Department containing attributes deptName and deptHead. It also
has abstract methods for printing the attributes. Create a class hostel containing
hostelName, hostelLocation and numberOfRooms. The class contains method printing
the attributes. Then write Student class extending the Hostel class and implementing
the Department interface. This class contains attributes studentName, regNo,
electiveSubject and avgMarks. Write suitable printData method for this class. Also,
implement the abstract methods of the Department interface. Write a driver class to
test the Student class. The program should be menu driven containing the options:
    i. Admit new student
    ii. Migrate a student
    iii. Display details of a student
For the third option, a search is to be made on the basis of the entered registration
Number.
 */

import java.util.ArrayList;
import java.util.Scanner;

interface Department {
    String deptName = new String("Computer Science");
    String deptHead = new String("D. J. Deore");

    abstract void printInfo();
}

class Hostel {
    public String hostelName;
    public String hostelLocation;
    public int numberOfRooms;

    Hostel(String hostelName, String hostelLocation, int numberOfRooms) {
        this.hostelName = hostelName;
        this.hostelLocation = hostelLocation;
        this.numberOfRooms = numberOfRooms;
    }

    public void print() {
        System.out.println("Hostel Name = " + hostelName);
        System.out.println("Hostel Location = " + hostelLocation);
        System.out.println("Number of Rooms = " + numberOfRooms);
    }
}

class Student extends Hostel implements Department {
    String studentName;
    int regNo;
    String electiveSubject;
    double avgMarks;

    public Student(String hostelName, String hostelLocation, int numberOfRooms,
    String name, int no, String elective, double marks) {
        super(hostelName, hostelLocation, numberOfRooms);
        studentName = name;
        regNo = no;
        electiveSubject = elective;
        avgMarks = marks;
    }
    
    public void printData() {
        System.out.println("Student Name = " + studentName);
        System.out.println("Register Number = " + regNo);
        System.out.println("Electiv Subject = " + electiveSubject);
        System.out.println("Average Marks = " + avgMarks);
    }

    public void printInfo() {
        System.out.println("Department Name = " + deptName);
        System.out.println("Department Head = " + deptHead);
    }
}

public class Asg3Ca {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int ch;

        ArrayList<Student> students = new ArrayList<>();

        do {
            System.out.println();
            System.out.println("\n             Menu");
            System.out.println("1. Admit a student.");
            System.out.println("2. Migrate a student.");
            System.out.println("3. Display details of a students.");
            System.out.println("4. Exit.");
            System.out.println("-------------------------------------------------");

            System.out.println("Enter your choice :");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    sc.nextLine();
                    System.out.println("Enter hostel name :");
                    String hostelName = sc.nextLine();
                    System.out.println("Enter hostel location :");
                    String hostelLocation = sc.nextLine();
                    System.out.println("Enter number of rooms :");
                    int numberOfRooms = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter student name :");
                    String studentName = sc.nextLine();
                    System.out.println("Enter Register number :");
                    int regNo = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter elective subject :");
                    String electiveSubject = sc.nextLine();
                    System.out.println("Enter Average marks :");
                    double avgMarks = sc.nextDouble();
                    
                    Student student = new Student(hostelName, hostelLocation, numberOfRooms,
                    studentName, regNo, electiveSubject, avgMarks);
                    students.add(student);

                    System.out.println("Student admited successfully.");
                    break;
                case 2:
                    System.out.println("Enter register number of the student to migrate: ");
                    int regNoToMigrate = sc.nextInt();
                    sc.nextLine();

                    boolean Migrated = false;
                    for(Student s: students) {
                        if(s.regNo == regNoToMigrate) {
                            System.out.println("Enter new hostel name :");
                            hostelName = sc.nextLine();
                            System.out.println("Enter new hostel location :");
                            hostelLocation = sc.nextLine();
                            System.out.println("Enter new number of rooms :");
                            numberOfRooms = sc.nextInt();

                            Student stud = new Student(hostelName, hostelLocation, numberOfRooms, 
                            s.studentName, s.regNo, s.electiveSubject, s.avgMarks);
                            students.remove(s);
                            students.add(stud);
                            System.out.println("Student is migrated succefully.");
                            Migrated = true;
                            break;
                        }
                    }

                    if(!Migrated) {
                        System.out.println("Student not found.");
                    }
                    break;
                case 3:
                    System.out.println("Enter register number to display the student: ");
                    int regNoToDisplay = sc.nextInt();

                    boolean found = false;
                    for(Student s: students) {
                        if(s.regNo == regNoToDisplay) {
                            s.print();
                            s.printInfo();
                            s.printData();
                            found = true;
                            break;
                        }
                    }

                    if(!found) {
                        System.out.println("Student not found");
                    }
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while(ch != 4);
        sc.close();
    }
}
