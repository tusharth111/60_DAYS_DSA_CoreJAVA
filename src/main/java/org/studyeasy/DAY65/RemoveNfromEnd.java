package org.studyeasy.DAY65;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  11 10/11/2026 8:27 PM
 Project Name : 30Days_Java
 ***/
public class RemoveNfromEnd {
    public static void main(String[] args) {
        int n = 2;// which node to remove from the end so it means node 4
        Node head = new Node();
        Node f1 = new Node();
        Node f2 = new Node();
        Node f3 = new Node();
        Node f4 = new Node();
        Node f5 = new Node();
        Node dummy = head;


        Node fast = dummy;// pointers
        Node slow = dummy;// pointers

        dummy.next = f1;
        f1.data = 1;
        f1.next = f2;

        f2.data = 2;
        f2.next = f3;

        f3.data = 3;
        f3.next = f4;

        f4.data = 4;
        f4.next = f5;

        f5.data = 5;
        f5.next = null;
        //run the pointer to the n th value in linked list
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        // then we run the pointer for one node at a time untill the end of the linked list
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        //then we can remove the nth node which is at the fast pointer
        slow.next = slow.next.next;

        // to print the value of the linked list
        Node current = dummy.next;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");

    }
}
