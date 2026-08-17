package org.studyeasy.DAY60;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  17 8/17/2026 8:38 PM
 Project Name : 30Days_Java
 ***/
public class BestTimeBuySell {
    public static int BestSell(int[] prices){
        int minPrice = prices[0];// first min price in the array we take by default
        int maxProfit = 0;//set the maxProfit at the start element
        for(int i =1; i<prices.length;i++){
            int profit = prices[i] - minPrice;//calculte the profit by subtraction
            maxProfit = Math.max(maxProfit,profit);//Update the maxProfit by using max in between profit we calculated and maxProfit we have currently.

            minPrice = Math.min(minPrice,prices[i]);//update the minPrice if the current element is smaller than then minPrice
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        System.out.println(BestSell(prices));
        // call the function 
    }
}
