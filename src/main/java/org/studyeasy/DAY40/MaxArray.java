package org.studyeasy.DAY40;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  04 4/4/2026 11:24 PM
 Project Name : 30Days_Java
 ***/
public class MaxArray {
    public static void main(String[] args) {
        int []arr ={-1,-2,0,6,7,8};//negative values
        int max = arr[0];// first value set as max
        for(int i = 1;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);

    }
}
