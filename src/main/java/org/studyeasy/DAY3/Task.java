package org.studyeasy.DAY3;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  18 12/18/2025 10:43 AM
 Project Name : 30Days_Java
 ***/
public class Task {
    String Title;
    Boolean isCompleted;

    Task(String T){
        this.isCompleted = false;
        this.Title = T;
    }
    void markCompleted(){
        isCompleted = true;
    }

    public  void showTask(){
        System.out.println("Title of Task is :"+Title +": Completed: "+isCompleted);
    }

    public static void main(String[] args) {
        Task t1 = new Task("learn Java");
        Task t2 = new Task("Build ToDo App ");
        t1.markCompleted();
        t1.showTask();
        t2.showTask();
    }
}
