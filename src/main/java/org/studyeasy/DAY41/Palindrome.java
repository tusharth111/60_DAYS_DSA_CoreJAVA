package org.studyeasy.DAY41;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  09 4/9/2026 9:48 PM
 Project Name : 30Days_Java
 ***/
public class Palindrome {
    public static String palindrome(int[]arr ){
        int l = 0;
        int r = arr.length-1;
        while(l<r) {
            if (arr[l] != arr[r])
            {
                return "Not palindrome";
            }else{
                l++;
                r--;
            }
        }
        return "palindrome";
    }
    public static void main(String[] args) {
        //String s = "RaceCar";
        int[] arr ={1,2,3,4,5,4,3,2,1};
        System.out.println(palindrome(arr));

    }
}
