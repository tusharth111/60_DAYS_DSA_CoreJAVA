package org.studyeasy.DAY42;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  25 4/25/2026 9:40 AM
 Project Name : 30Days_Java
 ***/
public class Duplicate {
    public static int remDuplicate(int [] num){
        if(num.length == 0)return  0;

        int slow = 0;
        for(int fast = 1;fast< num.length;fast++){
            if(num[fast] != num[slow]){
                slow++;
                num[slow] = num[fast];
            }
        }
        return slow+1;//range
    }
    public static void main(String[] args) {
        int[] num = {1,1,2,3,3,4,4};
        int k = remDuplicate(num);

        for(int i = 0;i<k;i++){
            System.out.print(num[i]+" ");
        }
    }
}
