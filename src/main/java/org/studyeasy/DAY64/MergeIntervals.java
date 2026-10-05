package org.studyeasy.DAY64;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  04 10/4/2026 8:58 PM
 Project Name : 30Days_Java
 ***/
public class MergeIntervals {
    public static int[][] merge(int [][] arr){
        int n = arr.length;
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();
        int start = arr[0][0];//first elemeent of the first interval
        int end = arr[0][1];//sedond elemnent of the first interval
        for (int i = 1; i < n ; i++) {
            int nextstart = arr[i][0];//first elment  of the next interval
            int nextEnd = arr[i][1];//second element of the next interval
            if(nextstart <= end){
                end = Math.max(end , nextEnd);//get the max of the end and nextend intervals end
            }else{// not overlapping
                result.add(new int[]{start,end});//add the start and end to the result list
                start = nextstart;//update the start to the next start
                end = nextEnd;//update the end to the next end
            }
        }
        result.add(new int[]{start,end});
        return result.toArray(new int[result.size()][]);
    }
    public static void main(String[] args) {
        int[][] arr ={{1,3},
                      {2,6},
                      {8,10},
                      {9,12}};//2D array
        int[][] mergedIntervals = merge(arr);
        System.out.println("Merged Intervals :");
        for (int[] interval : mergedIntervals) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
