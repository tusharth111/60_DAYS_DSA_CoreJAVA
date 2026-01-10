package org.studyeasy.DAY26;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  10 1/10/2026 11:31 AM
 Project Name : 30Days_Java
 ***/
public class FuncTutorial{
    myFunctionalInterface lambda =() ->
        System.out.println("executing");
    public static void main(String[] args) {
        FuncTutorial func = new FuncTutorial();
        func.lambda.execute();
    }
}
