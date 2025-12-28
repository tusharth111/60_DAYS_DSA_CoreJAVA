package org.studyeasy.DAY13;

import java.util.Arrays;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  28 12/28/2025 8:20 PM
 Project Name : 30Days_Java
 ***/
public class ProductOfArray {
    public static int[] Product(int arr[]){

        int product = 1;
        int zeros = 0,idx=-1;
        int n = arr.length;
        for(int i =0;i<n;i++){
            if(arr[i]==0){
                zeros++;
                idx = i;
            }else{
                product*=arr[i];
            }
        }
        int[] res = new int[n];
        Arrays.fill(res,0);

        //if no zeroes , calculate the product for all elements
        if(zeros ==0) {
            for (int i = 0; i < n; i++) {
                res[i] = product / arr[i];
            }
        }
        // if one zero, set product only at the zero's index
        else if(zeros ==1){
            res[idx] = product;

        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {10,3,5,6,2};
        int result [] = Product(arr);
        System.out.println(Arrays.toString(result));
    }
}
