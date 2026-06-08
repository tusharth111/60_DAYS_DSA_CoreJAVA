package org.studyeasy.DAY46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  08 6/8/2026 9:32 PM
 Project Name : 30Days_Java
 ***/
public class EvenNumStream {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);
        List<Integer> res = nums.stream().filter(num ->num % 2==0).toList();
        System.out.println(res);
    }
}
