package org.studyeasy.DAY12.LibrarySys;

import java.io.*;
import java.util.ArrayList;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  27 12/27/2025 1:41 PM
 Project Name : 30Days_Java
 ***/
public class Library {
    private ArrayList<Book> books = new ArrayList<>();//array list that stores Book objects

    //add new book in the library
    public void addBook(Book book){
        books.add(book);// adding the book in the books arraylist
    }
    public void showBooks(){
        if(books.isEmpty()){
            System.out.println("there is no bopoks found");
            return;
        }
        for(Book b : books){
            System.out.println(
            b.getBook_Id()+" | "+
            b.getBook_title()+" | "+
            b.getAuthor()+" | "+
                    (b.getIsIssued() ?"Issued" : "Available")
            );
        }
    }
    //issue a book
    public void issueBook(int Id){
        for(Book b : books){
            //find book id
            if(b.getBook_Id() == Id){
                //check availability
                if(b.getIsIssued()){
                    System.out.println("Book is already issued");
                }else{
                    b.issue();
                    System.out.println("Book is issued successfully.");
                }
                return;
            }
        }
        System.out.println("Book not found! ");
    }
    //Return a book
    public void returnBook(int Id){
        for (Book b : books){
            if(b.getBook_Id() == Id){
                if(!b.getIsIssued()){
                    System.out.println("Book is not isssued");
                }else {
                    b.returnBook();
                    System.out.println("Book returned successfully.");
                }
                return;
            }
        }
        System.out.println("book not found!");
    }

    // save books to file
    public void saveToFile(String filename) throws IOException {

        FileWriter fw = new FileWriter(filename);
        // opens file for writing

        for (Book b : books) {
            fw.write(b.toString() + "\n");
            // writes in CSV format
        }

        fw.close();  // closes stream
    }

    // load books from file
    public void loadFromFile(String filename) throws IOException {

        File file = new File(filename);

        // if no file exists yet, do nothing
        if (!file.exists()) return;

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;

        while ((line = br.readLine()) != null) {

            String[] parts = line.split(",");

            // create book object back from file data
            Book b = new Book(
                    Integer.parseInt(parts[0]),
                    parts[1],
                    parts[2]
            );

            // restore issued status
            if (Boolean.parseBoolean(parts[3])) {
                b.issue();
            }

            books.add(b);
        }

        br.close();
    }
}
