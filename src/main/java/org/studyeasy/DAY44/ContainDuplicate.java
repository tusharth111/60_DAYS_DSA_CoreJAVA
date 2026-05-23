package org.studyeasy.DAY44;

import java.util.HashSet;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  23 5/23/2026 10:51 AM
 Project Name : 30Days_Java
 ***/
public class ContainDuplicate {
    public static void main(String[] args) {
        int arr[] = {1,1,3,2,2,3,4,5,5,6,7,8};
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<arr.length;i++){
            if(set.contains(arr[i])){
                System.out.print("this already exists"+arr[i]+"\n");
            }
            set.add(arr[i]);
        }
        System.out.println(set);
        System.out.println(set.size());
    }
}
