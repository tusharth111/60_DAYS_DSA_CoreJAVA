package org.studyeasy.DAY51;

import java.util.HashMap;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  22 7/22/2026 10:53 AM
 Project Name : 30Days_Java
 ***/
public class PermutationString {
    public static boolean PermutationStrV1(String s1,String s2)
    {
        int len1 = s1.length();//window size
        int len2 = s2.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<len1;i++){
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        for(int i = 0;i<len1;i++){
            map1.put(s2.charAt(i),map1.getOrDefault(s2.charAt(i),0)+1);

        }
        if(map.equals(map1)){
            return true;
        }
        //rest of the window in the s2 string
        for(int i = len1;i<len2;i++){
            char lev = s2.charAt(i-len1);
            map1.put(lev,map1.get(lev)-1);//decrement the first charcter from the window
            if(map1.get(lev)== 0){
                map1.remove(lev);
            }
            char enter = s2.charAt(i);
            map1.put(enter,map1.getOrDefault(enter,0)+1);
            if(map1.equals(map)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s1 = "oo";
        String s2 = "eidaooo";
        System.out.println(PermutationStrV1(s1,s2));
    }
}
