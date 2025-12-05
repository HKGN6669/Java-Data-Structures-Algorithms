import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println(fact(6,0));
    }
    public static int fact(int n,int num){
        if(n==1){
            return num;
        }
        return fact(n-1,n*num);
    }
}