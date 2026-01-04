package org.studyeasy.DAY20;
import java.util.PriorityQueue;
import java.util.Queue;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  04 1/4/2026 11:43 AM
 Project Name : 30Days_Java
 ***/
public class PracticeQueue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();

        //adding elements to the priority Queue
        pq.add(10);
        pq.add(40);
        pq.add(20);
        pq.add(30);

        System.out.println("Priority Queue elements "+pq);
    }
}
