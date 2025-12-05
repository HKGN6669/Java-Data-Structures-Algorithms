import java.util.HashMap;
import java.util.LinkedHashMap;

public class Countofwordsusinghashmap{
    public static void main(String[] args) {
        String str = "Java JAVA java Code code";

        // Convert to lower case to ignore case
        str = str.toLowerCase();

        // Split string into words using space
        String[] words = str.split("\\s+"); // split by one or more spaces

        // Use LinkedHashMap to preserve insertion order
        HashMap<String, Integer> map = new LinkedHashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // Print word counts
        for (String word : map.keySet()) {
            System.out.println(word + " = " + map.get(word));
        }
    }
}
