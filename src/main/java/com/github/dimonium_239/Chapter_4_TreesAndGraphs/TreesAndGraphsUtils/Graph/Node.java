package com.github.dimonium_239.Chapter_4_TreesAndGraphs.TreesAndGraphsUtils.Graph;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.stream.Collectors;

public class Node {
    public Object data;
    public HashSet<Node> children;
    private HashSet<Node> parents;

    private boolean isMarked = false;

    public Node(Object data){
        this.data = data;
        this.children = new HashSet<>();
        this.parents = new HashSet<>();
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

    public boolean isInChildren(Node node){
        return isNodePresentInCollection(children, node);
    }

    public Node getIfPresentInChildren(Node node){
        return children.stream().filter(c -> c.data.equals(node.data)).findFirst().orElse(null);
    }
    public void addParent(Node node){
        if(!isNodePresentInCollection(parents, node)) {
            parents.add(node);
        }
    }

    public HashSet<Node> getParents(){
        return parents;
    }

    public boolean isInParents(Node node){
        return isNodePresentInCollection(parents, node);
    }

    public Node getIfPresentInParents(Node node){
        return parents.stream().filter(c -> c.data.equals(node.data)).findFirst().orElse(null);
    }

    public boolean isParentsEmpty(){
        return parents.isEmpty();
    }

    public void mark(){
        isMarked = true;
    }

    public void resetMark(){
        isMarked = false;
    }

    public boolean isMarked(){
        return isMarked;
    }


    @Override
    public String toString() {
        return "(" + data + ") -> [" + children.stream().map(node -> "(" + node.data + "), ").collect(Collectors.joining()) + "]";
    }
}
