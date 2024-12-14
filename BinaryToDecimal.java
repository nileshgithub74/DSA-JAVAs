import java.util.*;

public class BinaryToDecimal{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Numbers : ");
    int n  = sc.nextInt();

    int ans = 0;


     int power = 1;

     while(n>0){
      int unit_digit = n%10;
      ans +=(unit_digit * power);

      power = power*2;

      n=n/10;


     }
     System.out.print("Decimal Equivalent :"+ ans);
     sc.close();





  }
  
}