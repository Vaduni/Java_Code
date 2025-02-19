package Java_Code;

import java.util.ArrayList;
import java.util.Stack;

public class KosarajuAlgo {
    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 1));
        graph[3].add(new Edge(3, 4));
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean visited[]) {
        visited[curr] = true;
        System.out.print(curr + " ");
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.dest]) {
                dfs(graph, e.dest, visited);
            }
        }
    }

    public static void topSort(ArrayList<Edge> graph[], int curr, boolean visited[], Stack<Integer> s) {
        visited[curr] = true; // Mark the current node as visited
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.dest]) {
                topSort(graph, e.dest, visited, s);
            }
        }
        s.push(curr);
    }

    public static void kosaraju(ArrayList<Edge> graph[], int V) {
        // Step 1: Perform topological sort : O(V+E)
        Stack<Integer> s = new Stack<>();
        boolean visited[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                topSort(graph, i, visited, s);
            }
        }

        // Step 2: Create the transpose of the graph O(V+E)
        @SuppressWarnings("unchecked")
        ArrayList<Edge> transpose[] = new ArrayList[V];
        for (int j = 0; j < graph.length; j++) {
            visited[j] = false;
            transpose[j] = new ArrayList<Edge>();
        }
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                // Reverse the direction of the edge
                transpose[e.dest].add(new Edge(e.dest, e.src));
            }
        }

        // Step 3: Perform DFS on the transposed graph O(V+E)
        while (!s.isEmpty()) {
            int curr = s.pop();
            if (!visited[curr]) {
                dfs(transpose, curr, visited);
                System.out.println(); // Print the strongly connected component
            }
        }
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        kosaraju(graph, V);
    }
}