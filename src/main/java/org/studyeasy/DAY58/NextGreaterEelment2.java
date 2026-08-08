package org.studyeasy.DAY58;

import java.util.Arrays;
import java.util.Stack;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  08 8/8/2026 9:26 PM
 Project Name : 30Days_Java
 ***/
public class NextGreaterEelment2 {
        public static int[] nextGreaterElementsII(int[] nums) {
            int n = nums.length;
            Stack<Integer> stack = new Stack<>();
            int[] res = new int[n];

            for(int i = 0;i<2*n;i++){
                int index = i%n;
                int curr = nums[index];
                while(!stack.isEmpty() && nums[stack.peek()] < curr){
                    res[stack.pop()] = curr;
                }
                if(i<n){
                    stack.push(index);
                }
            }

            while (!stack.isEmpty()) {
                res[stack.pop()] = -1;
            }
            return res;
        }
        public static void main(String[] args) {
            int [] arr = {1,2,1};
            System.out.println(Arrays.toString(nextGreaterElementsII(arr)));
        }
}

