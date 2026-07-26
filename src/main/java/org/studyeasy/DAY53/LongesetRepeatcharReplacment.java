package org.studyeasy.DAY53;

import java.util.HashMap;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  26 7/26/2026 1:03 PM
 Project Name : 30Days_Java
 ***/
public class LongesetRepeatcharReplacment {
    public static int LongestReplacemetSubstrV1(String s, int k ){
        int n = s.length();
        int maxFreq= 0;
        int maxlen = 0;
        int left = 0;
        HashMap<Character,Integer> freq = new HashMap<>();
        for (int right = left; right< n; right++)
        {
            char ch  = s.charAt(right);
            freq.put(ch,freq.getOrDefault(ch,0)+1);
            maxFreq = Math.max(maxFreq,freq.get(ch));

            while((right-left +1) - maxFreq > k){
                char rem = s.charAt(left);
                freq.put(rem,freq.get(rem)-1);
                if(freq.get(rem) == 0){
                    freq.remove(rem);
                }
                left++;
            }
        maxlen = Math.max(maxlen,right -left+1);

        }
        return maxlen;
    }
    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;
        System.out.println(LongestReplacemetSubstrV1(s,k));
    }
}
