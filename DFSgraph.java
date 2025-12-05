import java.util.*;

public class DFSgraph {

    private Map<Integer, List<Integer>> adjacencyList = new HashMap<>();

    // Add a node
    public void addNode(int data) {
        adjacencyList.putIfAbsent(data, new ArrayList<>());
    }

    public void addEdge(int v, int u) {
        adjacencyList.get(v).add(u);
        adjacencyList.get(u).add(v);
    }

   
    //DFS transversel
    public void DFS(int start){
        Set<Integer> visited=new HashSet<>();
        DFSHelper(start,visited);


    }
    private void DFSHelper(int node,Set<Integer> visited){
        visited.add(node);
        System.out.print(node+" ");
        for(int neighbor:adjacencyList.get(node)){
            if(!visited.contains(neighbor)){
            DFSHelper(neighbor,visited);
            }
        }

    }

    public static void main(String[] args) {

        DFSgraph graph = new DFSgraph();

        graph.addNode(4);
        graph.addNode(3);
        graph.addNode(5);
        graph.addNode(2);
        graph.addEdge(4, 3);
        graph.addEdge(4, 5);
        graph.addEdge(3, 2);
        graph.addEdge(5, 2);
        graph.DFS(5);
    }
}