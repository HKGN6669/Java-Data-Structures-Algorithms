import java.util.*;

public class graphsusingmaps {

    private Map<Integer, List<Integer>> adjacencyList;

    // Constructor
    public graphsusingmaps() {
        adjacencyList = new HashMap<>();
    }

    // Add a node (without forcing edges with all existing nodes)
    public void addNode(int value) {
        adjacencyList.putIfAbsent(value, new ArrayList<>());
    }

    // Add an undirected edge
    public void addEdge(int a, int b) {
        addNode(a);
        addNode(b);

        if (!adjacencyList.get(a).contains(b))
            adjacencyList.get(a).add(b);

        if (!adjacencyList.get(b).contains(a))
            adjacencyList.get(b).add(a);
    }

    // Print graph
    public void printGraph() {
        for (int value : adjacencyList.keySet()) {
            System.out.println(value + " -> " + adjacencyList.get(value));
        }
    }
    public boolean isConnected(int value,int updatedvalue){
        if(adjacencyList.containsKey(value)&&adjacencyList.get(value).contains(updatedvalue)){
            return true;
        }
        return false;
    }
    //remove edge
    public void removeEdge(int value, int updatedvalue) {

    if (adjacencyList.containsKey(value)) {
        adjacencyList.get(value).remove(Integer.valueOf(updatedvalue));
    }

    if (adjacencyList.containsKey(updatedvalue)) {
        adjacencyList.get(updatedvalue).remove(Integer.valueOf(value));
    }
}

    //count the number of edges
    public int countOfEdges(){
        int count=0;
        for(int node: adjacencyList.keySet()){
            count+=adjacencyList.get(node).size();
        }
        return count;
    }
    //count of the Nodes
    public int countOfNodes(){
       int count=0;
        for(int v: adjacencyList.keySet()){
            count=adjacencyList.get(v).size();
            System.out.println(v+":"+count);
        }
        return count;
    }
    

    public static void main(String[] args) {
        graphsusingmaps graph = new graphsusingmaps();

        // Adding nodes
        graph.addNode(4);
        graph.addNode(3);
        graph.addNode(5);
        graph.addNode(2);
        graph.addNode(2);
        graph.addNode(4);
        graph.addNode(5);
        graph.addEdge(4, 3);
        graph.addEdge(4, 5);
        graph.addEdge(3, 2);
        graph.addEdge(5, 2);

        graph.printGraph();
        System.out.println("Is 4 connected to 3? " + graph.isConnected(4, 3));
        System.out.println("Is 4 connected to 2? " + graph.isConnected(4, 2));
        graph.removeEdge(4, 3);
        graph.printGraph();
        System.out.println("Total no of edges are:"+graph.countOfEdges());
        graph.countOfNodes();
    }
}