package Java_Code;

import java.util.ArrayList;

public class Graph_cycleDetect_undirected {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));
        graph[4].add(new Edge(4, 3));
    }

    public static boolean isCyclicUtil(ArrayList<Edge> graph[], boolean visited[], int curr, int parent) {
        visited[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            // case 1: when node is visited but not parent
            if (visited[e.dest] == true && parent != e.dest) {
                boolean isCycle = isCyclicUtil(graph, visited, e.dest, curr);
                if (isCycle)
                    return true;
            }
            // case 2: when node is visited and also parent
            else if (parent == e.dest) {
                continue;
            }
            // case 3: when node is neither visited nor parent
            else {
                return true;
            }
        }
        return false;
    }

    // O(V+E)
    public static boolean isCyclic(ArrayList<Edge>[] graph, boolean vis[]) {
        for (int i = 0; i < graph.length; i++) {
            if (isCyclicUtil(graph, vis, i, -1)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int v = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[5];
        createGraph(graph);
        System.out.println(isCyclic(graph, new boolean[v]));
    }
}
