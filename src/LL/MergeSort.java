package LL;

import java.util.Scanner;

public class MergeSort {
   public Node root;
    private class Node{
        int data;Node next;
        Node(int data){
            this.data=data;
           // next=null;
        }


    }

    Node MergeSort(Node node){
        if(node==null||node.next==null){
            return node;
        }

        Node middle=middle(node);
        Node middlenext=middle.next;
        middle.next=null;
       Node start= MergeSort(node);
       Node end=MergeSort(middlenext);
       Node sort=sortList(start,end);
        return sort;

    }

    private Node sortList(Node start, Node end) {

        Node temp=null;
        if(start==null){
            return end;
        }
        if(end==null){
            return start;
        }

        if(start.data<=end.data){
           temp=start;
            temp.next=sortList(start.next,end);

        }
        else{
            temp=end;
            temp.next=sortList(start,end.next);

        }
        return temp;
    }


//    private Node middle(Node node) {
//
//    if(node==null){
//        return node;
//    }
//    Node fast=node;
//    Node slow=node;
//    while(fast!=null&&fast.next!=null){
//        fast=fast.next.next;
//        slow=slow.next;
//    }
//    return slow;
//
//
//
//
// }
    private Node middle(Node node){
        if(node==null){
            return node;
        }
        Node fast=node.next;
        Node slow=node;

        while(fast!=null){
            fast=fast.next;
            if(fast!=null){
                fast=fast.next;
                slow=slow.next;
            }


        }
        return slow;



    }
    void push(){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        for(int i=0;i<size;i++){
            int data=sc.nextInt();
            Node newNode=new Node(data);
            newNode.next=root;
            root=newNode;
        }

    }
    void print(Node node){
        while(node!=null){
            System.out.print(node.data+" ");
            node=node.next;
        }
    }

    public static void main(String[] args) {
        MergeSort ms=new MergeSort();
        ms.push();
        ms.print(ms.root);
        System.out.println();
       ms.root= ms.MergeSort(ms.root);
        ms.print(ms.root);


    }

}
