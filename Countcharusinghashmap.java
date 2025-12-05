import java.util.HashMap;
import java.util.LinkedHashMap;
public class Countcharusinghashmap{
  public static void main(String[] args){
    String str="mississippi";
    HashMap<Character,Integer> map=new LinkedHashMap<>();
    for(char c: str.toCharArray()){
      map.put(c,map.getOrDefault(c,0)+1);
    }
    for(char c:map.keySet()){
        System.out.println(c+"="+map.get(c));
    }
  }  
}