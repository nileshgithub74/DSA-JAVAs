

import java.util.*;

public class DiceCombination {
  public static void main(String[] args){
    Scanner sc  = new Scanner(System.in);
    System.out.println("Enter the value of n : ");
    int n= sc.nextInt();

    int[] dp = new int[n + 1];
    dp[0] = 1;

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= Math.min(6,i); j++) {
          
                dp[i] = (dp[i] + dp[i - j]) ;
            
        } 
    }
  System.out.print("No. of way is : ");
    System.out.print(dp[n]);
    sc.close();
  }
  
}
