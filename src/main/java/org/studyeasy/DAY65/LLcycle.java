package org.studyeasy.DAY65;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  08 10/8/2026 8:55 PM
 Project Name : 30Days_Java
 ***/

public class LLcycle {
    public static Boolean CycleNode(Node head) {
        Node slow = head;
        Node fast = head;//both pointers are traversing from the starting node so we point to head
        while (fast != null && fast.next != null) {
            slow = slow.next;// go slow by one node each turn
            fast = fast.next.next;// go fast two nodes each turn
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {


        Node head = new Node();
        Node second = new Node();
        Node third = new Node();
        Node fourth = new Node();
        head.data = 10;
        head.next = second;

        second.data = 20;
        second.next = third;

        third.data = 30;
        third.next = fourth;

        fourth.data = 40;
        fourth.next = second;


        System.out.print(CycleNode(head));// we passed head since we arr using head to traverse accross the nodes
    }
}


