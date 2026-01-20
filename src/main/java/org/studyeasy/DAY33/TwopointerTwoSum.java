package org.studyeasy.DAY33;

import org.w3c.dom.ls.LSOutput;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  20 1/20/2026 8:27 PM
 Project Name : 30Days_Java
 ***/
public class TwopointerTwoSum {
    static boolean twoSum(int[]arr,int target){
        int left = 0;
        int right = arr.length-1;
        while(left<right) {
            int sum = arr[left] + arr[right];
            if(sum == target){
                return true;
            }else if(sum <target){
                left++;
            }else{
                right--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int []arr = {1,2,4,6,8,9,14,15};
        int target = 11;
        boolean isPair=twoSum(arr,target);
        if(isPair){
            System.out.println("There is a pair");
        }else {
            System.out.println("There is no pair");
        }


    }
}
