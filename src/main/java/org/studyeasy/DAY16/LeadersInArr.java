package org.studyeasy.DAY16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  31 12/31/2025 8:47 PM
 Project Name : 30Days_Java
 ***/
public class LeadersInArr {
    static ArrayList<Integer> leaders(int arr[]){
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        int maxRight = arr[n-1];//last element is always the leader
        result.add(maxRight);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=maxRight){
                maxRight = arr[i];
                result.add(maxRight);
            }
        }
        Collections.reverse(result);
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {17,14,3,5,2};
        ArrayList<Integer> result = leaders(arr);
        for(int res : result){
            System.out.print(res+" ");
        }
        System.out.println();

    }
}
