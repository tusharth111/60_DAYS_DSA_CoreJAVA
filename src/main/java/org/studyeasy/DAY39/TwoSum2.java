package org.studyeasy.DAY39;

import java.util.ArrayList;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  04 3/4/2026 12:14 PM
 Project Name : 30Days_Java
 ***/
public class TwoSum2 {
    public static int[] twosum(int [] numbers,  int target){
        int left = 0, right = numbers.length-1;
        ArrayList<Integer> arr = new ArrayList<>();
        int []res = new int[2];
        while(left < right){
            int sum = numbers[left]+numbers[right];
            if(sum == target){
                arr.add(left+1);// since array is 1 indexed
                arr.add(right+1);

                res[0] = arr.get(0);
                res[1] = arr.get(1);
                return res;
            }
            else if(sum< target){
                left++;
            }else {
                right--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int k = 9;
        int res [] = twosum( arr,k);
        System.out.println(res[0]+" "+res[1]);
    }
}
