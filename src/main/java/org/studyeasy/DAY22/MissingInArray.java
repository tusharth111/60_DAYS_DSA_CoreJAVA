package org.studyeasy.DAY22;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  06 1/6/2026 8:52 PM
 Project Name : 30Days_Java
 ***/
public class MissingInArray {
    static int missing(int arr[]){
        int n = arr.length + 1;

        // Iterate from 1 to n and check
        // if the current number is present
        for (int i = 1; i <= n; i++) {
            boolean found = false;
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }

            // If the current number is not present
            if (!found)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,5,6,7};
        System.out.println(missing(arr));

    }
}
