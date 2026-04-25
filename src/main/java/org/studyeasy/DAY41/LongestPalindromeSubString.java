package org.studyeasy.DAY41;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  10 4/10/2026 3:46 PM
 Project Name : 30Days_Java
 ***/
public class LongestPalindromeSubString {
    private static String Substring(String s){
        int start = 0;
        int maxLen = 1;//best
        for(int i = 0;i<s.length();i++){
            int len1 = expand(s,i,i);//odd
            int len2 = expand(s,i,i+1);//even

            int len = Math.max(len1,len2);

            if(len > maxLen){
                maxLen = len;
                start = i-(len-1)/2;
            }
        }
        return s.substring(start,start + maxLen);
    }
    private static int expand(String s,int L , int R){
        while(L>=0 && R<s.length() && s.charAt(L) == s.charAt(R)){
            L--;//stretch left
            R++;//stretch right
        }
        return R-L-1;
    }
    public static void main(String[] args) {
        String s = "tututye";
        System.out.println(Substring(s));


    }
}
