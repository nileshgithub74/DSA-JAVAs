package LinkedList;

class ListNode {
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListImplementation {

   
    public static void LinkedListTraversal(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.data + "-> ");
            curr = curr.next;
        }
        
    }

   
    public static ListNode ReverseLinkedList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev; 
    }

    // Insert at Beginning
    public static ListNode InsertAtBegin(ListNode head, int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        return newNode; 
    }

    // insert at Given postion: --------------------

    public static ListNode insertAtPosition(int data, int position, ListNode head){
        ListNode newNode = new ListNode(data);
        if(head == null || position == 1){
            head = newNode;
            return head;
        }

        ListNode curr = head;

        for(int i =1; i < (position-1 )&& curr != null; i++){
            curr = curr.next;
        }

        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = null; 

        head = InsertAtBegin(head, 10);
        head = InsertAtBegin(head, 20);
        head = InsertAtBegin(head, 40);
        head = InsertAtBegin(head, 60);
        head = InsertAtBegin(head, 70);

        System.out.println("Original Linked List:");
        LinkedListTraversal(head);

        head = ReverseLinkedList(head);

        System.out.println("Reversed Linked List:");
        LinkedListTraversal(head);

     head = insertAtPosition(99, 2, head); 

            System.out.println("After inserting 99 at position 2:");
        LinkedListTraversal(head);

    }
}
