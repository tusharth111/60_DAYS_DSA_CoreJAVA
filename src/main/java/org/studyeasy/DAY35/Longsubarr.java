package org.studyeasy.DAY35;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  22 1/22/2026 8:17 PM
 Project Name : 30Days_Java
 ***/
public class Longsubarr {// using two pointers to find the subarray

    static int longarr(int[]arr,int k){
        int  l =0,r =0,sum =0,maxlen = 0;
        while(r<arr.length-1){
            sum = sum+arr[r];
            if(sum>k){
                sum = sum-arr[l];
                l = l+1;
            }
            if(sum<=k){
                maxlen = Math.max(maxlen,r-l+1);
            }
            r++;
        }
        return maxlen;
    }
    public static void main(String[] args) {
        int []arr = {2,5,1,7,10};
        int k =14;
        System.out.println(longarr(arr,k));
    }
}
