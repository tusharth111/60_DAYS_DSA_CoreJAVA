package org.studyeasy.DAY46;

import java.util.HashMap;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  08 6/8/2026 9:16 PM
 Project Name : 30Days_Java
 ***/
public class Frequency {
    public static void main(String[] args) {
        String s = "loveee";
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
                map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
    }
}
