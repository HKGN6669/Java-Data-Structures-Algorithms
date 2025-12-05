import java.util.*;

public class fibonaciusingmemoizationtechniqueindp{
    static int[] dp = new int[100];

    static int fib(int n) {
        if (n <= 1) {
            return n;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        dp[n] = fib(n - 1) + fib(n - 2);
        return dp[n];
    }

    public static void main(String[] args) {
        Arrays.fill(dp, -1);
        int n = 6;
        System.out.println(fib(n)); // Output: 8
    }
}
