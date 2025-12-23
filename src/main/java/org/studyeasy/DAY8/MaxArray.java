package org.studyeasy.DAY8;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  23 12/23/2025 8:23 PM
 Project Name : 30Days_Java
 ***/
public class MaxArray {
    static int  maxVal(int arr[]) {
        if (arr.length == 0) {
            return -1;
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    static int maxRange(int arr[], int start, int end){
        if(start > end){
            return -1;
        }
        if(start == end){
            return arr[start];
        }
        int maxval = arr[start];
        for(int i = start; i <= end; i++){
            if(arr[i] > maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,10,5,6,15,8};
        System.out.println(maxVal(arr));
        System.out.println(maxRange(arr,0,5));

    }
}
