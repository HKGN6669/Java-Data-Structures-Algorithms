import java.util.*;
class Main {
    public static void selection(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){ /* '<' ascending,'>' descending */
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args){
        int[] arr={3,6,7,9,5,8,0,1,2,4};
        System.out.println("Before Sort");
        for(int i: arr){
            System.out.print(i+" ");
        }
        selection(arr);
        System.out.println();
        System.out.println("After Sort");
        for(int j: arr){
            System.out.print(j+" ");
        }
    }
    
}