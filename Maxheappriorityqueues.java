import java.util.PriorityQueue;
import java.util.Collections;

public class Maxheappriorityqueues {
    public static void main(String[] args) {

        // Max Heap PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.add(10);
        pq.add(15);
        pq.add(30);

        System.out.println(pq); // prints max-heap form (unordered)
        
        pq.poll();  // removes highest value (30)

        System.out.println("after removing max-heap value: " + pq);
    }
}