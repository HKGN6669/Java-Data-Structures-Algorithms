import java.util.*;

public class BFSgraph {

    private Map<Integer, List<Integer>> adjacencyList = new HashMap<>();

    // Add a node
    public void addNode(int data) {
        adjacencyList.putIfAbsent(data, new ArrayList<>());
    }

    public void addEdge(int v, int u) {
        adjacencyList.get(v).add(u);
        adjacencyList.get(u).add(v);
    }

    // BFS Traversal
    public void BFS(int start) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        System.out.print("BFS: ");
        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (int neighbor : adjacencyList.get(current)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        BFSgraph graph = new BFSgraph();

        graph.addNode(4);
        graph.addNode(3);
        graph.addNode(5);
        graph.addNode(2);
        graph.addEdge(4, 3);
        graph.addEdge(4, 5);
        graph.addEdge(3, 2);
        graph.addEdge(5, 2);
        graph.BFS(4);
    }
}