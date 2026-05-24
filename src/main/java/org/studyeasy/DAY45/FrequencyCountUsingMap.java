package org.studyeasy.DAY45;

import java.util.HashMap;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  24 5/24/2026 12:46 PM
 Project Name : 30Days_Java
 ***/
public class FrequencyCountUsingMap {
    public static void main(String[] args) {
        String s = "banana";
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);

        }
        System.out.println(map);
    }
}
