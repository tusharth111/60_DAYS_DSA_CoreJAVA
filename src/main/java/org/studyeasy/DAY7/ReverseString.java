package org.studyeasy.DAY7;

import java.util.Scanner;
import java.util.Stack;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  22 12/22/2025 12:00 PM
 Project Name : 30Days_Java
 ***/
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        System.out.println(str);
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray() ){
            stack.push(c);
        }
        StringBuilder reversed = new StringBuilder();
        while(!stack.isEmpty()){
            reversed.append(stack.pop());//anything the stack pop the reversed string is appended in
        }
        System.out.println( "Reverse : "+reversed);
    }
}
