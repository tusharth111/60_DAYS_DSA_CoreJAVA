package org.studyeasy.DAY42;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  25 4/25/2026 9:53 AM
 Project Name : 30Days_Java
 ***/
public class moveZeroLast {
    public static void moveLast(int [] num) {
        int slow = 0;
        for (int fast = 0;fast< num.length; fast++) {
            if (num[fast] != 0) {
                if(slow != fast){
                    int temp = num[slow];
                    num[slow] = num[fast];
                    num[fast] = temp;
                }
                slow++;
            }
        }
    }
    public static void main(String[] args) {
        int[] num = {0,0,0,0,0,2,3,4,5,6};
        moveLast(num);
        for(int n : num){
            System.out.print(n+" ");
        }
    }
}
