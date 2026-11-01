package it.unibo.generics.graph;
import java.util.ArrayList;
import java.util.Set;

import it.unibo.generics.graph.api.Graph;

public class GraphImpl<N> implements Graph{
    ArrayList<N> nodes;
    Set edges;

    public GraphImpl(ArrayList nodes) {
        this.nodes=nodes;
    }

    public void addNode(N node) {
        if (this.nodes.contains(node)==false) {
            this.nodes.add(node);
        }
    }

    public void addEdge(N source, N target);
}
