package org.studyeasy.DAY51;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  21 7/21/2026 12:14 PM
 Project Name : 30Days_Java
 ***/
public class maxvowelInKsubstring {
    public static int maxvowelInKsubstringV1(String s ,int k){
        int len = s.length();
        if(len == 0){
            return 0;
        }
        int max=0;
        for(int i = 0; i<len-k+1;i++){//outer loop for
            int count = 0;
            for(int j = i;j<k+i;j++){//to run till the fizxed length of the substring
                if(s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'o' || s.charAt(j) == 'u' )
                {
                    count++;
                }

            }
            max = Math.max(count,max);
        }
        return max;
    }
    public static int maxvowelInKsubstringV2(String s ,int k){
        int len = s.length();
        if(len == 0){
            return 0;
        }
        int max=0;
        int count =0;
        int left = 0;
        // loop for first window
        for(int i = 0;i<k;i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' )
            {
                count++;
            }

        }
        max = Math.max(count,max);
        //for the rest of the windows

        for(int j = k; j<len; j++){
            if(s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'o' || s.charAt(j) == 'u' )
            {
                count++;
            }
            if(s.charAt(left) == 'a' || s.charAt(left) == 'e' || s.charAt(left) == 'i' || s.charAt(left) == 'o' || s.charAt(left) == 'u'){
                count--;

            }
            left++;
            max = Math.max(count,max);
        }


        return max;
    }
    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        System.out.println(maxvowelInKsubstringV1(s,k));
    }
}
