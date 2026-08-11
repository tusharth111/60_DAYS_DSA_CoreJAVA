package org.studyeasy.DAY59;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  11 8/11/2026 9:30 PM
 Project Name : 30Days_Java
 ***/
public class BinarySearch {
    public static int BSearch(int [] nums, int target){
        int n = nums.length;
        int start = 0;
        int end = n-1;
        while(start <= end){
            int mid = (start + end)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] < target){
                start = mid +1;
            }
            else {
                end = mid -1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int [] nums = {1,3,5,7,11};
        int target = 7;
        System.out.println(BSearch(nums,target));
    }
}
