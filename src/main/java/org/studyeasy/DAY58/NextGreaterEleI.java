package org.studyeasy.DAY58;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  06 8/6/2026 9:30 PM
 Project Name : 30Days_Java
 ***/
public class NextGreaterEleI {
    public static int[] nextGreaterElements(int[] num1,int[] num2 ) {
        Stack<Integer> stack = new Stack<>();

        int ans[] = new int[num1.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        if(num1.length == 0 || num2.length == 0){
            return new int[]{};
        }
        for(int i = 0;i<num2.length;i++){
            int curr  =  num2[i];
            while(!stack.empty() && curr > stack.peek()){ //if stack is not empty and current element is greater than peek element in the stack
                map.put(stack.pop(),curr);
            }
            stack.push(curr);// if the element is smaller than the top of the stack then push it to the stack
        }
        while(!stack.empty()){
            map.put(stack.pop(),-1);// if the element is not found then put -1 in the map
        }
        for(int i  = 0;i<num1.length;i++){
            if(map.containsKey(num1[i])){
                ans[i] = map.get(num1[i]);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] num1 = {4,1,2};
        int [] num2 = {1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElements(num1,num2)));
    }
}
