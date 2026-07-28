package org.studyeasy.DAY54;

import java.util.HashMap;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  28 7/28/2026 11:40 AM
 Project Name : 30Days_Java
 ***/
public class LongestSubstringwithKdistictChar {
    public static int LongestSubstrwithKdistinctchar(String s , int k){
        int maxLen = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int left = 0;// index to remove the element from the substring
        for(int right = left ;right < s.length();right++){// traverse the string and addd in the hashmap
             char en = s.charAt(right); //get the right or next element
             map.put(en,map.getOrDefault(en,0)+1);// add the char in the map or increase the value or freq
             while(map.size() > k){
                 char rm = s.charAt(left);//get the left character
                 map.put(rm,map.get(rm)-1);//remove the character from the map or decrese the frequency
                 left++;
                 if(map.get(rm) == 0){
                     map.remove(rm);
                 }
             }
             maxLen = Math.max(maxLen,right-left+1);
        }
    return maxLen;
    }
    public static void main(String[] args) {
        String s = "eceba";
        int k = 2;
        System.out.println(LongestSubstrwithKdistinctchar(s,k));
    }
}
