package org.studyeasy.DAY57;

import java.util.Arrays;
import java.util.Stack;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  04 8/4/2026 8:59 PM
 Project Name : 30Days_Java
 ***/
public class DailyTemp {
    public static int[] DailyTempV1(int []temp){
        int n = temp.length;
        boolean found = false;

        int [] ans = new int[n];
        for( int i = 0;i<n;i++){
            int count= 0;
            for(int j = i+1;j<n;j++){
                count++;
                if(temp[j] > temp[i]){
                    found = true;
                    ans[i] = count;
                    break;
                }
            }
            if(!found){
                ans[i] = 0;
            }
        }
        return ans;
    }
    public static int[] DailyTempV2(int []temp){
        Stack<Integer> ss = new Stack<>();
        int n = temp.length;
        int [] ans = new int[n];
        for(int i = 0;i<n;i++){
            while(!ss.empty() && temp[i] > temp[ss.peek()])
            {
                int prev = ss.pop();
                ans[prev]= i - prev;
            }
            ss.push(i);//push every element
        }
        return ans;
    }
        public static void main(String[] args) {
        int []temp = {73,74,71,69,72,76,73};
        System.out.println(Arrays.toString(DailyTempV2(temp)));

    }
}
