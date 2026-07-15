package org.studyeasy.DAY47;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  15 7/15/2026 10:55 AM
 Project Name : 30Days_Java
 ***/
public class ZeroToEnd {
    // Brute Force Approach O(N) TIME AND SPACE Complexity
    public static void pushZeroToEndv1(int arr[]){

        int n = arr.length;
        int []temp = new int[n];
        if(arr.length == 0){
            return;
        }
        int j = 0;
        for(int i  = 0;i<n;i++){
            if(arr[i] != 0){
                temp[j++] = arr[i];
            }
        }
        while(j<n){
            temp[j++] = 0;
        }
        for(int i = 0;i<n;i++){
            arr[i] = temp[i];
        }
    }
    // Better Approach : Two pointer O(N) AND  O(1)
    public static void pushZeroToEndv2(int arr[]){
        int count = 0;
        if(arr.length == 0){
            return;
        }
        for(int i = 0; i<arr.length;i++){
            if(arr[i]!=0){
                arr[count++] = arr[i];
            }
        }
        while(count < arr.length){
            arr[count++] = 0;
        }
    }
    public static void pushZeroToEndv3(int [] arr){
        int count = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i] != 0){
                if(i != count) {
                    int temp = arr[i];
                    arr[i] = arr[count];
                    arr[count] = temp;
                }
                count++;
            }
        }
    }
    public static void main(String[] args) {
        int []arr = {1,0,2,3,4,56,0,0,5,0};
        pushZeroToEndv3(arr);
        for (int n : arr){
            System.out.print(n +" ");
        }
    }
}
