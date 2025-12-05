public class BTsubarray{
    public static void subArrays(int[] arr,int index){
        if(index==arr.length){
            for(int num:arr){
                System.out.print(num+" ");
            }
            
        System.out.println();
        return;
        }
        for(int j=index;j<arr.length;j++){
            //swapping
            int temp=arr[index];
            arr[index]=arr[j];
            arr[j]=temp;

            subArrays(arr,index+1);
            //printing
            temp=arr[index];
            arr[index]=arr[j];
            arr[j]=temp;

        }
    }
    public static void main(String[] args){
        int[] arr={1,2,3};
        subArrays(arr,0);
    }
}