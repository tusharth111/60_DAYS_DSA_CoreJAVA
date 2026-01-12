package org.studyeasy.DAY28;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  12 1/12/2026 12:35 PM
 Project Name : 30Days_Java
 ***/
class CookingTask extends Thread{
    private String task;
    CookingTask(String task){
        this.task = task;
    }
    public void run(){
        System.out.println(task + " is being prepared by "+Thread.currentThread().getName());
    }
}
public class ThreadCreation {
    public static void main(String[] args) {
        Thread t1 = new CookingTask("pasta");
        Thread t2 = new CookingTask("sushi");
        Thread t3 = new CookingTask("chicken");
        Thread t4 = new CookingTask("burger");
        t1.start();
        t2.start();
        t3.start();
        t4.start();



    }
}
