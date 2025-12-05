import java.util.*;
public class Stringalgorithm{
    public static void main(String[] args){
        String str="abcdacbabcdcababc";
        String target="abc";
        int n=str.length();
        int m=target.length();
        for(int i=0;i<=n-m;i++){
            int j=0;
            while(j<m && str.charAt(i+j)==target.charAt(j)){
                j++;
            }
            if(j==m){
                System.out.println("The index of : "+i);
            }
        }
    }
}