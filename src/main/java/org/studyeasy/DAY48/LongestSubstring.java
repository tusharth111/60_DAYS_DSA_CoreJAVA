package org.studyeasy.DAY48;

import java.util.HashSet;

import static java.lang.Math.max;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  16 7/16/2026 10:21 AM
 Project Name : 30Days_Java
 ***/
public class LongestSubstring {
    public static int LongestSubstringLenV1(String str){
        int maxlength = 0;
        int n = str.length();
        for(int i = 0;i<n;i++){//try every starting index
            for(int j = i;j<n;j++){
                boolean duplicate = false;

                //check if str.charAt(j) already exists
                //in the current substring
                for(int k = i ;k<j;k++){
                    if(str.charAt(k)== str.charAt(j)){
                        duplicate = true;
                        break;
                    }
                }
                if(duplicate){
                    break;
                }
                int currentLength = j-i+1;
                maxlength = Math.max(maxlength,currentLength);
            }
        }
        return maxlength;
    }
    public static int LongestSubstringLenV2(String str){
        int maxLength = 0;
        int n= str.length();
        HashSet<Character> set = new HashSet<>();
        int left = 0;// left starting
            for(int right = left;right<n;right++)
            {
                char ch = str.charAt(right);
                while(set.contains(ch)){
                    set.remove(ch);
                    left++;
                }
                set.add(ch);
                maxLength = max(right-left+1,maxLength);
            }
        return maxLength;
    }
    public static void main(String[] args) {
        String str = "abcabcdeab";
        System.out.println(LongestSubstringLenV2(str));

    }
}
