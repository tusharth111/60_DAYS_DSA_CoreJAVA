package org.studyeasy.DAY8;

import java.util.Scanner;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  23 12/23/2025 8:55 PM
 Project Name : 30Days_Java
 ***/
public class OcurrenceChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str =sc.nextLine();
        System.out.println("Enter the character: ");
        char c =sc.next().charAt(0);

        int count = 0;

        for(char ch :  str.toCharArray() ){
            if(ch == c ){
                count++;
            }


        }
        System.out.println("occurence of character : "+ c + "in string :"+ str+"is : "+ count);
    }
}
