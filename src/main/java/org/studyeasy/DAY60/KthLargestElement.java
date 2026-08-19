package org.studyeasy.DAY60;

import java.util.PriorityQueue;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  19 8/19/2026 9:05 PM
 Project Name : 30Days_Java
 ***/
public class KthLargestElement {
    public static int KthLargest(int [] nums,int k ){
        int n = nums.length;
        if(k>n && n == 0){//edge case
            return 0;
        }
        PriorityQueue<Integer> min = new PriorityQueue<>();
        for(int i = 0;i<n;i++){// traveesrse array and add element in the min heap
            min.add(nums[i]);
            if(min.size() > k){
                min.poll();//remove the top element which is smallest
            }
        }
        return min.peek();// which is the k th largest element since it is a heap of k length.
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int result = KthLargest(nums,k);
        System.out.println("Kth largest element in the array: "+result);
    }
}
// time : o( n log k ) // since we traversed the array.length and heap is size of k
// space : o(k) since the size of heap is k
