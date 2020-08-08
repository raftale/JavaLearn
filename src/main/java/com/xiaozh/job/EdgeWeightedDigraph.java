package com.xiaozh.job;

import java.util.Scanner;

public class EdgeWeightedDigraph {
//    private static final String NEWLINE = System.getProperty("line.separator");
//    // number of vertices in this digraph
//    private int vertex;
//    // number of edges in this digraph
//    private int edge;
//    // adj[v] = adjacency list for vertex v
//    private Bag<DirectedEdge>[] adj;
//    // indegree[v] = indegree of vertex v
//    private int[] indegree;
//    public EdgeWeightedDigraph(int vertex) {
//        String message = String.format("Vertex %d must be positive number!", vertex);
//        validatePositiveNumber(message, vertex);
//        this.vertex = vertex;
//        this.edge = 0;
//        this.indegree = new int[vertex];
//        this.adj = (Bag<DirectedEdge>[]) new Bag[vertex];
//        for (int v = 0; v < vertex; v++)
//            adj[v] = new Bag<>();
//    }
//    public EdgeWeightedDigraph(Scanner scanner) {
//        this(scanner.nextInt());
//        int edge = scanner.nextInt();
//        String message = String.format("Edge %d must be positive number!", edge);
//        validatePositiveNumber(message, edge);
//        for (int i = 0; i < edge; i++) {
//            int v = scanner.nextInt();
//            int w = scanner.nextInt();
//            validateVertex(v);
//            validateVertex(w);
//            double weight = scanner.nextDouble();
//            addEdge(new DirectedEdge(v, w, weight));
//        }
//    }
//    public int vertex() {
//        return vertex;
//    }
//
//    public int edge() {
//        return edge;
//    }
//    public void addEdge(DirectedEdge e) {
//        int v = e.from();
//        int w = e.to();
//        validateVertex(v);
//        validateVertex(w);
//        adj[v].add(e);
//        indegree[w]++;
//        edge++;
//    }
//    public Iterable<DirectedEdge> adj(int v) {
//        validateVertex(v);
//        return adj[v];
//    }
//    public int outdegree(int v) {
//        validateVertex(v);
//        return adj[v].size();
//    }
//    public int indegree(int v) {
//        validateVertex(v);
//        return indegree[v];
//    }
//    // 在有向图中每条边只会出现一次
//    // 遍历边集不需要在无向图里那样为了消除重复边而进行复杂的判断
//    public Iterable<DirectedEdge> edges() {
//        Bag<DirectedEdge> list = new Bag<DirectedEdge>();
//        for (int v = 0; v < vertex; v++) {
//            for (DirectedEdge e : adj(v)) {
//                list.add(e);
//            }
//        }
//        return list;
//    }
//    public String toString() {
//        StringBuilder s = new StringBuilder();
//        s.append(vertex + " " + edge + NEWLINE);
//        for (int v = 0; v < vertex; v++) {
//            s.append(v + ": ");
//            for (DirectedEdge e : adj[v]) {
//                s.append(e + "  ");
//            }
//            s.append(NEWLINE);
//        }
//        return s.toString();
//    }
//    private void validatePositiveNumber(String message, int... numbers) {
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] < 0)
//                throw new IllegalArgumentException(message);
//        }
//    }

}
