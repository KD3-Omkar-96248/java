package com.library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        List<Book> bookList = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books (Forward)");
            System.out.println("3. Display Books (Reverse)");
            System.out.println("4. Delete Book by Index");
            System.out.println("5. Sort Books by Price (Descending)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    sc.nextLine(); // clear buffer

                    System.out.print("Enter ISBN: ");
                    String isbn = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    sc.nextLine(); // clear buffer
                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    bookList.add(new Book(isbn, price, author, quantity));
                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    System.out.println("\nBooks in Forward Order:");
                    for (Book b : bookList) {
                        System.out.println(b);
                    }
                    break;

                case 3:
                    System.out.println("\nBooks in Reverse Order:");
                    for (int i = bookList.size() - 1; i >= 0; i--) {
                        System.out.println(bookList.get(i));
                    }
                    break;

                case 4:
                    System.out.print("Enter index to delete: ");
                    int index = sc.nextInt();

                    if (index >= 0 && index < bookList.size()) {
                        bookList.remove(index);
                        System.out.println("Book deleted successfully!");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 5:
                    Collections.sort(bookList, new Comparator<Book>() {
                        @Override
                        public int compare(Book b1, Book b2) {
                            return Double.compare(b2.getPrice(), b1.getPrice()); // Descending
                        }
                    });

                    System.out.println("Books sorted by price (descending).");
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }

}


