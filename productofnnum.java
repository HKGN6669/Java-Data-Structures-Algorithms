import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println(product(5));
    }
    public static int product(int n){
        if(n==0){
            return 1;
        }else{
            return n*product(n-1);
        }
    }
}