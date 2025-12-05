import java.util.*;

class Items {
    int w, p;
    double ratio;

    // constructor MUST be inside the class
    public Items(int w, int p) {
        this.w = w;
        this.p = p;
        this.ratio = (double) p / w;
    }
}

public class Weightbagswithgreedy {
    public static void main(String[] args) {

        Items[] item = {
            new Items(10, 60),
            new Items(20, 100),
            new Items(30, 120)
        };

        int capacity = 50;
        double profit = 0.0;

        // sort by ratio in descending order (highest ratio first)
        Arrays.sort(item, (a, b) -> Double.compare(b.ratio, a.ratio));

        for (Items it : item) {
            if (capacity >= it.w) {
                profit += it.p;
                capacity -= it.w;
            } else {
                profit += it.ratio * capacity; // fractional part
                capacity = 0;
                break;
            }
            System.out.println("Current profit: " + profit);
        }

        System.out.println("\nTotal Maximum Profit = " + profit);
    }
}
