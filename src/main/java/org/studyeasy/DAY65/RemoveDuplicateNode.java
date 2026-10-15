package org.studyeasy.DAY65;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  13 10/13/2026 9:02 PM
 Project Name : 30Days_Java
 ***/
public class RemoveDuplicateNode {
    public static void main(String[] args) {


        Node f1 = new Node();
        Node f2 = new Node();
        Node f3 = new Node();
        Node f4 = new Node();
        Node f5 = new Node();
        Node head = f1;
        Node current = head;
        f1.data = 1;
        f1.next = f2;

        f2.data = 2;
        f2.next = f3;

        f3.data = 2;
        f3.next = f4;

        f4.data = 3;
        f4.next = f5;

        f5.data = 4;
        f5.next = null;
        while (current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        Node traverse = head;
        while (traverse != null) {
            System.out.print(traverse.data + " -> ");
            traverse = traverse.next;
        }
    }
}
