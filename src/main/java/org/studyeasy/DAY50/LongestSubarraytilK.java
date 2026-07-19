package org.studyeasy.DAY50;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  19 7/19/2026 9:12 PM
 Project Name : 30Days_Java
 ***/
public class LongestSubarraytilK {
    public static int LongerstSubarraytillKV1(int [] arr,int k){

        if( arr == null || arr.length == 0){
            return 0;
        }
        int n = arr.length;
        int max = 0;
        for(int i = 0; i < n-k+1 ; i++){
            int sum = 0;
            for(int j = i ; j < i + k; j++){
                sum += arr[j];

            }
            max = Math.max(sum,max);
        }
        return max;
    }
    public static int LongerstSubarraytillKV2(int [] arr,int k){
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

        return max;

    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,1,3,2};
        int k = 3;
        System.out.println(LongerstSubarraytillKV2(arr,k));
    }
}
