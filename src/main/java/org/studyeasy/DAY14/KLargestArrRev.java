package org.studyeasy.DAY14;

import java.util.Scanner;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  29 12/29/2025 8:58 PM
 Project Name : 30Days_Java
 ***/
public class KLargestArrRev {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Emter number of element in a array");
        int n = sc.nextInt();

        int nums[] = new int[n];
        System.out.print("Enter the element in the array: ");
        for(int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter the k th element: ");
        int k = sc.nextInt();
        KLargestArrRev obj = new KLargestArrRev();
        int result = obj.findkelement(nums,k);
        System.out.println(k+ " Largest elements is "+ result);

    }
    private  int findkelement(int nums[],int k){
        int targetIndex = nums.length -k;
        return QuickSelct(nums,0,nums.length-1,targetIndex);
    }

    private static int QuickSelct(int[] nums, int left, int right, int k) {
        if(left == right){
            return nums[left];
        }
        int pivotIndex = partition(nums,left,right);
        if(pivotIndex == k){
            return nums[pivotIndex];
        } else if (pivotIndex < k) {
            return QuickSelct(nums,pivotIndex+1,right,k);
        }
        else{
            return QuickSelct(nums,left,pivotIndex-1,k);
        }
    }

    private static int partition(int[] nums, int left, int right) {
        int pivot = nums[right];
        int i=left;
        for( int j = left;j< right;j++){
            if(nums[j]<= pivot){
                swapR(nums,i,j);
                i++;
            }
        }
        swapR(nums,i,right);
        return i;
    }
    private static void  swapR(int [] nums,int i ,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
