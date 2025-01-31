import java.util.*;

public class KnapSack2 {
    public static long maxKnapsackValue(int N, int W, int[] weights, int[] values) {
        long[] dp = new long[W + 1];

    
        for (int i = 0; i < N; i++) {
            int weight = weights[i];
            int value = values[i];

           
            for (int j = W; j >= weight; j--) {
                dp[j] = Math.max(dp[j], dp[j - weight] + value);
            }
        }

 
        long maxVal = 0;
        for (int j = 0; j <= W; j++) {
            maxVal = Math.max(maxVal, dp[j]);
        }
        return maxVal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int N = scanner.nextInt();
        int W = scanner.nextInt();

        int[] weights = new int[N];
        int[] values = new int[N];

        for (int i = 0; i < N; i++) {
            weights[i] = scanner.nextInt();
            values[i] = scanner.nextInt();
        }

        System.out.println(maxKnapsackValue(N, W, weights, values));
        scanner.close();
    }
}
