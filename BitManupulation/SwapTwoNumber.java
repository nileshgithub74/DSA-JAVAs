package BitManupulation;

public class SwapTwoNumber {

  static  void swap(int a , int b){
     a =  a^b;
     b = a^b;
     a = a^b;

  System.out.println("a: "+ a);
  System.out.println("b: "+ b);

  }



  public static void main(String[] args){
     int a = 5;
      int b  = 6;

      System.out.println( "value before swapping : ");
      System.out.println("a: "+ a);
      System.out.println("b: "+ b);


      System.out.println( "value After swapping : ");
      swap(a, b);

     


    



  }
  
}
