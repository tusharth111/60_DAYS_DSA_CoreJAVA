package org.studyeasy.DAY53;

import java.util.HashSet;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  25 7/25/2026 9:19 PM
 Project Name : 30Days_Java
 ***/
public class LongestSubstrwithOutRepeating {
    public static int LongestSubstrRepeatV1(String str){
        int n = str.length();
        int maxLen = 0;
        for(int i = 0;i<n;i++){
            for(int j = i;j<n;j++){
                boolean duplicate = false;

                for(int k  = i ;k<j;k++){
                    if(str.charAt(k) == str.charAt(j)){
                        duplicate = true;
                        break;
                    }
                }
                if(duplicate){
                    break;
                }
                int currentLength = j-i+1;
                maxLen = Math.max(maxLen,currentLength);
            }
        }
        return maxLen;
    }
    public static int LongestSubstrRepeatV2(String str){
        int maxlen = 0;
        int n = str.length();
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        for (int right = left; right < n; right++) {//traverse the string
            char ch = str.charAt(right);
            while (set.contains(ch)){
                char rm = str.charAt(left);
                set.remove(rm);
                left++;
            }
            set.add(ch);
            maxlen = Math.max(right-left+1,maxlen);
        }
        return maxlen;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(LongestSubstrRepeatV2(str));

    }
}
