package org.studyeasy.DAY23;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  07 1/7/2026 8:50 PM
 Project Name : 30Days_Java
 ***/
public class FirstRepeatingEle {
    static int Repeating(int arr[]){
        for(int i = 0;i<arr.length;i++){
            for (int j = i+1;j < arr.length;j++){
                if(arr[i] == arr[j]){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,3,4,3,5,6};
        int index = Repeating(arr);
        if(index == -1){
            System.out.println("No repeating element");
        }else{
            System.out.println("First repeating element is "+ arr[index]);
        }

    }
}
