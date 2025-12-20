package org.studyeasy.DAY4.SimpleBankingApp;


/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  19 12/19/2025 2:53 PM
 Project Name : 30Days_Java
 ***/
public class Main {
    public static void main(String[] args)
    {

        BankService bank = new BankService();

        bank.createAccount("101","Tushar",123);
        bank.createAccount("102","Rahul",126);

        Account loggedIn = bank.login("102",126);


        if(loggedIn != null){
            bank.deposit(loggedIn,50000);
            bank.withdraw(loggedIn,10000);
            System.out.println("Balance: "+loggedIn.getBalance());
        }
    }
}
