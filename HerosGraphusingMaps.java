import java.util.*;

public class HerosGraphusingMaps {

    private Map<String, List<String>> adjacencyList;

    public HerosGraphusingMaps() {
        adjacencyList = new LinkedHashMap<>();
    }

    public void addNode(String name) {
        adjacencyList.putIfAbsent(name, new ArrayList<>());
    }

    public void addConnection(String a, String b) {
        addNode(a);
        addNode(b);

        if (!adjacencyList.get(a).contains(b))
            adjacencyList.get(a).add(b);

        if (!adjacencyList.get(b).contains(a))
            adjacencyList.get(b).add(a);
    }

    public void printHeroGraph() {
        for (String hero : adjacencyList.keySet()) {
            System.out.println(hero + " -> " + adjacencyList.get(hero));
        }
    }

    public static void main(String[] args) {

        HerosGraphusingMaps g = new HerosGraphusingMaps();

        g.addConnection("Ram Charan", "NTR");
        g.addConnection("Ram Charan", "Mahesh Babu");
        g.addConnection("Ram Charan", "Prabhas");

        g.addConnection("Mahesh Babu", "Allu Arjun");
        g.addConnection("Prabhas", "Yash");
        g.addConnection("Allu Arjun", "Vijay");

        g.printHeroGraph();
    }
}
