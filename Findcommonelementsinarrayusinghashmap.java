import java.util.HashSet;

public class Findcommonelementsinarrayusinghashmap {

    public static void main(String[] args) {

        int[] arr1 = {1, 9, 7, 6, 5, 3};
        int[] arr2 = {8, 5, 3, 2, 0, 0};

        HashSet<Integer> set = new HashSet<>();

        // Add arr1 elements to set
        for (int i : arr1) {
            set.add(i);
        }

        // Check common elements
        System.out.print("Common elements: ");
        for (int j : arr2) {
            if (set.contains(j)) {
                System.out.print(j + " ");
            }
        }
    }
}
