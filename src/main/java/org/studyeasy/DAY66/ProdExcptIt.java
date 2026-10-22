package org.studyeasy.DAY66;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  22 10/22/2026 8:49 PM
 Project Name : 30Days_Java
 ***/
public class ProdExcptIt {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int n = arr.length;
        int ans[] = new int[n];
        int prefix = 1;
        int suffix = 1;
        for (int i = 0; i < arr.length; i++) {
            ans[i] = prefix;
            prefix *= arr[i];
        }

        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= suffix;
            suffix *= arr[i];
        }
        for(int ns : ans){
            System.out.print(ns+",");
        }

    }

}
