package org.studyeasy.DAY19;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  03 1/3/2026 8:13 PM
 Project Name : 30Days_Java
 ***/
public class Triangelvalid {
    public static void main(String[] args) {
        int a = 7,b= 10,c =5;
        if(a +b > c || b+c >a || a+c >b){
            System.out.println("its a valid triangel ");
        }
        else {
            System.out.println("it is not a valid triangle.");
        }
    }
}
