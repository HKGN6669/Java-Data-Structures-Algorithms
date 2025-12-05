import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr={8,0,0,8,2,7,3,9,6,9};
        int target=9;
        System.out.println(linearSearch(arr,target));
    }
    public  static int linearSearch(int[] arr,int target){
        int i=0;
        while(i<arr.length){
            if(arr[i]==target){
                return i;
            }
            i++;
        }
        return -1;
    } 
}