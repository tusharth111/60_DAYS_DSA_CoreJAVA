package org.studyeasy.DAY52;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  23 7/23/2026 9:47 PM
 Project Name : 30Days_Java
 ***/
public class AnagraminStringindex {
    public static List<Integer> FirstIndexOfAnagramInStringV1(String p,String s){
        int len1= s.length();
        int len2= p.length();
        List<Integer> ans = new ArrayList<>();
        HashMap<Character,Integer> map1 = new HashMap<>();
        for(char c :  p.toCharArray()){// frequency map count of p
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        //First window
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i = 0;i<len2;i++){
            char c = s.charAt(i);
            map2.put(c,map2.getOrDefault(c,0)+1);
        }
        if(map1.equals(map2)){
            ans.add(0);// to add the starting index of ths first window and the starting window first idnex will alwayys be 0
        }
        //Sliding Window
        for(int i  = len2;i<len1;i++){
            char lev = s.charAt(i-len2);
            map2.put(lev,map2.get(lev)-1);// remove the frequency if the character are same
            if(map2.get(lev)== 0){
                map2.remove(lev);
            }
            char enter = s.charAt(i);
            map2.put(enter,map2.getOrDefault(enter,0)+1);
            if(map1.equals(map2)){
                ans.add(i-len2+1);
            }


        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "cbacbabacd";
        String p = "abc";
        System.out.println(FirstIndexOfAnagramInStringV1(p,s));
    }
}
