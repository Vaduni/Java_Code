//representation using adjacency list implemented using Array of ArrayList

package Java_Code;

import java.util.ArrayList;

public class Graph_AdjacencyList {
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

    public static void main(String[] args) {
        int v = 4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        // print 0's neighbours
        System.out.println("0's neigbours are:");
        for (int i = 0; i < graph[0].size(); i++) {
            Edge e = graph[0].get(i);
            System.out.println(e.dest + " ");
        }
        System.out.println("1's neigbours are:");
        // print 1's neighbours
        for (int i = 0; i < graph[1].size(); i++) {
            Edge e = graph[1].get(i);
            System.out.println(e.dest + " ");
        }
        System.out.println("2's neigbours are:");
        // print 2's neighbours
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i);
            System.out.println(e.dest + " ");
        }
        System.out.println("3's neigbours are:");
        // print 3's neighbours
        for (int i = 0; i < graph[3].size(); i++) {
            Edge e = graph[3].get(i);
            System.out.println(e.dest + " ");
        }
    }
}
