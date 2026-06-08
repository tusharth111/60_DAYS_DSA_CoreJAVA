package org.studyeasy.DAY46;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  08 6/8/2026 9:39 PM
 Project Name : 30Days_Java
 ***/
public class LargestNumStream {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,32,4,5,5,6,11,12);
        Integer max = nums.stream().max(Comparator.naturalOrder()).orElse(null);

        System.out.println(max);
    }
}
