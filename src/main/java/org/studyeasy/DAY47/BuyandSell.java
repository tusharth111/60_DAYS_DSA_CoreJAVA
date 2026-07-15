package org.studyeasy.DAY47;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  15 7/15/2026 11:57 AM
 Project Name : 30Days_Java
 ***/
public class BuyandSell {
    public static int profit(int price[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        if(price.length == 0 ){
            return 0;
        }
        for (int i = 0; i < price.length; i++) {
            if (price[i] < minprice) {
                minprice = price[i];
            } else if ((price[i] - minprice) > maxprofit) {
                maxprofit = price[i] - minprice;
            }

        }
        return maxprofit;
    }
        public static void main (String[]args){
            int[] price = {7, 1, 5, 3, 6, 4};
            System.out.println(profit(price));
        }

}
