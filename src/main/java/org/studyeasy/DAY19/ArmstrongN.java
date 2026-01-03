package org.studyeasy.DAY19;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  03 1/3/2026 8:25 PM
 Project Name : 30Days_Java
 ***/
public class ArmstrongN {
    public static boolean armstrong(int n){
        int digits  = String.valueOf(n).length();// used to get the numebr of digits in the integer
        int temp = n;
        int sum = 0;
        while(temp > 0){
            int rem = temp % 10;// get the last value
            sum = (int) (sum + Math.pow(rem,digits));
            temp = temp/10;

        }
        if(sum==n){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
        int n =1543;
        if(armstrong(n)){
            System.out.println("it is a armstrong value.");
        }else {
            System.out.println("it is not a armstrong value");
        }

    }
}
