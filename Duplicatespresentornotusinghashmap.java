import java.util.HashSet;

public class Duplicatespresentornotusinghashmap {

    public static void main(String[] args) {

        int[] arr1 = {1, 9, 7, 6, 5, 4, 3, 8};

        HashSet<Integer> set = new HashSet<>();
        boolean duplicateFound = false;

        for (int i : arr1) {
            if (set.contains(i)) {
                duplicateFound = true;
                break;
            } else {
                set.add(i);
            }
        }

        if (duplicateFound) {
            System.out.println("Yes! Duplicates Present..");
        } else {
            System.out.println("No Duplicates Present..");
        }
    }
}
