package com.xiaozh.job;

public class DirectedEdge {
    private final int v;            //边的起点
    private final int w;            //边的终点
    private final double weight;    //边的权重
    public DirectedEdge(int v, int w, double weight) {
        validateVertexes(v, w);
        if (Double.isNaN(weight)) throw new IllegalArgumentException("Weight " + weight + " is  NaN!");
        this.v = v;
        this.w = w;
        this.weight = weight;
    }
    public int from() {
        return v;
    }
    public int to() {
        return w;
    }
    public double weight() {
        return weight;
    }
    public String toString() {
        return v + "->" + w + " " + String.format("%5.2f", weight);
    }
    private void validateVertexes(int... vertexes) {
        for (int i = 0; i < vertexes.length; i++) {
            if (vertexes[i] < 0)
                throw new IllegalArgumentException("Vertex " + vertexes[i] + " must be positive number!");
        }
    }
}