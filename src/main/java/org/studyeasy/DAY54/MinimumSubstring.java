package org.studyeasy.DAY54;

import java.util.HashMap;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  29 7/29/2026 12:25 PM
 Project Name : 30Days_Java
 ***/
public class MinimumSubstring {
    public static String MinimumSubstr(String s, String t){
        HashMap<Character,Integer> TargetFreq =new HashMap<>();
        int matched = 0;
        int minLen = Integer.MAX_VALUE;
        int start  =0;
        for(int i  = 0;i<t.length();i++)
        {
            char ch = t.charAt(i);
            TargetFreq.put(ch,TargetFreq.getOrDefault(ch,0)+1);// it is used to create freqe map for t string which is our target string
        }
        HashMap<Character,Integer> windowFreq = new HashMap<>();
        int left = 0;
        for(int right = left;right < s.length();right++){
            char en = s.charAt(right);
            windowFreq.put(en,windowFreq.getOrDefault(en,0)+1);
            if(TargetFreq.containsKey(en)){
                if(windowFreq.get(en) == TargetFreq.get(en)){//only when we satisfy the frequecny inthe target
                    matched++;
                }
            }
            while (matched == TargetFreq.size()) // untill we have not the required element equal tothe matched variable we will keep on shrink it
            {
                if(right -left +1 <minLen){
                    minLen = right-left +1;
                    start = left;
                }
                char rm = s.charAt(left);
                windowFreq.put(rm,windowFreq.get(rm)-1);
                left++;
                if(TargetFreq.containsKey(rm)){
                    if(windowFreq.get(rm) < TargetFreq.get(rm)){
                        matched--;
                    }
                }
            }
        }
        if (minLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLen);
    }
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(MinimumSubstr(s,t));
    }
}
