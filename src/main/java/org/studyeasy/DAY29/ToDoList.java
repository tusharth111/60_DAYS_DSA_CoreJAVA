package org.studyeasy.DAY29;

import java.util.ArrayList;
import java.util.Scanner;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  13 1/13/2026 11:06 AM
 Project Name : 30Days_Java
 ***/
public class ToDoList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        boolean isTrue = true;
        while(isTrue){
            System.out.println("-----Menu-------");
            System.out.println("1 :---- Add Task-----");
            System.out.println("2 :---- View Task-----");
            System.out.println("3 :---- Remove Task-----");
            System.out.println("4 :---- Exit-----");
            System.out.println("Enter your choice : ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    System.out.print("Enter the task: ");
                    String task = sc.nextLine();
                    tasks.add(task);
                    System.out.println("Task added ");
                    break;
                case 2:
                    if (tasks.isEmpty()){
                        System.out.println("your list is empty");
                    }else{
                        System.out.print("Your tasks ");
                        for(String i : tasks){
                            System.out.println(i);
                        }
                    }

                    break;
                case 3:
                    System.out.print("Enter number of task which you want to delete : ");
                    int index = sc.nextInt();
                    if(index <= 0 || index > tasks.size()){
                        System.out.println("Invalid Index");
                    }else {
                        tasks.remove(index - 1);
                        System.out.println("Task is deleted");
                    }
                    break;
                case 4:
                    isTrue = false;
                    System.out.println("You have exited the to-do-List app");
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}
