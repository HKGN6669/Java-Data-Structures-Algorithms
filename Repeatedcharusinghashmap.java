import java.util.HashSet;
import java.util.LinkedHashSet;
public class Repeatedcharusinghashmap{
  public static void main(String[] args){
    String str="mississippi";
    HashSet<Character> map=new HashSet<>();
    LinkedHashSet<Character> set=new LinkedHashSet<>();
    for(int i=0;i<str.length();i++){
      set.add(str.charAt(i));
    }
    for(char c: set){
      System.out.print(c);
    }
  }  
}