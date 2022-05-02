package com.practice.linkedList;

public class LinkedListOperations {

    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;
        }
    }

    void push(int data){
     Node newNode= new Node(data);
     newNode.next=head;
     head= newNode;
    }

    void printList(){
        Node currentNode=head;
        while(currentNode!=null){
            System.out.print(currentNode.data+" ");
            currentNode=currentNode.next;
        }
    }

    /* Find middle element of a link list*/
    public int findMiddle(){
        Node slow= head;
        Node fast= head;

        while(fast.next!=null ||fast!=null){
          slow=slow.next;
          fast=fast.next.next;
        }

        return slow.data;

    }

    public  Node reversePair(){
        return swapPairs(head);
    }

    public  Node swapPairs( Node head) {

        if (head==null ){
            return head;
        }

        Node curr= head;
        Node prev=null;
        Node nex= null;
        int count=2;
        while(curr!=null && count>0 ){
            nex=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nex;
            count--;
        }

        if(nex!=null){
head.next= swapPairs(nex);
        }

        return prev;
    }

    public  Node partitioning(){
return  partition(head, 3);
    }

    public Node partition(Node head, int x) {
         Node lowCurr = new Node(0);
         Node highCurr = new Node(0);
         Node lowHead = lowCurr;
        Node highHead = highCurr;
         Node curr= head;
         while(curr!=null){
             if(curr.data<x){
                lowCurr.next=curr;
                lowCurr= lowCurr.next;
             }
             if(curr.data>x){
                 highCurr.next=curr;
                 highCurr= highCurr.next;
             }

             curr=curr.next;
         }
         highCurr.next=null;
         lowCurr.next=highHead.next;

         return lowHead.next;
    }
    /**/

    public static void main(String[] args) {
        LinkedListOperations list = new LinkedListOperations();

        for (int i =0 ; i<5 ; i++){
            list.push(i);
        }

        list.printList();


        list.partitioning();

    }


}
