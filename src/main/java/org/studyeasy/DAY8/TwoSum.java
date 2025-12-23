package org.studyeasy.DAY8;

import java.io.FilterOutputStream;
import java.util.Arrays;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  23 12/23/2025 9:08 PM
 Project Name : 30Days_Java
 ***/
public class TwoSum {
    static boolean twoSum(int[] arr, int target){
        Arrays.sort(arr);
        int left = 0, right = arr.length-1;
        while(left < right){
            int sum = arr[left]+arr[right];
            if(sum==target){
                return true;
            }
            if (sum < target){
                left++;
            }
            else right--;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] ={0,-1,2,-3,1};
        int target = -2;

        if(twoSum(arr,target)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
