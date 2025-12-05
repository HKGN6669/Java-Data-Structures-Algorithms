import java.util.*;
class Main {
    public static void bubbleSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){  /*n-i-1 reduces time complexity it stops while sorting ends*/
                if(arr[j]>arr[j+1]){   /*'>'ascending,'<' descending */
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            System.out.println();
            for(Object K:arr){
                System.out.print(K+" ");
            }
        }
    }
    public static void main(String[] args){
        int[] arr={3,6,7,9,5,8,0,1,2,4};
        System.out.println("Before Sort");
        for(int j: arr){
            System.out.print(j+" ");
        }
        bubbleSort(arr);
        System.out.println();
        System.out.println("After Sort");
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
    
}