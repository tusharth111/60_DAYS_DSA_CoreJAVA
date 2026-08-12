package org.studyeasy.DAY59;

import java.util.*;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  12 8/12/2026 9:37 PM
 Project Name : 30Days_Java
 ***/
public class TopKFrequentElem {
    public static int[] TopKFreqEle(int []nums,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans[] = new int[k];
        if(nums.length == 0){
            return new int[0];
        }
        for (int val : nums) {
            map.put(val, map.getOrDefault(val, 0) + 1);// hashmap with value and frequency
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
        pq.addAll(map.entrySet());

        for(int i = 0;i<k;i++){
            Map.Entry<Integer,Integer> entry = pq.poll(); // get the max value in the heap which is store in map format
            ans[i] = entry.getKey();
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] nums = {1,1,1,2,2,2,2,3,4};
        int k = 2;
        System.out.println(Arrays.toString(TopKFreqEle(nums,k)));
    }
}
