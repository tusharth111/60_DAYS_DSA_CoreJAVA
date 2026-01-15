package org.studyeasy.DAY31;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  15 1/15/2026 8:57 PM
 Project Name : 30Days_Java
 ***/
class Node2{
    int data;// the data
    Node2 next;// the pointer

    public Node2(int data) {
        this.data = data;
        this.next = null;
    }
}
public class OccurenceInLL {
    public static void main(String[] args)
    {
        Node2 head = new Node2(10);
        head.next = new Node2(20);
        head.next.next = new Node2(10);
        head.next.next.next = new Node2(10);
        head.next.next.next.next = new Node2(90);

        int key = 10;
        System.out.println(CountLL(head,key));

    }
    // function to find the count of the given key in the Linked List
    private static int CountLL(Node2 head, int key) {
        Node2 curr = head;
        int count = 0;
        while(curr!= null){
            if(curr.data == key){
                count++;
            }
            curr = curr.next;
        }
        return count;
    }
}
