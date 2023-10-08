abstract class Order {
    public int id;
    public String description;

    Order(int id, String description) {
        this.id = id;
        this.description = description;
    }
}

class PurchaseOrder extends Order {
    public String customerName;

    PurchaseOrder(int id, String description, String customerName) {
        super(id, description);
        this.customerName = customerName;
    }

    public void display() {
        System.out.println("Order id = " + id);
        System.out.println("Order description = " + description);
        System.out.println("Customer name = " + customerName);
    }
}

class SalesOrder extends Order {
    public String vendorName;

    SalesOrder(int id, String description, String venderName) {
        super(id, description);
        this.vendorName = venderName;
    }

    public void display() {
        System.out.println("Order id = " + id);
        System.out.println("Order description = " + description);
        System.out.println("Customer name = " + vendorName);
    }
}

public class Asg3Ba {
    public static void main(String args[]) {
        SalesOrder s1 = new SalesOrder(44, "Product is in good condition.", "Ramesh");
        s1.display();
        System.out.println();
        
        PurchaseOrder p1 = new PurchaseOrder(51, "Product is in good condition.", "Suresh");
        p1.display();
        System.out.println();
        System.out.println("-------------------------------------------------------");

        SalesOrder s2 = new SalesOrder(44, "Product is in good condition.", "Ram");
        s2.display();
        System.out.println();
        
        PurchaseOrder p2 = new PurchaseOrder(51, "Product is in good condition.", "Sham");
        p2.display();
        System.out.println();
        System.out.println("-------------------------------------------------------");

        SalesOrder s3 = new SalesOrder(44, "Product is in good condition.", "Jay");
        s3.display();
        System.out.println();
        
        PurchaseOrder p3 = new PurchaseOrder(51, "Product is in good condition.", "Viru");
        p3.display();
        System.out.println();
        System.out.println("-------------------------------------------------------");
    }
}
