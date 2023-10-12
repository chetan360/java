/*
a) Create an employee class(id,name,deptname,salary). Define a default and
parameterized constructor. Use ‘this’ keyword to initialize instance variables.
Keep a count of objects created. Create objects using parameterized constructor
and display the object count after each object is created.(Use static member and
method). Also display the contents of each object.
 */

class Employee {
    int id, salary;
    String name, deptname;
    private static int ecount = 0;
    Employee() {
        this.id = 0;
        this.name = "";
        this.deptname = "";
        this.salary = 0;
        ecount++;
    }
    Employee(int id, String name, String deptname, int salary) {
        this.id = id;
        this.name = name;
        this.deptname = deptname;
        this.salary = salary;
        ecount++;
    }

    public static int objCount() {
        return ecount;
    }

    public void display() {
        System.out.println("ID = " + id);
        System.out.println("Name = " + name);
        System.out.println("Department name = " + deptname);
        System.out.println("Salary = " + salary);
    }
}

public class Asg2Aa {
    public static void main(String args[]) {
        Employee emp1 = new Employee(1, "Sumit", "HR", 3500000);
        System.out.println(Employee.objCount() + " object created.");
        emp1.display();
        System.out.println("------------------------------------");

        Employee emp2 = new Employee(2, "Chetan", "Finance", 6000000);
        System.out.println(Employee.objCount() + " object created.");
        emp2.display();
        System.out.println("------------------------------------");

        Employee emp3 = new Employee(3, "Shubham", "Sales", 4500000);
        System.out.println(Employee.objCount() + " object created.");
        emp3.display();
        System.out.println("------------------------------------");
    }
}
