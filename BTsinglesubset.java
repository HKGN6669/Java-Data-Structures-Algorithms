public class BTsinglesubset{
    public static void singlesubset(int[] arr,int index,String current){
        if(index==arr.length){
            System.out.println(current+" ");
            return;
        }
        singlesubset(arr,index+1,current+arr[index]+" ");
        
        singlesubset(arr,index+1,current+" ");
    }
    public static void main(String[] args){
        int[] arr={1,2,3};
        singlesubset(arr,0," ");
    }
}