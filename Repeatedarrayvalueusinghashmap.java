import java.util.*;
public class Repeatedarrayvalueusinghashmap{
  public static void main(String[] args){
    int[] arr={10,20,30,30,30,20,10,10,10};
    HashMap<Integer,Integer> data=new HashMap<>();
    for(int i:arr){
        data.put(i,data.getOrDefault(i,0)+1);
    }
    for(int key:data.keySet()){
        System.out.println(key+"->"+data.get(key));
    }
  }  
}