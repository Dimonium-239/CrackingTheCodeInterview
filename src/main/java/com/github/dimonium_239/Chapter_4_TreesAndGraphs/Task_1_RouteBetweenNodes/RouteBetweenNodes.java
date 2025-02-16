package com.github.dimonium_239.Chapter_4_TreesAndGraphs.Task_1_RouteBetweenNodes;

import com.github.dimonium_239.Chapter_4_TreesAndGraphs.TreesAndGraphsUtils.Graph.Graph;
import com.github.dimonium_239.Chapter_4_TreesAndGraphs.TreesAndGraphsUtils.Graph.Node;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class RouteBetweenNodes {
    public static void main(String[] args) {
        Graph graph = new Graph();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node1.children.addAll(Arrays.asList(node2, node3, node4));
        node2.children.add(node4);
        node4.children.addAll(Arrays.asList(node3, node5));
        node5.children.add(node3);

        graph.getChildren().addAll(Arrays.asList(node1, node2, node3, node4, node5));

        System.out.println(graph);
        System.out.println(isPathBetweenNodesDFS(node1, node5));
    }

    public static boolean isPathBetweenNodesDFS(Node start, Node stop) {
        if(start == null){
            return false;
        }
        start.mark();
        boolean isPathExist = false;
        if(start.equals(stop)){
            return true;
        }
        for (Node child : start.children) {
            if(!child.isMarked()){

                isPathExist = isPathBetweenNodesDFS(child, stop);
            }
        }
        return isPathExist;
    }


    public static boolean isPathBetweenNodesBFS(Node start, Node stop) {
        Queue<Node> myQueue = new LinkedList<>();
        myQueue.add(start);
        start.mark();
        while (!myQueue.isEmpty()) {
            Node parent = myQueue.poll();
            parent.mark();
            for (Node child : parent.children) {
                if (!child.isMarked()) {
                    if(child.equals(stop)){
                        return true;
                    }
                    child.mark();
                    myQueue.add(child);
                }
            }
        }
        return false;
    }
}
