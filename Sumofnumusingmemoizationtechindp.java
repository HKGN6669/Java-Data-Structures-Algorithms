import java.util.*;
public class Sumofnumusingmemoizationtechindp{
    static int[] memo;
    public static int sumDigit(int num){
        if(num<10){
            return num;
        }
        if(memo[num]!=-1){
            return memo[num];
        }
        memo[num]=(num%10)+sumDigit(num/10);
        return memo[num];
    }
    public static void main(String[] args){
        int num=12345;
        memo=new int[num+1];
        Arrays.fill(memo,-1);
        System.out.println(sumDigit(num));
    }
}