import java.util.HashMap;
import java.util.Map;

public class Sumoftwonumsequaltotargetinarrayusinghashmap{
    public static void main(String[] args) {
        int[] arr = {9, 5, 4, 3, 2, 6, 5, 4, 3, 1};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int temp = target - arr[i];

            // Scenario 1: Pair found
            if (map.containsKey(temp)) {
                System.out.println("Pair found: " + arr[i] + " + " + temp + " = " + target);
                return;
            }

            // Scenario 2: Add the current number to the map
            map.put(arr[i], i);
        }

        // Scenario 3: No pair exists
        System.out.println("No two numbers add up to the target");
    }
}

