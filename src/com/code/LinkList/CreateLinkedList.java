package com.code.LinkList;

public class CreateLinkedList {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node head=null;
    public Node tail=null;

    //addNode() will add a new node to the list
    public void addNode(int data) {
        //Create a new node
        Node newNode = new Node(data);

        //Checks if the list is empty
        if(head == null) {
            //If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        }
        else {
            //newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            //newNode will become new tail of the list
            tail = newNode;
        }
    }

    //display() will display all the nodes present in the list
    public void display() {
        //Node current will point to head
        Node current = head;

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println();
    }

    //kthReverseLinkedList
    public Node reverseList(Node A, int B) {
        if(B==0||A==null)
        {
            return A;
        }
        Node h1=A;
        Node h2=null;
        while (B > 0 && h1 != null) {
                Node temp = h1;
                h1 = h1.next;
                temp.next = h2;
                h2 = temp;
                B--;
        }
        A.next=h1;
        return h2;
    }

    public Node reverseListKGroup(Node A, int B) {
        if(B<=0||A==null)
        {
            return A;
        }
        Node h1=A;
        Node h2=null;
        int count=B;
        while (B > 0 && h1 != null) {
            Node temp = h1;
            h1 = h1.next;
            temp.next = h2;
            h2 = temp;
            B--;
        }
        A.next=reverseListKGroup(h1,count);
        return h2;
    }

    //K-group reverse linked list
    public Node reverseList1(Node A, int B) {
        if(A==null||B==1)
        {
            return A;
        }
        Node dummy=new Node(0);
        dummy.next=A;
        Node curr=dummy;
        Node nex;
        Node pre=dummy;
        int count=0;
        while(curr.next!=null)
        {
            curr=curr.next;
            count++;
        }
        while(count>=B)
        {
            curr=pre.next;
            nex=curr.next;
            for(int i=1;i<B;i++)
            {
                curr.next=nex.next;
                nex.next=pre.next;
                pre.next=nex;
                nex=curr.next;
            }
            pre=curr;
            count-=B;
        }
        return dummy.next;
    }

    public int LengthOfLinkedList(Node A)
    {
        int counter=0;
        Node temp=A;
        while(temp!=null)
        {
            counter++;
            temp=temp.next;
        }
        return counter;
    }
}
