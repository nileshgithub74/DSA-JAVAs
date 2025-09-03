package LinkedList;

class ListNode{
    int data;
    ListNode next;

    ListNode(int data){
        this.data = data;
        this.next = null;
    }
}

public class MiddleOfLinkedList {
 public static ListNode InsertAtBegin(ListNode head, int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        return newNode;
    }


    public static ListNode FindMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast!= null  && fast.next != null){
            fast = fast.next.next;
            slow= slow.next;
        }
        return slow;
    }



    public static void main(String[] args){
          ListNode head = null;

    head = InsertAtBegin(head, 10);
    head = InsertAtBegin(head, 20);
    head = InsertAtBegin(head, 30);
    head = InsertAtBegin(head, 40);
    head = InsertAtBegin(head, 50);

   

    ListNode middle = FindMiddle(head);
    System.out.println("Middle Node: " + middle.data);

    }
    
}
