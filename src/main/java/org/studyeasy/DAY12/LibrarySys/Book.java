package org.studyeasy.DAY12.LibrarySys;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  27 12/27/2025 1:22 PM
 Project Name : 30Days_Java
 ***/
public class Book {
    private int Book_Id;
    private String Book_title;
    private String author;
    private Boolean isIssued;

    public Book(int Book_Id,String Book_title ,String author){
        this.Book_Id = Book_Id;
        this.Book_title = Book_title;
        this.author = author;
        this.isIssued = false;
    }

    public String getBook_title() {
        return Book_title;
    }

    public int getBook_Id() {
        return Book_Id;
    }

    public String getAuthor() {
        return author;
    }

    public Boolean getIsIssued() {
        return isIssued;
    }
    // to issue a book or mark book as issued
    public void issue(){
        isIssued = true;
    }
    public void returnBook(){
        isIssued = false;
    }
    public String toString(){
        return Book_Id +","+Book_title+","+ author+", "+isIssued;


    }
}
