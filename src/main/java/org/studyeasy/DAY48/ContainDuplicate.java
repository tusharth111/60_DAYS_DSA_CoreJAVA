package org.studyeasy.DAY48;

import java.util.HashSet;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  16 7/16/2026 8:41 PM
 Project Name : 30Days_Java
 ***/
public class ContainDuplicate {
    public static boolean DuplicateV1( int []arr){
        int n= arr.length;
        if(arr == null || n == 1){
            return false;
        }
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    return true;

                }
            }
        }
        return false;
    }
    public static boolean DuplicateV2( int []arr){
        int n= arr.length;
        if(arr == null || n == 1){
            return false;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<n;i++)
        {
            if(set.contains(arr[i])){
                return true;
            }
            set.add(arr[i]);

        }
        return false;
    }

    public static void main(String[] args) {
        int []arr = {1,2,3,4};
        System.out.println(DuplicateV2(arr));

    }
}
