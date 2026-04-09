package org.studyeasy.DAY41;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  09 4/9/2026 10:14 PM
 Project Name : 30Days_Java
 ***/
public class ValidPalindromeII {
    private static boolean validPalindrome(String s ){
        int l = 0;
        int r = s.length()-1;
        while (l<r){
            if(s.charAt(l) != s.charAt(r)){
                return isPalindrome(s,l+1,r) || isPalindrome(s,l,r-1);
            }
            l++;
            r--;
        }
        return true;
    }
    private static boolean isPalindrome(String s , int l , int r){
        while (l<r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "abca";
        System.out.println(validPalindrome(s));

    }
}
