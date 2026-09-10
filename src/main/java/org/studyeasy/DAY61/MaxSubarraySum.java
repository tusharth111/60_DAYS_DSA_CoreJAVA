package org.studyeasy.DAY61;


/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  10 9/10/2026 9:19 PM
 Project Name : 30Days_Java
 ***/
public class MaxSubarraySum {
    public static int maxSumSubarr(int[] arr){
        int n = arr.length;
        int max = 0;
        int currentSum = 0;

        for(int i = 0;i<n;i++){ // traverse the array elements
            currentSum+=arr[i];
            max = Math.max(currentSum,max);//get the max from both the sums
            if(currentSum<0){
                currentSum = 0;
            }

        }
        return max;
    }
    public static void main(String[] args) {
        int arr [] ={ -2,1,-3,4,-1,6,-1,5,4};
        System.out.println(maxSumSubarr(arr));

    }
}
