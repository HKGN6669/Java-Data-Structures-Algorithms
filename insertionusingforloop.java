import java.util.*;
class Main {
    public static void insertion(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int min=arr[i];
            for(int j=i-1;j>=0 && arr[j]>min;j--){
                arr[j+1]=arr[j];
                arr[j]=min;
            }
        }
    }
    public  static void main(String[] args){
        int[] arr={3,6,7,8,5,4,9,2,1};
        System.out.println("Before Sort");
        for(int i:arr){
            System.out.print(i+" ");
        }
        insertion(arr);
        System.out.println();
        System.out.println("After Sort");
        for(int j:arr){
            System.out.print(j+" ");
        }
    }
    
}