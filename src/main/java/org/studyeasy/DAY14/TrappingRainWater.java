package org.studyeasy.DAY14;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  29 12/29/2025 12:48 PM
 Project Name : 30Days_Java
 ***/
public class TrappingRainWater {
    static int maxWater(int arr[]){
        int left = 1;
        int right = arr.length-2;
        int Lmax = arr[left-1];
        int Rmax = arr[right+1];
        int res = 0;
        while(left <= right){
            //if rmax is smaller , then we can decide the amount
            // of water for arr[right]
            if(Rmax <= Lmax){
                //add the water for arr[right]
                res+= Math.max(0,Rmax - arr[right]);
                //update the right max
                Rmax = Math.max(Rmax,arr[right]);
                // Update right pointer as we have decided the amount of water for this
                right -=1;
            }else{
                //add the water for arr[left]
                res += Math.max(0,Lmax -arr[left]);
                //update left max
                Lmax = Math.max(Lmax,arr[left]);
                //uopdate left pointer as we have decided water for this
                left +=1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr  = {2,1,5,3,1,0,4};
        System.out.println(maxWater(arr));
    }
}
