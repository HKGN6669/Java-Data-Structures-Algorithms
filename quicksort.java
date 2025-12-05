import java.util.*;
class quickSort{
    public static void quickSort(int[] arr,int l,int r){
        if(l<r){
            int pi=prevent(arr,l,r);
            quickSort(arr,l,pi-1);
            quickSort(arr,pi+1,r);
        }
    }
    public static int prevent(int[] arr,int l,int r){
        int pi=arr[l];
        int low=l+1;
        int high=r;
        while(low<high){
           while(low<=high && pi>arr[low]){
              low++; 
           }
           while(low<=high && pi<arr[high]){
              high--; 
           }
           if(low<high){
               int temp=arr[low];
               arr[low]=arr[high];
               arr[high]=temp;
           }
        }
        arr[l]=arr[high];
        arr[high]=pi;
        return high;
    }
    public static void main(String[] args) {
        int[] arr={6,8,9,5,3,4,2,1,0,7};
        quickSort(arr,0,arr.length-1);
        for(int i:arr){
        System.out.print(i+" ");
        }
    }
}
