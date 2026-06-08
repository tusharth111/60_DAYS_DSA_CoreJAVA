package org.studyeasy.DAY46;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  08 6/8/2026 9:46 PM
 Project Name : 30Days_Java
 ***/
public class SecondHighNum {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10,20,30,40,50,60);
        Integer secMax = nums.stream().distinct().sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                    .orElse(null);
        System.out.println(secMax);
    }
}
