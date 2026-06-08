package org.studyeasy.DAY45;

import java.util.HashMap;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  24 5/24/2026 12:24 PM
 Project Name : 30Days_Java
 ***/
public class Anagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        if(s.length() != t.length()){
            System.out.println("false");
            return;
        }

        HashMap<Character,Integer> map = new HashMap<>();

        //count character of s string
        for(char c :s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        //Reduce the frequencey if the second string have the same character
        for(char c : t.toCharArray()){
            if(!map.containsKey(c)){// when the char is not in the hashmap subtract by 1
                System.out.println("false");
                return;
            }
            map.put(c,map.get(c)-1);

            if(map.get(c)<0){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
