package  Recursion;

public class PowerRecursive {
    public static int power(int a, int n) {
        if (n == 0) return 1;

        int halfPower = power(a, n / 2);

        if (n % 2 == 0) return halfPower * halfPower; 

        else return a * halfPower * halfPower; 
    }

    public static void main(String[] args) {
        int a = 2, n = 5;


        
        System.out.println(a + "^" + n + " = " + power(a, n));
    }
}
