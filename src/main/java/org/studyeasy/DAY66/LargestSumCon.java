package org.studyeasy.DAY66;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  22 10/22/2026 8:16 PM
 Project Name : 30Days_Java
 ***/
public class LargestSumCon {
    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = arr[0];
        int currentSum = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            currentSum = Math.max(arr[i] , currentSum + arr[i]);
            maxSum = Math.max(maxSum,currentSum);
        }
        System.out.println(maxSum);
    }
}
