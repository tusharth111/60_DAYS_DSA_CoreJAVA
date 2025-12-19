package org.studyeasy.DAY4;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  19 12/19/2025 11:38 AM
 Project Name : 30Days_Java
 ***/
public class DpPascalTri {
    public static  void printPascal(int n ){
        for(int line = 0;line<=n;line++){
            for(int j =0;j<= n-line;j++){
                System.out.print(" ");
                //for left spacing
            }
            int c = 1;
            for(int i =1;i<= line;i++){
                System.out.print(c+" ");
                c = c * (line - i)/i;
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        int n = 4;
        printPascal(n);
    }
}
