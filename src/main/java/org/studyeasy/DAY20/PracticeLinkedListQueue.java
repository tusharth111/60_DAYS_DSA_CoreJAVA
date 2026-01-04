package org.studyeasy.DAY20;

import java.util.LinkedList;
import java.util.Queue;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  04 1/4/2026 11:48 AM
 Project Name : 30Days_Java
 ***/
public class PracticeLinkedListQueue {
    public static void main(String[] args) {
        Queue<String> lk = new LinkedList<>();
        lk.add("Tushar");
        lk.add("Thakur");
        lk.add("Riya");
//        String firstName = lk.poll();//remove the first element i have added in the queue or in this case linkedList
//        String lastName = lk.remove();//remove the second element after the poll() call
//        System.out.println(firstName+" "+lastName);
//        System.out.println(lk);//print all the elements in the queue
//        System.out.println(lk.size());
//        System.out.println(lk.peek());//get the first element in the queue does not throw exception when queue is empty
//        System.out.println(lk.element());// this worka same as the peek() method it returns the first element in the queue will throw exception when queue is empty
//        lk.remove();//remove the elements from the head of the queue which is "tushar"
//        System.out.println(lk.peek());
//        //lk.clear();//this will remove all the elements from the queue
//        System.out.println(lk);
//        System.out.println(lk.size());//this is used to get the  number of elements stored in the queue
//        System.out.println(lk.contains("Tushar"));//check if the queue has the element in it and return a boolean value
        //access via new for loop
        for(String element :lk){
            System.out.println(lk);
        }
    }
}
