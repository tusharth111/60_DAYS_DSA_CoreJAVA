package org.studyeasy.DAY8;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  23 12/23/2025 3:07 PM
 Project Name : 30Days_Java
 ***/
public class RemoveDuplicate {
    public static void main(String[] args) {
        int nums[] = {1,1,2,3,4,5,6};
        int l= 1;
        for (int r = 1; r < nums.length; r++) {
            if(nums[r]!=nums[r-1]){
                nums[l++]= nums[r];
            }
        }
        System.out.println(l);

    }
}
