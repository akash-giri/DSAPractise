package com.code.LinkList;

public class ReorderList {

    class ListNode{
        int val;
        ListNode next;
        ListNode(int data) {
            this.val = data;
            this.next = null;
        }
    }
    public ListNode head=null;
    public ListNode tail=null;


    public void addNode(int data) {
        ListNode newNode = new ListNode(data);

        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }


    public void display() {
        ListNode current = head;

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current != null) {
            System.out.print(current.val + "->");
            current = current.next;
        }
        System.out.println();
    }

    public static void reOrderList(ListNode head){
    if (head == null || head.next == null)
            return;

    // step 1. cut the list to two halves
    // prev will be the tail of 1st half
    // slow will be the head of 2nd half
    ListNode prev = null, slow = head, fast = head, l1 = head;

      while (fast != null && fast.next != null) {
        prev = slow;
        slow = slow.next;
        fast = fast.next.next;
    }

    prev.next = null;

    // step 2. reverse the 2nd half
    ListNode l2 = reverse(slow);

    // step 3. merge the two halves
    merge(l1, l2);
    }

    static ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head, next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    static void merge(ListNode l1, ListNode l2) {
        while (l1 != null) {
            ListNode n1 = l1.next, n2 = l2.next;
            l1.next = l2;

            if (n1 == null)
                break;

            l2.next = n1;
            l1 = n1;
            l2 = n2;
        }
    }

    public void reorderList(ListNode head) {
        if(head==null||head.next==null) return;

        //Find the middle of the list
        ListNode p1=head;
        ListNode p2=head;
        while(p2.next!=null&&p2.next.next!=null){
            p1=p1.next;
            p2=p2.next.next;
        }

        //Reverse the half after middle  1->2->3->4->5->6 to 1->2->3->6->5->4
        ListNode preMiddle=p1;
        ListNode preCurrent=p1.next;
        while(preCurrent.next!=null){
            ListNode current=preCurrent.next;
            preCurrent.next=current.next;
            current.next=preMiddle.next;
            preMiddle.next=current;
        }

        //Start reorder one by one  1->2->3->6->5->4 to 1->6->2->5->3->4
        p1=head;
        p2=preMiddle.next;
        while(p1!=preMiddle){
            preMiddle.next=p2.next;
            p2.next=p1.next;
            p1.next=p2;
            p1=p2.next;
            p2=preMiddle.next;
        }
    }

    public static void main(String[] args) {
        ReorderList list=new ReorderList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.addNode(6);

        list.display();
        list.reorderList(list.head);
        list.display();
    }
}
