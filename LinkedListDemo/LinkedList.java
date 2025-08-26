// package LinkedListDemo;

// class Node{
//   int data;
//   Node next;
//   public Node(int data){
//     this.data = data;
//     this.next =null; 
//   }
// }

// public class LinkedList {

//   static void Traversal(Node head){
//     int count =0;
//     Node curr   = head;

//     while(curr != null){
//       System.out.print(curr.data+" ");
//       curr = curr.next;
//           }
//   }


//   static int NodeCount(Node head){
//     int count =0;
//     Node curr   = head;
//     while(curr != null){

//        count++;
//        curr = curr.next;
//     }

//     return count;
    
//   }
 

//   public static void main(String[] args){
//     Node head = new Node(10);
//     Node a = new Node(20);
//     Node b = new Node(30);
//     head.next = a;
//     a.next = b;


//     int ans = NodeCount(head);
//     System.out.println(ans);


  


     
//   }
  
// }
