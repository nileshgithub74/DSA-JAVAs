import java.util.Scanner;

public class BookShopDP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of books: ");
        int n = sc.nextInt(); 
        System.out.println("enter the total Price: ");
        int x = sc.nextInt(); 

        int[] price = new int[n];
        int[] pages = new int[n];
       
        System.out.println("enter the  prices : ");
        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }

        System.out.println("Enter the number of  pages: ");
        for (int i = 0; i < n; i++) {
            pages[i] = sc.nextInt();
        }

        System.out.println(maxPages(n, x, price, pages));
        sc.close();
    }

    public static int maxPages(int n, int x, int[] price, int[] pages) {
        int[] dp = new int[x + 1];

        for (int i = 0; i < n; i++) {
            
            for (int j = x; j >= price[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - price[i]] + pages[i]);
            }
        }

        return dp[x]; 
    }
}