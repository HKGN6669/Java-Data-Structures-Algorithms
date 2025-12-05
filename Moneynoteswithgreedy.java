import java.util.*;
public class Moneynoteswithgreedy{
    public static void main(String[] args){
        int[] arr={500,200,100,50,10};
        int amount=25760;
        for(int i=0;i<arr.length;i++){
            int count=amount/arr[i];
            amount=amount%arr[i];
            System.out.println(arr[i]+" "+count);
        }
    }
}