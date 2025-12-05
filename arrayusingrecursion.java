import java.util.*;
class Main {
    public static void main(String[] args){
        int[] arr={10,20,30,40,50};
        printArray(arr,0);
    }
    public static void printArray(int[] arr,int index){
        if(index==arr.length-1){
            return;
        }
        System.out.println(arr[index]+" ");
        printArray(arr,index+1);
    }
}