package org.studyeasy.DAY52;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  24 7/24/2026 11:27 AM
 Project Name : 30Days_Java
 ***/
public class MaxAverageSubArr {
    public static double MaxAverageSubArrV1(int[] arr,int k){
        if(arr == null){
            return 0;
        }
        int n  = arr.length;
        int sum= 0;
        int avg = 0;
        for(int i = 0;i<k;i++){
            sum = sum + arr[i];
        }
        int max = sum;
        for(int j  = k;j<n;j++){
            sum = sum - arr[j-k];// remove the first elment of the window
            sum = sum + arr[j]; // add the next element in the window from the array to subarray
            max = Math.max(max,sum);
        }

        return (double) max/k;
    }
    public static void main(String[] args) {
        int [] arr = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(MaxAverageSubArrV1(arr,k));
    }
}
