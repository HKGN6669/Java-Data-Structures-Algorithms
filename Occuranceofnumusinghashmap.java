import java.util.*;

public class Occuranceofnumusinghashmap {
    public static void main(String[] args) {
        int num = 112256; // The number
        HashMap<Integer, Integer> map = new HashMap<>();
        while(num!=0){
            int digit=num % 10;
            map.put(digit,map.getOrDefault(digit,0)+1);
            num /= 10;
        }
        System.out.println("The Occurance num is : "+map);
    }
}
