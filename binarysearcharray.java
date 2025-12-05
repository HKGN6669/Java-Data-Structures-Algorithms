import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,6,7,8,9};
        int target=4;
        System.out.println(binarySearch(arr,target));
    }
    public static int binarySearch(int[] arr,int target){
        int start=0;
        int end =arr.length;
        while(start<=end){
            int mid=(start+end)/2;
            if(mid==target) return mid;
            else if(arr[mid]<target) start=mid+1;
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}