class HashCode {
    private int size = 10;
    private java.util.LinkedList<Integer>[] table;

    @SuppressWarnings("unchecked")
    HashCode() {
        table = new java.util.LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new java.util.LinkedList<Integer>();
        }
    }

    public int hash(int data) {
        return data % 10;
    }

    public void insert(int data) {
        int index = hash(data);
        table[index].add(data);
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(table[i]+"->"+i);
        }
    }
    public String search(int key){
        int index=hash(key);
        return "this data is there : "+table[index].contains(key);
    }
    public boolean delete(int data){
        int index=hash(data);
        return table[index].remove(Integer.valueOf(data));
    }
}

public class HashTable {
    public static void main(String[] args) {
        HashCode h = new HashCode();

        h.insert(10);
        h.insert(32);
        h.insert(30);
        h.insert(40);
        h.insert(56);
        h.insert(69);
        h.display();
        System.out.println(h.search(40));
        System.out.println("Deleted? " + h.delete(32));

        h.display();
    }
}
