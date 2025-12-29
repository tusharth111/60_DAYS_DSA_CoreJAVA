package org.studyeasy.DAY14;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  29 12/29/2025 8:34 PM
 Project Name : 30Days_Java
 ***/
public class MaxMinArr {
    public static int LargestArr(int arr[]){
        int n = arr.length;
        if(n == 0){//empty array case
            return -1;
        }
        int max = arr[0];

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int SmallestArr(int arr[]){
        int n = arr.length;
        if(n == 0){//empty array case
            return -1;
        }
        int min = arr[0];

        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] ={-3,-2,0,1,4,6};
        System.out.println(LargestArr(arr));
        System.out.println(SmallestArr(arr));
    }
}
