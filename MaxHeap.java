import java.util.*;

class maximumHeap {
    int[] heap;
    int size;

    maximumHeap(int capacity) {
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

        while (i > 0 && heap[i] > heap[parent(i)]) {
            int temp = heap[i];
            heap[i] = heap[parent(i)];
            heap[parent(i)] = temp;
            i = parent(i);
        }
    }
    int extractMax(){
        int root=heap[0];
        heap[0]=heap[size-1];
        size--;
        heapify(0);
        return root;
    }
    void heapify(int i){
        int largest=i;
        int l=left(i);
        int r=right(i);
        if(l<size && heap[l]>heap[largest]) largest=l;
        if(r<size && heap[r]>heap[largest]) largest=r;
        if(largest!=i){
            int temp=heap[i];
            heap[i]=heap[largest];
            heap[largest]=temp;
            heapify(largest);
        }
    }

    void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
}

public class MaxHeap {
    public static void main(String[] args) {
        maximumHeap mh = new maximumHeap(20);
        mh.insert(10);
        mh.insert(12);
        mh.insert(14);
        mh.insert(16);
        mh.insert(18);
        mh.insert(20);
        mh.insert(22);
        System.out.println("Maximum Heap Array is:");
        mh.printHeap();
        System.out.println("Extracted Max: " + mh.extractMax());
        mh.printHeap(); // heap after extraction
    }
}
