package org.studyeasy.DAY33;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  20 1/20/2026 8:18 PM
 Project Name : 30Days_Java
 ***/
public class TwopointerPalindrome {
    static boolean palindrome(String s){
        int left= 0;
        int right = s.length()-1;

        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "racecar";
        boolean isPalindrome =palindrome(s.toLowerCase());
        if(isPalindrome){
            System.out.println("it is a palindrome string");
        }else {
            System.out.println("It is not a palindrome");
        }


    }
}
