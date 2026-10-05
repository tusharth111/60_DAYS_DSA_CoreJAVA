package org.studyeasy.DAY64;

import java.util.LinkedList;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  05 10/5/2026 8:23 PM
 Project Name : 30Days_Java
 ***/
class Node{
    int data;
    Node next;


}
public class ReverseLL {

    public static void main(String[] args) {
        Node head = new Node();//pointing to the first node
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
        fourth.next = null;
        Node previous = null;
        Node current = head;//use current to traverse the linked list

        while (current != null) {
            Node next = current.next;  // save next
            current.next = previous;   // reverse link
            previous = current;        // move previous
            current = next;

        }
        System.out.println("Reversed Linked List:");
        Node temp = previous;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}