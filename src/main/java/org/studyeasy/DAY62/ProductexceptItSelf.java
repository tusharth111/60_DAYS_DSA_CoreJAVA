package org.studyeasy.DAY62;

import java.util.Arrays;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  30 9/30/2026 8:27 PM
 Project Name : 30Days_Java
 ***/
public class ProductexceptItSelf {
    public static int[] productAns(int [] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Arrays.fill(ans, 1);
        // to store the product of the element in the array except it self
        int left = 1;
        //get the product of the array left of index

        for(int i = 0; i<n; i++){
            ans[i] *= left;
            left *= arr[i];
        }
        //right of the index i
        int right = 1;
        for(int j = n-1;j>=0;j--){
            ans[j] *= right;
            right = right * arr[j];
        }

    return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.print(Arrays.toString(productAns(arr)));

    }
}
