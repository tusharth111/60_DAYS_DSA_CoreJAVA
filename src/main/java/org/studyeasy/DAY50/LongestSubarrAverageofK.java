package org.studyeasy.DAY50;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  20 7/20/2026 8:53 PM
 Project Name : 30Days_Java
 ***/
public class LongestSubarrAverageofK {
    public static double LongestSubarrAverageofKV1(int [] nums,int k)
    {
        if(nums.length == 0){
            return 0;
        }
        int n = nums.length;
        int max = 0;
        for(int i = 0;i<n-k+1;i++){
            int sum = 0;
            for(int j = i;j<i+k;j++){
                sum += nums[j];
            }
            max = Math.max(sum,max);
        }

        return (double) max/k;
    }
    public static double LongestSubarrAverageofKV2(int [] arr,int k){
        if( arr == null || arr.length == 0){
            return 0;
        }
        int n = arr.length;
        int max = 0;
        int sum = 0;
        for(int i = 0; i < k ; i++){// first window the array
            sum = sum + arr[i];
        }
        max = sum;
        // for the next subarrays
        int left = 0;
        for(int j = k; j< n;j++ ){
            sum = sum - arr[left];
            sum += arr[j];
            left++;
            max = Math.max(sum,max);
        }

        return (double) max/k;
    }
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(LongestSubarrAverageofKV2(nums,k));
    }
}
