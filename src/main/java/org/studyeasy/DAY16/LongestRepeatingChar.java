package org.studyeasy.DAY16;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  31 12/31/2025 8:13 PM
 Project Name : 30Days_Java
 ***/
public class LongestRepeatingChar {
    public static char Repeatingchar(String str) {
        int n = str.length();
        int maxCnt = 0;
        char res = str.charAt(0);
        int cnt = 1;
        for (int i = 1; i < n; i++) {
            if (str.charAt(i) == str.charAt(i-1)) {
                    cnt++;
                }
               else {
                   cnt=1;
            }

            //update the maxcount
            if (cnt > maxCnt) {
                maxCnt = cnt;
                res = str.charAt(i-1);//the previous value.
            }

        }
        return res;
    }
    public static void main(String[] args) {
        String str = "abbb";
        System.out.println(Repeatingchar(str));

    }
}
