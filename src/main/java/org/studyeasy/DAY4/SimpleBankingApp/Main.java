package org.studyeasy.DAY4.SimpleBankingApp;



import java.util.Scanner;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  19 12/19/2025 2:53 PM
 Project Name : 30Days_Java
 ***/
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        BankService bank = new BankService();
        while (true){
            System.out.println("/n-- BANK Menu --");
            System.out.println("1.CREATE ACCOUNT");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.println("Choose an Option: ");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter Account Number: ");
                    String accNo = sc.next();
                    System.out.println("Enter the Name :");
                    String name = sc.next();
                    System.out.println("Enter the Pin: ");
                    int pin = sc.nextInt();

                    bank.createAccount(accNo,name,pin);
                    break;
                case 2:
                    System.out.println("Enter the Account Number: ");
                    String loginAcc = sc.next();
                    System.out.println("Enter the pin : ");
                    int loginPin = sc.nextInt();
                    Account loggedIn = bank.login(loginAcc,loginPin);//object of account class to get the methods
                    if(loggedIn != null){// to start the login menu containing the services
                        boolean loggedInMenu = true;
                        while(loggedInMenu){
                            System.out.println("/n --- Account Menu---");
                            System.out.println("1. Deposit");
                            System.out.println("2. Withdraw");
                            System.out.println("3. Check Balance");
                            System.out.println("4. Logout");
                            System.out.print("Choose option: ");

                            int opt = sc.nextInt();

                            switch (opt) {
                                case 1:
                                    System.out.println("Enter the amount: ");
                                    bank.deposit(loggedIn, sc.nextDouble());
                                    break;
                                case 2:
                                    System.out.println("Enter the amount: ");
                                    bank.withdraw(loggedIn, sc.nextDouble());
                                    break;
                                case 3:
                                    System.out.println("Your Bank Balance:" + loggedIn.getBalance());
                                    break;

                                case 4:
                                    loggedInMenu = false;
                                    System.out.println("Logout successfully!");
                                    break;
                                default:
                                    System.out.println("Invalid Option! ");
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Thank you for using the bank! ");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Choice! ");
            }
        }
    }
}
