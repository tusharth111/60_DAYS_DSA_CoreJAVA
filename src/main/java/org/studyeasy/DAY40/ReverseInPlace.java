package org.studyeasy.DAY40;

import java.util.Arrays;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  07 4/7/2026 10:07 PM
 Project Name : 30Days_Java
 ***/
public class ReverseInPlace {
    public static int[] Reverse(int[] arr){
        int temp ;
        int L = 0;
        int R = arr.length-1;
        while(L<=R){
            temp = arr[L];
            arr[L] = arr[R];
            arr[R] = temp;
            L++;
            R--;


        }
        return arr;

    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(Reverse(arr)));
    }
}
//Time complexity as o(n)
//space complexity as O(1)