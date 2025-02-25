package Tree;

class Node {
  int data;
  Node left, right;

  public Node(int data) {
    this.data = data;
    this.left = null;
    this.right = null;

  }
}

public class BInaryTree {

  static Node root;

  public static void InorderTraversal(Node root) {
    if (root != null) {
      InorderTraversal(root.left);
      System.out.print(root.data + " ");
      InorderTraversal(root.right);

    }
  }

  public static void main(String[] args) {
    Node root = new Node(10);
    root.left = new Node(20);
    root.right = new Node(30);
    root.left.left = new Node(40);
    root.left.right = new Node(50);

    System.out.println("Inoder travesal of the tree: ");

    InorderTraversal(root);

  }

}
