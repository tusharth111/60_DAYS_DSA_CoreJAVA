package org.studyeasy.DAY1;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  16 12/16/2025 1:23 PM
 Project Name : 30Days_Java
 ***/
public class SwapNum {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println("Before Swapping values  a = "+a+", b = "+b);
        // USING addition and Subtraction without temp variable//
        /*
        a = a+b;//a = 3+4 = 7
        b = a-b;//b = 7-4 = 3
        a = a-b;//a = 7-3 = 4
        */
        //Using XOR (bit manipulation )
        a  = a ^ b;
        b =  a ^ b;
        a =  a ^ b;

        System.out.println("Before Swapping values  a = "+a+", b = "+b);


    }
}
