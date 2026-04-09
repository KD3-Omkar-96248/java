import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

// Book class
class Book 
{
    private String isbn;
    private double price;
    private String authorName;
    private int quantity;

    // Constructor
    public Book(String isbn, double price, String authorName, int quantity) 
    {
        this.isbn = isbn;
        this.price = price;
        this.authorName = authorName;
        this.quantity = quantity;
    }

    public String getIsbn() 
    {
        return isbn;
    }

    public double getPrice() 
    {
        return price;
    }

    public String getAuthorName() 
    {
        return authorName;
    }

    public int getQuantity() 
    {
        return quantity;
    }

    @Override
    public String toString() 
    {
        return "ISBN: " + isbn +
               ", Price: " + price +
               ", Author: " + authorName +
               ", Quantity: " + quantity;
    }
}

public class LibraryManagement 
{
    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add new book");
            System.out.println("2. Display books (Forward)");
            System.out.println("3. Display books (Reverse)");
            System.out.println("4. Delete book by index");
            System.out.println("5. Sort books by price (Descending)");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    sc.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    sc.nextLine(); 
                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    list.add(new Book(isbn, price, author, qty));
                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    System.out.println("\n--- Books (Forward) ---");
                    for (Book b : list)
                    {
                        System.out.println(b);
                    }
                    break;

                case 3:
                    System.out.println("\n--- Books (Reverse) ---");
                    for (int i = list.size() - 1; i >= 0; i--) 
                    {
                        System.out.println(list.get(i));
                    }
                    break;

                case 4:
                    System.out.print("Enter index to delete: ");
                    int index = sc.nextInt();

                    if (index >= 0 && index < list.size()) 
                    {
                        list.remove(index);
                        System.out.println("Book deleted successfully!");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 5:
                    list.sort(new Comparator<Book>() 
                    {
                        @Override
                        public int compare(Book b1, Book b2) 
                        {
                            return Double.compare(b2.getPrice(), b1.getPrice()); // Descending
                        }
                    });

                    System.out.println("Books sorted by price in descending order!");
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } 
        while (choice != 0);

        sc.close();
    }
}
