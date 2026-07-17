package org.studyeasy.DAY49;

import java.util.Arrays;
import java.util.HashMap;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  17 7/17/2026 8:56 PM
 Project Name : 30Days_Java
 ***/
public class TwoSum {
    public static int[] TwoSumV1(int[] nums, int target){
        int n = nums.length;
        if(nums == null || nums.length <= 2 ){
            return new int[]{};
        }
        for(int i = 0;i<n;i++){//outer loop for first element
            int sum =0;
            for(int j = i+1;j<n;j++){
                sum = nums[i]+ nums[j];
                if(sum == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    public static int [] TwoSumV2(int [] nums , int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int current = nums[i];
            int complement = target - current;
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(current,i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target = 9;
        int []result = TwoSumV2(nums,target);
        System.out.println(Arrays.toString(result));

    }
}
