package org.studyeasy.DAY65;

import java.util.LinkedList;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  09 10/9/2026 9:37 PM
 Project Name : 30Days_Java
 ***/

public class MergerLL {
    public static void main(String[] args) {
        // First sorted linked list: 1 -> 3 -> 5
        Node f1 = new Node();
        Node f2 = new Node();
        Node f3 = new Node();

        f1.data = 1;
        f1.next = f2;

        f2.data = 3;
        f2.next = f3;

        f3.data = 5;
        f3.next = null;

        // Second sorted linked list: 2 -> 4 -> 6
        Node d1 = new Node();
        Node d2 = new Node();
        Node d3 = new Node();

        d1.data = 2;
        d1.next = d2;

        d2.data = 4;
        d2.next = d3;

        d3.data = 6;
        d3.next = null;

        Node current1 = f1;
        Node current2 = d1;

        // Dummy node simplifies building the merged list
        Node dummy = new Node();
        Node tail = dummy;

        while (current1 != null && current2 != null) {

            if (current1.data <= current2.data) {
                tail.next = current1;
                current1 = current1.next;
            } else {
                tail.next = current2;
                current2 = current2.next;
            }

            tail = tail.next;
        }

        // Attach whichever list still has remaining nodes
        if (current1 != null) {
            tail.next = current1;
        } else {
            tail.next = current2;
        }

        // Print merged linked list
        Node result = dummy.next;

        while (result != null) {
            System.out.print(result.data);

            if (result.next != null) {
                System.out.print(" -> ");
            }

            result = result.next;
        }

        System.out.println(" -> null");
    }

}

