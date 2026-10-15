package org.studyeasy.DAY66;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  15 10/15/2026 8:47 PM
 Project Name : 30Days_Java
 ***/
public class ZerotoEnd {
    public static void zeroE(int [] arr){
        int n  = arr.length;
        int j = 0;
        for(int i = 0;i<n;i++){
            if(arr[i] != 0){
                if(j != i){
                    // we will swap the values'
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }

        }

    }
    public static void main(String[] args) {
        int [] arr = {0,7,0,2,4};
        zeroE(arr);
        for(int n : arr){
            System.out.print(n+" ");
        }

    }
}
