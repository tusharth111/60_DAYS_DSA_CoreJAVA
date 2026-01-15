package org.studyeasy.DAY31;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  15 1/15/2026 8:52 PM
 Project Name : 30Days_Java
 ***/
public class InsertionSort {
    public static void Sort(int arr[]){
        int n = arr.length;
        for(int i =1 ;i<n;++i){
            int k = arr[i];
            int j = i -1;
            //Move elements of arr[0 .. i-1], that are
            //greater than key, to one position ahead
            //of their current position
            while(j >=0 && arr[j] > k){
                arr[j+1] = arr[j];
                j = j-1;

            }
            arr[j+1] = k;
        }
    }
    public static void main(String[] args) {
        int arr[] = {12,11,1,4,2,89};
        Sort(arr);
        int n = arr.length;
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
