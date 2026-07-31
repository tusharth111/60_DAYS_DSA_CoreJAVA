package org.studyeasy.DAY56;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  31 7/31/2026 9:31 PM
 Project Name : 30Days_Java
 ***/
public class MaximumConsecutiveOnesIII {
    public static int MaxConsecutive1s(int[] nums,int k){
        int n = nums.length;
        if(n < 1){
            return 0;
        }
        int maxOnes = 0;
        int zeroCount = 0;
        int left = 0;//for decreasing the window
        for (int right = left; right < n; right++)// for traverse the window
        {
            if(nums[right] == 0){//traverse the array for next zero
                zeroCount++;
            }
           while (zeroCount > k){// check always when window is invalid
               if(nums[left] == 0) {
                   zeroCount--;
               }
               left++;
           }
           if(zeroCount <=k){ // not compulsory if not false then it is true
               maxOnes = Math.max(right - left+1 , maxOnes);
           }
        }
        return maxOnes;
    }
    public static void main(String[] args) {
        int [] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(MaxConsecutive1s(nums,k));
    }
}
