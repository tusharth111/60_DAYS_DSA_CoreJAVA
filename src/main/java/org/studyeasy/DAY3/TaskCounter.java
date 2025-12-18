package org.studyeasy.DAY3;

import java.util.Scanner;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  18 12/18/2025 10:34 AM
 Project Name : 30Days_Java
 ***/
public class TaskCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tasks: ");
        int tasks = sc.nextInt();

        for(int i =1;i<=tasks;i++){
            System.out.println("Task"+i+" : Pending ");
        }
    }
}
