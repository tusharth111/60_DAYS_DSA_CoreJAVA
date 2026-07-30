package org.studyeasy.DAY56;

import java.util.HashMap;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  30 7/30/2026 11:13 AM
 Project Name : 30Days_Java
 ***/
public class PermutationStr {
    public static boolean PermutationV1(String s1 , String s2){
        int n1 = s1.length();
        int n2 = s2.length();
        HashMap<Character,Integer> map1 = new HashMap<>();
        //Freq map of s1
        for(int i = 0;i<n1;i++){
            char ch = s1.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        HashMap<Character,Integer> map2 = new HashMap<>();
        //FIrst window in the s2 frequency map2
        for(int j = 0;j<n1;j++){
            char ch = s2.charAt(j);
            map2.put(ch, map2.getOrDefault(ch,0)+1);
        }
        if(map1.equals(map2)){
            return true;
        }
        for (int right = n1; right < n2; right++) {

            char lev = s2.charAt(right - n1); // n1 - n1| 2-2 |3-2|4-2|5-2|
            map2.put(lev,map2.get(lev)-1);
            if(map2.get(lev) == 0){
                map2.remove(lev);
            }
            //Add next
            char next = s2.charAt(right);
            map2.put(next,map2.getOrDefault(next,0)+1);
            if(map1.equals(map2)){
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(PermutationV1(s1,s2));
    }
}
