import java.util.*;

public class Factorialofnumusingdynamicprog{
    static int[] memo;

    public static int factorial(int num) {
        if (num==1 || num==0){
            return 1;
        } 
        if(memo[num]!=-1){
            return memo[num];
        }
        memo[num]=num*factorial(num-1);
        return memo[num];
    }
    public static void main(String[] args) {
        int num = 6;
        memo = new int[num + 1];
        Arrays.fill(memo, -1);

        System.out.println(factorial(num));
    }
}