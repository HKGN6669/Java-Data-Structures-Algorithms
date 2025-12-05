import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,6,7,8,9};
        int target=8;
        System.out.println(binarySearch(arr,target));
    }
    public  static int binarySearch(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid =(low+high)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return-1;
    } 
}