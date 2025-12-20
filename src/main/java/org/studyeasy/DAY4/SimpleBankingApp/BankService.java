package org.studyeasy.DAY4.SimpleBankingApp;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  19 12/19/2025 2:34 PM
 Project Name : 30Days_Java
 ***/
public class BankService {
    private HashMap<String,Account> accounts = new HashMap<>();
    //Create a Account
    public void createAccount(String accNo, String name, int pin){
        if(accounts.containsKey(accNo)){
            System.out.println("Account already exists! ");
            return;
        }

        Account account = new Account(accNo,name,pin);
        accounts.put(accNo,account);
        System.out.println("Account is created successfully !" );

    }
    // Login Logic
    public Account login(String accNo,int pin){

        Account account = accounts.get(accNo);

        if (account != null && account.validatePin(pin)){
            System.out.println("Login Successful!");
            return account;
        }

        System.out.println("Invalid account number or pin! ");
        return null;

    }
    //Deposit via service
    public void deposit(Account acc,double amount){
        acc.deposit(amount);
    }
    //Withdraw via service
    public void withdraw(Account acc, double amount){
        acc.withdraw(amount);
    }
}
