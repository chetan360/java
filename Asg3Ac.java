/*
 c) Define an interface Operation which has methods area(),volume().Define a
constant PI having a value 3.142.Create a class cylinder which implements this
interface (members – radius, height) Create one object and calculate the area
and volume. 
 */

interface Operation {
    public abstract double area(double radius, double height);
    public abstract double volume(double radius, double height);
    static final double PI = 3.142;
}

class Cylinder implements Operation {
    double radius;
    double height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double area(double radius, double height) {
        return 2 * PI * radius * (radius + height);
    }

    public double volume(double radius, double height) {
        return PI * (radius * radius) * height;
    }
}

public class Asg3Ac {
    public static void main(String[] args) {
        Cylinder c = new  Cylinder(5.2, 13.5);

        System.out.println("Area of the Cylinder is = " + c.area(c.radius, c.height));
        System.out.println("Volume of the Cylinder is = " + c.volume(c.radius, c.height));
    }
}
