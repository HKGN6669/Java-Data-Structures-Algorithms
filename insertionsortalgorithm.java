import java.util.*;
class Main {
    public static void insertion(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int min=arr[i];
            int j=i-1;
            while(j>=0 && arr[j] >min){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=min;
        }
    }
    public static void main(String[] args){
        int[] arr={3,6,7,9,5,8,1,2,4};
        System.out.println("Before Sort");
        for(int i: arr){
            System.out.print(i+" ");
        }
        insertion(arr);
        System.out.println();
        System.out.println("After Sort");
        for(int j: arr){
            System.out.print(j+" ");
        }
    }
    
}