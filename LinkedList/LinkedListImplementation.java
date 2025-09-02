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
        System.out.println("null");
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
    }
}
