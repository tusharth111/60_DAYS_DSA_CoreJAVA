package org.studyeasy.DAY19;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  03 1/3/2026 8:44 PM
 Project Name : 30Days_Java
 ***/
public class PerfectNumber {
    public  static boolean perfect(int n ){
        int sum = 0;
        for(int i =1;i<n;i++){
            if(n%i==0){
                sum= sum +i;
            }
        }
        if(sum == n){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        int n =6;
        if(perfect(n)){
            System.out.println("it is a perfect number");
        }else{
            System.out.println("it is not a perfect numebr");
        }
    }
}
