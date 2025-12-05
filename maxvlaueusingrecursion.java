import java.util.*;
class Main {
    public static void main(String[] args){
         int[] arr={10,20,30,40,60,80,50};
         System.out.println(maxValue(arr,0));
    }
    public static int maxValue(int[] arr,int i){
        if(i==arr.length-1) return arr[i];
        return Math.max(arr[i],maxValue(arr,i+1));
    }
}