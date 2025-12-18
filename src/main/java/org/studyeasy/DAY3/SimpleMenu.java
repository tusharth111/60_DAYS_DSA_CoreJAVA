package org.studyeasy.DAY3;

import java.util.Scanner;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  18 12/18/2025 10:37 AM
 Project Name : 30Days_Java
 ***/
public class SimpleMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice =0;
        while(choice != 3){
            System.out.println("1. Say Hello");
            System.out.println("2. Show my Name");
            System.out.println("3. Exit");
            System.out.println("Select the option");
            choice = sc.nextInt();

            if(choice == 1){
                System.out.println("Hello! , Welcome to Java.");
            }
            else if(choice == 2){
                System.out.println("My name is Tushar Thakur");
            } else if (choice == 3) {
                System.out.println("Exiting ...");
            }
        }
        sc.close();
    }
}
