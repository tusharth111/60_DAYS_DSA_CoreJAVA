package org.studyeasy.DAY62;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  27 9/27/2026 8:58 PM
 Project Name : 30Days_Java
 ***/
public class Tradealgo {
    public static int tradeprofit(int [] arr){
        int n = arr.length;
        int maxProfit = 0;
        int minPrice = arr[0];
        for(int i = 0;i<n;i++){
            int profit = arr[i] - minPrice;
            maxProfit = Math.max(profit,maxProfit);//update the maxProfit
            minPrice = Math.min(arr[i],minPrice);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int [] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(tradeprofit(arr));

    }
}
