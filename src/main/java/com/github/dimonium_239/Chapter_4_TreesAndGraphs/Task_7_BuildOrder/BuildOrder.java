package com.github.dimonium_239.Chapter_4_TreesAndGraphs.Task_7_BuildOrder;

import com.github.dimonium_239.Chapter_4_TreesAndGraphs.TreesAndGraphsUtils.Graph.Graph;
import com.github.dimonium_239.Chapter_4_TreesAndGraphs.TreesAndGraphsUtils.Graph.Node;

import java.util.*;
import java.util.stream.Collectors;

public class BuildOrder {
    public static void main(String[] args) {
        List<Character> projects = Arrays.asList('A', 'B', 'C', 'D', 'E', 'F');
        List<List<Character>> dependencies = Arrays.asList(
                Arrays.asList('A', 'D'),
                Arrays.asList('F', 'B'),
                Arrays.asList('B', 'D'),
                Arrays.asList('F', 'A'),
                Arrays.asList('D', 'C')
                //,Arrays.asList('C', 'F')
        );

        try {
            System.out.println(findBuildOrder(projects, dependencies));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static List<Character> findBuildOrder(List<Character> projects, List<List<Character>> dependencies) throws Exception {
        Graph graphOfDependencies = new Graph();
        for (List<Character> dependency : dependencies) {
            Character project = dependency.get(0);
            Character dependee = dependency.get(1);

            Node newDependencie = graphOfDependencies.getIfPresentInChildrenOrCreate(new Node(project));
            Node newDependee = graphOfDependencies.getIfPresentInChildrenOrCreate(new Node(dependee));

            newDependee.addParent(newDependencie);
            newDependencie.addChildren(newDependee);

            graphOfDependencies.addChildren(newDependencie);
            graphOfDependencies.addChildren(newDependee);
        }
        for (Character c : projects) {
            graphOfDependencies.addChildren(new Node(c));
        }
        graphOfDependencies.setChildren(graphOfDependencies.getChildren().stream()
                .filter(Node::isParentsEmpty).collect(Collectors.toCollection(HashSet::new)));
        List<Character> buildOrder = BFSListOrderCreator(graphOfDependencies);
        if(buildOrder.size() < projects.size()){
            throw new Exception("No valid build order");
        }
        return buildOrder;
    }
    
    private static List<Character> BFSListOrderCreator(Graph graph){
        List<Character> buildOrder = new ArrayList<>();
        for (Node node : graph.getChildren()) {
            LinkedList<Node> parents = new LinkedList<>();
            parents.add(node);
            node.mark();
            while (!parents.isEmpty()){
                Node parent = parents.poll();
                buildOrder.add((Character) parent.data);
                for (Node child: parent.getChildren()) {
                    if(!child.isMarked()){
                        child.mark();
                        parents.add(child);
                    }
                }
            }
        }
        return buildOrder;
    }
}
