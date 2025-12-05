import java.util.*;

class minimumHeap {
    int[] heap;
    int size;

    minimumHeap(int capacity) {
        heap = new int[capacity];
        size = 0;
    }

    int parent(int i) {
        return (i - 1) / 2;
    }

    int left(int i) {
        return 2 * i + 1;
    }

    int right(int i) {
        return 2 * i + 2;
    }

    void insert(int val) {
        heap[size] = val;
        int i = size;
        size++;

        // Bubble up (swap if child < parent)
        while (i > 0 && heap[i] < heap[parent(i)]) {
            int temp = heap[i];
            heap[i] = heap[parent(i)];
            heap[parent(i)] = temp;
            i = parent(i);
        }
    }

    int extractMin() {
        if (size == 0) return -1; // or throw exception

        int root = heap[0];
        heap[0] = heap[size - 1];
        size--;

        heapify(0);

        return root;
    }

    void heapify(int i) {
        int smallest = i;
        int l = left(i);
        int r = right(i);

        if (l < size && heap[l] < heap[smallest]) smallest = l;
        if (r < size && heap[r] < heap[smallest]) smallest = r;

        if (smallest != i) {
            int temp = heap[i];
            heap[i] = heap[smallest];
            heap[smallest] = temp;
            heapify(smallest);
        }
    }

    void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
}

public class MinHeap {
    public static void main(String[] args) {
        minimumHeap mh = new minimumHeap(20);

        mh.insert(10);
        mh.insert(1);
        mh.insert(4);
        mh.insert(16);
        mh.insert(18);
        mh.insert(2);
        mh.insert(22);

        System.out.println("Minimum Heap Array is:");
        mh.printHeap();

        System.out.println("Extracted Minimum: " + mh.extractMin());
        System.out.println("Heap after extraction:");
        mh.printHeap();
    }
}
