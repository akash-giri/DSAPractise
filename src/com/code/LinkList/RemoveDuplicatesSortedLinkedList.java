package com.code.LinkList;

public class RemoveDuplicatesSortedLinkedList {
    
    class ListNode{
        int val;
        ListNode next;
        ListNode(int val)
        {
            this.val=val;
            this.next=null;
        }
    }

    public ListNode remove(ListNode head) {
        if (head == null) return null;
        ListNode FakeHead = new ListNode(0);
        FakeHead.next = head;
        ListNode pre = FakeHead;
        ListNode cur = head;
        while (cur != null) {
            while (cur.next != null && cur.val == cur.next.val) {
                cur = cur.next;
            }
            if (pre.next == cur) {
                pre = pre.next;
            } else {
                pre.next = cur.next;
            }
            cur = cur.next;
        }
        return FakeHead.next;
    }

}
