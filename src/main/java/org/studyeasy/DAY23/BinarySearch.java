package org.studyeasy.DAY23;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  07 1/7/2026 8:30 PM
 Project Name : 30Days_Java
 ***/
public class BinarySearch {
    static int search(int arr[],int x){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        while(start <= end){
            int m = start+(end-start)/2;
            if(arr[m] == x){
                return m;
            }
            if(arr[m]<x){
                start = m +1;
            }else {
                end = m -1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int x = 4;
        System.out.println(search(arr,x));

    }
}
