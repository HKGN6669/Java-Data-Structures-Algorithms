import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println(numbers(10));
    }
    public static int numbers(int n){
        if(n==0){
            System.out.println("Start !");
            return 0;
        }
        System.out.println(n);
        return numbers(n-1);
    }
}