package org.studyeasy.DAY42;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  25 4/25/2026 9:49 AM
 Project Name : 30Days_Java
 ***/
public class MoveZerofront {
    public static void movezeroes(int [] num){
        int slow = num.length-1;
        for(int fast = num.length-1;fast>=0;fast--){
            if(num[fast] != 0){
                int temp = num[slow];//put in front
                num[slow] = num[fast];
                num[fast] = temp;
                slow--;
            }
        }
    }
    public static void main(String[] args) {
        int [] num ={1,2,3,0,0,4,5,7,0,0,0,};
        movezeroes(num);
        for(int n : num){
            System.out.print(n +" ");
        }
    }
}
