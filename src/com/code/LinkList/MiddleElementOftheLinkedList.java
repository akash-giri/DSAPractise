package com.code.LinkList;

public class MiddleElementOftheLinkedList {
    class Node{
        int val;
        Node next;

        public Node(int data)
        {
            this.val=data;
            this.next=null;
        }
    }
    public Node head=null;
    public Node tail=null;

    public void addNode(int data)
    {
        Node newNode=new Node(data);

        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void display()
    {
        Node temp=head;
        if(temp==null)
        {
            System.out.println("list is empty");
        }
        while(temp!=null)
        {
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println();

    }
    public int middleELement(Node A) {
        Node temp=A;
        int count=0;
        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }
        System.out.println(count);
        if(count==1)
        {
            return A.val;
        }
        if(count%2==0)
        {
            int i=0;
            int mid=(count/2)+1;
            Node temp1=A;
            Node pre=null;
            while(temp1!=null&& i<mid)
            {
                pre=temp1;
                temp1=temp1.next;
                i++;
            }

            return pre.val;
        }
        else{
            int i=0;
            int mid=count/2;
            System.out.println(mid);
            Node temp1=A;
            Node pre=null;
            while(temp1!=null&& i<=mid)
            {
                pre=temp1;
                temp1=temp1.next;
                i++;
            }
            return pre.val;
        }
    }

    public static void main(String[] args) {
        MiddleElementOftheLinkedList list=new MiddleElementOftheLinkedList();
//        8 14 42 98 26 36 28 57 93
        list.addNode(46);
        list.addNode(76);
        list.addNode(35);


        list.display();

        System.out.println("middle element of the linked list");

        System.out.println(list.middleELement(list.head));
    }
}
