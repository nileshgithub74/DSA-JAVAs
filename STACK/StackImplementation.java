package STACK;



class Mystack{
  int arr[];
  int cap;
  int top;

 public Mystack(int c){
  top = -1;
   cap = c;
    arr = new int[cap];
  }
  public void  push(int x){
    top++;
    arr[top ] = x;
    
  }

}

public class StackImplementation {

  

  public static void main(String[] args){


  }
  
}
