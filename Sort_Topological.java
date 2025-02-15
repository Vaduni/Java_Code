package Java_Code;

import java.util.*;

public class Sort_Topological {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 0));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void topologicalUtil(ArrayList<Edge> graph[], boolean visited[], int curr, Stack<Integer> stack) {
        visited[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.dest]) {
                topologicalUtil(graph, visited, e.dest, stack);
            }
        }
        stack.push(curr);
    }

    public static void topologicalSort(ArrayList<Edge> graph[], int v) {
        boolean visited[] = new boolean[v];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                topologicalUtil(graph, visited, i, stack);
            }
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");

        }
    }

    public static void main(String[] args) {
        int v = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        topologicalSort(graph, v);
    }
}
