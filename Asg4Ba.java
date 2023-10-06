import java.io.RandomAccessFile;
import java.io.IOException;
import java.util.Scanner;

class Book {
    int bookId;
    String bookName;
    double bookPrice;
    int bookQty;

    Book() {
        this.bookId = 0;
        this.bookName = null;
        this.bookPrice = 0.0;
        this.bookQty = 0;
    }

    Book(int id, String name, double price, int qty) {
        bookId = id;
        bookName = name;
        bookPrice = price;
        bookQty = qty;
    }
}

public class Asg4Ba {
    private static void searchBookByName(RandomAccessFile file, String name) throws IOException {
        long currentPosition = file.getFilePointer();
        file.seek(0);
        Book b = new Book();

        while (file.getFilePointer() < file.length()) {
            String rec = file.readLine();
            String[] parts = rec.split(" ");

            b.bookId = Integer.parseInt(parts[0]);
            b.bookName = parts[1];
            b.bookPrice = Double.parseDouble(parts[2]);
            b.bookQty = Integer.parseInt(parts[3]);

            if(name.equalsIgnoreCase(b.bookName)) {
                System.out.println("Book Found :");
                System.out.println("Book id = " + b.bookId);
                System.out.println("Book Name = " + b.bookName);
                System.out.println("Book Price = " + b.bookPrice);
                System.out.println("Book Quantity = " + b.bookQty);
                return;
            }
        }

        System.out.println("Book not found.");
        file.seek(currentPosition);
    }

    private static void displayAllBooks(RandomAccessFile file) throws IOException {
        long currentPosition = file.getFilePointer();
        file.seek(0);
        double totalCost = 0;
        Book b = new Book();

        while (file.getFilePointer() < file.length()) {
            String rec = file.readLine();
            String[] parts = rec.split(" ");

            b.bookId = Integer.parseInt(parts[0]);
            b.bookName = parts[1];
            b.bookPrice = Double.parseDouble(parts[2]);
            b.bookQty = Integer.parseInt(parts[3]);

            System.out.println("Book id = " + b.bookId);
            System.out.println("Book Name = " + b.bookName);
            System.out.println("Book Price = " + b.bookPrice);
            System.out.println("Book Quantity = " + b.bookQty);
            System.out.println();

            totalCost = b.bookPrice * b.bookQty;
        }

        System.out.println("Total Cost of All Books: " + totalCost);
        file.seek(currentPosition);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try (RandomAccessFile file = new RandomAccessFile("book.dat", "r")) {
            int choice;
            while (true) {
                System.out.println();
                System.out.println("-----------------------------------------------");
                System.out.println("             Menu:");
                System.out.println("1. Search for a book by name");
                System.out.println("2. Display all books and total cost");
                System.out.println("3. Exit");
                System.out.println();

                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                System.out.println();

                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter book name to search: ");
                        String searchName = sc.nextLine();
                        System.out.println();

                        searchBookByName(file, searchName);
                        break;
                    case 2:
                        displayAllBooks(file);
                        break;
                    case 3:
                        System.out.println("Exiting program.");
                        return;
                    default:
                        System.out.println("Invalid choice. Try again.");
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}