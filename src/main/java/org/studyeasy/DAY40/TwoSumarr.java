package org.studyeasy.DAY40;

import java.util.Arrays;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  04 4/4/2026 11:55 PM
 Project Name : 30Days_Java
 ***/
public class TwoSumarr {
    public static int[] Targetsum(int []arr,int target){
        int L = 0;
        int R = arr.length-1;

        while (L<R){
            int sum = arr[L] + arr[R];// needed to be updated with in the loop
            if(sum == target){
                return new int[]{arr[L],arr[R]};
            }
            else if(sum > target) R--;
            else L++;
        }
        return new int[0];
    }
    public static void main(String[] args) {
        int [] arr = {1,4,6,8,11,15};
        int target =15;
        System.out.println(Arrays.toString(Targetsum(arr, target)) +" ");

    }
}
