package org.studyeasy.DAY63;

import java.util.HashSet;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  02 10/2/2026 9:07 PM
 Project Name : 30Days_Java
 ***/
public class LongestSeq {
    public static int longestSq(int []arr){
        int n = arr.length;
        int max = 0;
        HashSet<Integer> set = new HashSet<>();//sorted set to store the elements
        for(int i = 0;i<n;i++){// addd the elements in the set
            set.add(arr[i]);
        }
        for (int i = 0; i < n; i++) {
        int current = arr[i];//set the current elment to the first element of the array
        if(!set.contains(current-1)){
            int length =1;
            while (set.contains(current + 1)) {
                current++;
                length++;
            }
            max = Math.max(max, length);
        }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr ={100, 4, 200, 1, 3, 2};
        System.out.println(longestSq(arr));

    }
}
