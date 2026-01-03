package org.studyeasy.DAY19;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  03 1/3/2026 8:18 PM
 Project Name : 30Days_Java
 ***/
public class FactorialofN {
    public static int fact(int n ){

        if(n==0){return 1;}
        else {
            return  n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int fact = fact(n);
        System.out.println(fact);

    }
}
