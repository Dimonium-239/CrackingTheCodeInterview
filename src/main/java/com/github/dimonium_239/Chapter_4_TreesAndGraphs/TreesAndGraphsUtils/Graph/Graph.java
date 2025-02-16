package com.github.dimonium_239.Chapter_4_TreesAndGraphs.TreesAndGraphsUtils.Graph;

import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;
import java.util.stream.Collectors;

public class Graph {
    private HashSet<Node> children;

    public Graph(){
        this.children = new HashSet<>();
    }

    private boolean isNodePresentInCollection(Collection<Node> collection, Node node){
        return collection.stream().anyMatch(c -> c.data.equals(node.data));
    }

    public void addChildren(Node node){
        if(!isNodePresentInCollection(children, node)) {
            children.add(node);
        }
    }

    public HashSet<Node> getChildren(){
        return children;
    }

    public void setChildren(HashSet<Node> children) {
        this.children = children;
    }

    public Node getIfPresentInChildrenOrCreate(Node node){
        Optional<Node> nodeStream = children.stream().filter(c -> c.data.equals(node.data)).findFirst();
        return nodeStream.orElse(node);
    }

    @Override
    public String toString() {
        return children.stream().map(node -> node.toString() + "\n").collect(Collectors.joining());
    }
}
