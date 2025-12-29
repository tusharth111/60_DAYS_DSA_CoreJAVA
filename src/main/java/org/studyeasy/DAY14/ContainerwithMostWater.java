package org.studyeasy.DAY14;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  29 12/29/2025 12:01 PM
 Project Name : 30Days_Java
 ***/
public class ContainerwithMostWater {
    static int maxWaterIn(int arr[]){
        int left = 0,right = arr.length-1;
        int res = 0;
        while(left<right){
            //find the water stored in the containers between the arr[left]
            // and arr[right]
            int water = Math.min(arr[left],arr[right]) * (right -left);
            res = Math.max(res,water);
            if(arr[left]<arr[right]){
                left+=1;
            }
            else{
                right-=1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {2,1,8,6,4,6,5,5};
        System.out.println(maxWaterIn(arr));

    }
}
