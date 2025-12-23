package org.studyeasy.DAY8;

import java.util.Scanner;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  23 12/23/2025 9:00 PM
 Project Name : 30Days_Java
 ***/
public class OccurenceArr {
    public static void main(String[] args) {
        int arr[] = {1,2,5,7,8,44,2,2,1,5,6};
        int num = 2;
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                count++;
            }
        }
        System.out.println(count);
    }
}
