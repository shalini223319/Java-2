import java.util.*;

class Graph {
    private Map<String, List<String>> adjacencyList;

    // Constructor to initialize the adjacency list
    public Graph() {
        adjacencyList = new HashMap<>();
    }

    // Add a vertex to the graph
    public void addVertex(String vertex) {
        adjacencyList.put(vertex, new ArrayList<>());
    }

    // Add an edge between two vertices
    public void addEdge(String source, String destination) {
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source); // Since it's an undirected graph
    }

    // Perform DFS starting from the given vertex
    public void dfs(String startVertex) {
        Set<String> visited = new HashSet<>();
        dfsHelper(startVertex, visited);
    }

    // Helper method for DFS
    private void dfsHelper(String vertex, Set<String> visited) {
        visited.add(vertex);
        System.out.print(vertex + " "); // Print the vertex

        // Visit each neighbor of the current vertex
        for (String neighbor : adjacencyList.get(vertex)) {
            if (!visited.contains(neighbor)) {
                dfsHelper(neighbor, visited); // Recurse for unvisited neighbors
            }
        }
    }

    // Main method to test the graph and DFS functionality
    public static void main(String[] args) {
        // Create a new graph
        Graph graph = new Graph();

        // Add vertices to the graph
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");

        // Add edges between vertices
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "D");
        graph.addEdge("C", "E");

        // Print the DFS traversal starting from vertex A
        System.out.println("Depth-First Traversal:");
        graph.dfs("A");
    }
}
