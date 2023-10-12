/*
 b) Write a program to using marker interface create a class product(product_id,
product_name, product_cost, product_quantity) define a default and parameterized
constructor. Create objects of class product and display the contents of each object
and Also display the object count.
 */

/*
Marker Interface :
    An interface that does not contain methods, fields, and constants is known as marker
interface. In other words, an empty interface is known as marker interface or tag interface. It
delivers the run-time type information about an object. It is the reason that the JVM and
compiler have additional information about an object.
    The Serializable and Cloneable interfaces are the example of marker interface. In short, it
indicates a signal or command to the JVM. The declaration of marker interface is the same as
interface in Java but the interface must be empty.
 */

import java.io.Serializable;

class Product implements Serializable {
    private int product_id;
    private String product_name;
    private float product_cost;
    private int product_quantity;

    Product() {
        this.product_id = 0;
        this.product_name = "";
        this.product_cost = 0.0f;
        this.product_quantity = 0;
    }

    Product(int id, String name, float cost, int qty) {
        product_id = id;
        product_name = name;
        product_cost = cost;
        product_quantity = qty;
    }

    public String toString() {
        return "Id = " + product_id + "\nName = " + product_name + 
        "\nCost = " + product_cost + "\nQuantity = " + product_quantity;
    }
}

public class Asg3Bb {
    public static void main(String[] args) {
        int objCount = 0;

        Product product1 = new Product(1, "Mouse", 550.30f, 50);
        if(product1 instanceof Serializable) {
            objCount++;
        }
        System.out.println(product1 + "\nObject count = " + objCount  + "\n");

        Product product2 = new Product(2, "Mobile", 50000f, 20);
        if(product2 instanceof Serializable) {
            objCount++;
        }
        System.out.println(product2 + "\nObject count = " + objCount  + "\n");

        Product product3 = new Product(3, "Ipad", 150000f, 5);
        if(product2 instanceof Serializable) {
            objCount++;
        }
        System.out.println(product3 + "\nObject count = " + objCount  + "\n");
        
    } 
}
