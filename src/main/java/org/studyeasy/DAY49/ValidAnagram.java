package org.studyeasy.DAY49;

import java.util.HashMap;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  17 7/17/2026 11:26 AM
 Project Name : 30Days_Java
 ***/
public class ValidAnagram {
    public static boolean ValidanagramV1(String s , String t){
        if(s.length() != t.length()){
            return false;
        }
        char []ss = s.toCharArray();//[a,b,c]
        char []tt = t.toCharArray();//[b,a,c]

        for(int i = 0;i<ss.length;i++){
            boolean found = false;
            for( int j = 0;j < tt.length;j++){
                if(ss[i] == tt[j]){
                    tt[j] = '*';
                    found = true;
                    break;
                }
            }
            if (!found){
                return false;
            }
        }
        return true;

    }
    public static boolean ValidanagramV2(String s , String t){
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        // Decrease frequency using t
        for (int i = 0; i < t.length(); i++) {

            char ch = t.charAt(i);

            if (!map.containsKey(ch)) {
                return false;
            }

            map.put(ch, map.get(ch) - 1);

            if (map.get(ch) == 0) {
                map.remove(ch);
            }
        }

        return map.isEmpty();

    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "bc";
        System.out.println(ValidanagramV1(s,t));

    }
}
