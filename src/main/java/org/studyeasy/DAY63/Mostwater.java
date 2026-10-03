package org.studyeasy.DAY63;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  03 10/3/2026 9:03 PM
 Project Name : 30Days_Java
 ***/
public class Mostwater {
    public static int MaxWater(int []arr){
        int n = arr.length;
        int maxWater = 0;
        int left = 0;
        int right = n - 1;
        while(left < right){
                int currentWater =
                        Math.min(arr[left], arr[right]) * (right - left);
                maxWater = Math.max(maxWater,currentWater);
                if(arr[left] < arr[right]) {
                    left++;
                }else{
                    right--;
            }
            }
        return maxWater;
    }
    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(MaxWater(arr));
    }

}
