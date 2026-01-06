package org.studyeasy.DAY22;

import java.util.Arrays;
import java.util.List;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  06 1/6/2026 8:32 PM
 Project Name : 30Days_Java
 ***/
public class IndexOfSubarray {
    static List<Integer> IndexofSum(int arr[], int target ){
        int left = 0;
        int current_Sum = 0;
        for(int right = 0;right< arr.length;right++){
            current_Sum+=arr[right];
            while (current_Sum>target && left <= right){
                current_Sum -=arr[left];
                left++;
            }
            if(current_Sum == target){
                return Arrays.asList(left+1,right+1);
            }
        }
        return Arrays.asList(-1);
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,7,5};
        int target = 12;
        System.out.println(IndexofSum(arr,target));
    }
}
