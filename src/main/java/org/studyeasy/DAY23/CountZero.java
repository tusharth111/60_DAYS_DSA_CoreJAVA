package org.studyeasy.DAY23;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  07 1/7/2026 8:45 PM
 Project Name : 30Days_Java
 ***/
public class CountZero {
    static int Zeros(int arr[]){
        int count = 0;
        for(int i = 0;i< arr.length;i++){
            if(arr[i] != 1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] ={1,1,1,1,0,0,0};
        System.out.println(Zeros(arr));
    }
}
