package org.studyeasy.DAY11;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  26 12/26/2025 8:40 PM
 Project Name : 30Days_Java
 ***/
public class SlidingWindow {
    public static int maxSum(int arr[],int n , int k){
        if(n<=k){
            System.out.println("INVALID");
            return -1;
        }
        int max_sum = 0;
        for(int i =0;i<k;i++){
            max_sum += arr[i];
        }
        //Compute the sum of remaing window by
        //removing the first element of previous window
        // and adding last element of the current window

        int window_sum = max_sum;
        for(int i = k;i<n;i++){
            window_sum +=arr[i]-arr[i-k];
            max_sum = Math.max(max_sum,window_sum);
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k =4;
        int n = arr.length;
        System.out.println(maxSum(arr ,n,k));
    }
}
