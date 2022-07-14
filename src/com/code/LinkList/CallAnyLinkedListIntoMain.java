package com.code.LinkList;

public class CallAnyLinkedListIntoMain {

    public static void main(String[] args) {
        CreateLinkedList list=new CreateLinkedList();
//         6 -> 10 -> 0 -> 3 -> 4 -> 8
        list.addNode(6);
        list.addNode(10);
        list.addNode(0);
        list.addNode(3);
        list.addNode(4);
        list.addNode(8);
        int B=3;
        list.display();
        System.out.println("After K reverse linked list");
        CreateLinkedList.Node Node=list.reverseList(list.head,B);
        while(Node!=null)
        {
            System.out.print(Node.data+"->");
            Node=Node.next;
        }
    }



}
