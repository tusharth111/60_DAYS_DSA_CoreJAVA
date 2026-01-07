package org.studyeasy.DAY23;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  07 1/7/2026 8:27 PM
 Project Name : 30Days_Java
 ***/
public class LinearSearch {
    static int search(int arr[],int x){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr= {1,2,4,5,6,7};
        int key = 2;
        System.out.println(search(arr,key));
    }
}
