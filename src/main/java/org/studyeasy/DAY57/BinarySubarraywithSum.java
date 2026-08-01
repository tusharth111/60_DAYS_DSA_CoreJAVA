package org.studyeasy.DAY57;

import java.util.HashMap;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  01 8/1/2026 10:03 PM
 Project Name : 30Days_Java
 ***/
public class BinarySubarraywithSum {
    public static int ValidSubarrwithSum(int nums[],int goal ){
        int n = nums.length;
        int sum =0;
        int count = 0;
        HashMap<Integer,Integer> prefixFreq = new HashMap<>();
        prefixFreq.put(0,1);
        for (int i = 0; i < n; i++)
        {
            int b = nums[i];
            sum = sum + b;// find the sum
            int req = sum - goal;
            count += prefixFreq.getOrDefault(req,0);
            prefixFreq.put(sum,prefixFreq.getOrDefault(sum,0)+1);// increment as we find duplicate

        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,0,1,0,1};
        int goal = 2;
        System.out.println(ValidSubarrwithSum(nums,goal));
    }
}
