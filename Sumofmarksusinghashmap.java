import java.util.*;

public class Sumofmarksusinghashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("ram", 35);
        marks.put("sita", 25);
        marks.put("siva", 72);
        marks.put("ravi", 52);

        int sum = 0;
        for (int value : marks.values()) {
            sum += value;
        }

        System.out.println("Sum of marks = " + sum);
    }
}
