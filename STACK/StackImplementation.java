import java.util.*;

class Stack {

    public ArrayList<Integer> list = new ArrayList<>();

    public void push(int item) {
        list.add(item);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        return list.remove(list.size() - 1);
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("empty");
        }
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

}

public class StackImplementation {

    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);


        System.out.println("Top element: " + stack.peek()); 
        System.out.println("Stack size: " + stack.size());  

        System.out.println("Popped: " + stack.pop()); 
        System.out.println("Popped: " + stack.pop()); 

    }

}
