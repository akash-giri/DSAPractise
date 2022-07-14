package com.code.LinkList;

public class DeleteMiddleNodeOfLInkedLIst {
    /**
     *
     * @param A
     * @return


    public ListNode solve(ListNode A) {
        ListNode slow=A;
        ListNode fast=A;
        ListNode prev=null;
        if(A==null || A.next==null)
        {
            return null;
        }
        while(fast.next!=null&& slow.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
            if(fast==null)
            {
                break;
            }
        }
        prev.next=slow.next;
        return A;
    }
     */
}
