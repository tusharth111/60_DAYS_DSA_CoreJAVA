package org.studyeasy.DAY4;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  19 12/19/2025 11:04 AM
 Project Name : 30Days_Java
 ***/
public class PascalTriangle {
    public static int factorial(int n ){
        if( n == 0){
            return 1;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        int n = 4;
        for(int i = 0;i<=n;i++){//rows
            for(int j = 0;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j =0;j<=i;j++){
                System.out.print( " "+factorial(i)/(factorial(i-j) * factorial(j)));
            }
            System.out.println();
        }
    }
}
