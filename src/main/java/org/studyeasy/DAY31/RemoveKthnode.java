package org.studyeasy.DAY31;

import com.sun.source.tree.BreakTree;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  15 1/15/2026 9:06 PM
 Project Name : 30Days_Java
 ***/
class Node3{
    int data;
    Node3 next;

    public Node3(int data) {
        this.data = data;
        this.next = null;
    }
}
public class RemoveKthnode {

    static void printList(Node3 head) {
        Node3 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    private static Node3 RemoveK(Node3 head, int k) {
        if(head == null|| k<=0){
            return head;

        }
        Node3 curr = head;
        Node3 prev = null;
        int count = 0;

        while(curr !=null){
            count++;

            if(count % k == 0){
                if(prev != null){
                    prev.next = curr.next;
                }else {
                    head = curr.next;
                }
            }else {
                prev = curr;
            }
            curr = curr.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Node3 head = new Node3(1);
        head.next = new Node3(2);
        head.next.next = new Node3(3);
        head.next.next.next = new Node3(4);
        head.next.next.next.next = new Node3(5);
        head.next.next.next.next.next = new Node3(6);
        int k = 2;
        head = RemoveK(head,k);
        printList(head);
    }
}
