import java.util.HashSet;
public class Missingnuminarrayusinghashmap{
    public static void main(String[] args){
        int[] arr={1,2,3,5,6,9};
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        for(int i=0;i<9;i++){
            if(!set.contains(i)){
                System.out.println("Missing number are : "+i);
            }
        }
    }
}