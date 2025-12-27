package org.studyeasy.DAY12.LibrarySys;

import java.io.IOException;
import java.util.Scanner;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  27 12/27/2025 1:19 PM
 Project Name : 30Days_Java
 ***/
public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        // load previous data
        library.loadFromFile("books.txt");

        while (true) {

            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. Show Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Save & Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    library.addBook(new Book(id, title, author));
                    break;

                case 2:
                    library.showBooks();
                    break;

                case 3:
                    System.out.print("Enter Book ID to issue: ");
                    library.issueBook(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter Book ID to return: ");
                    library.returnBook(sc.nextInt());
                    break;

                case 5:
                    library.saveToFile("books.txt");
                    System.out.println("Data saved. Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }


    }
}
