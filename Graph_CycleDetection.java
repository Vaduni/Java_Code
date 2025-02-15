package Java_Code;

import java.util.ArrayList;

public class Graph_CycleDetection {
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
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
    }

    public static boolean isCycleDirected(ArrayList<Edge> graph[], boolean visited[], int curr, boolean rec[]) {
        rec[curr] = true;
        visited[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (rec[e.dest]) { // cycle detected
                return true;
            } else if (!visited[e.dest]) {
                if (isCycleDirected(graph, visited, e.dest, rec)) {
                    return true;
                }
            }
        }
        rec[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        int v = 4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        boolean visited[] = new boolean[v];
        boolean rec[] = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                boolean isCycle = isCycleDirected(graph, visited, 0, rec);
                if (isCycle) {
                    System.out.println(isCycle);
                    break;
                }

            }
        }

    }
}