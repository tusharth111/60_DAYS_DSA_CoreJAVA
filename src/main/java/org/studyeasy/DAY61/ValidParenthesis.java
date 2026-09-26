package org.studyeasy.DAY61;

import java.util.Stack;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  26 9/26/2026 9:04 PM
 Project Name : 30Days_Java
 ***/
public class ValidParenthesis {
    public static boolean ValidPara(String str){
        Stack<Character> stack= new Stack<>();//empty stack
        for(char c : str.toCharArray()){//get next element or parenthesis
            if( c == '(' || c == '{' || c == '[')
            {
                stack.push(c);
            }else
            {
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.peek();
                if( c == ')' && top != '('||c == '}' && top != '{'||c == ']' && top != '['){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String str = "([{}])";
        System.out.print(ValidPara(str));
    }
}
