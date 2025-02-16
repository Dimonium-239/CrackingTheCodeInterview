package com.github.dimonium_239.Chapter_4_TreesAndGraphs.Task_3_ListOfDepth;

import com.github.dimonium_239.Chapter_4_TreesAndGraphs.TreesAndGraphsUtils.Graph.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;

public class ListOfDepth {
    public static void main(String[] args) {
//        List<Integer> sortedArray = Arrays.asList(1,2,3,4,5,6,7,8,9);
//        TreeNode tree = new TreeNode();
//        createMinTree(tree, sortedArray);

        TreeNode tree = new TreeNode(1);
        tree.right = new TreeNode(2);
        tree.right.right = new TreeNode(3);
        tree.right.left = new TreeNode(4);
        System.out.println(listOfDepths(tree));
    }

    private static LinkedList<LinkedList<TreeNode>> listOfDepths(TreeNode root){
        LinkedList<LinkedList<TreeNode>> linkedLists = new LinkedList<>();

        LinkedList<TreeNode> parents = new LinkedList<>();
        LinkedList<TreeNode> children = new LinkedList<>();
        linkedLists.add(new LinkedList<>(Arrays.asList(root)));
        if(root.left != null)
            children.add(root.left);
        if(root.right != null)
            children.add(root.right);
        while (!children.isEmpty()){
            if(parents.isEmpty()){
                linkedLists.add(children);
                parents = new LinkedList<>(children);
                children = new LinkedList<>();
            }
            TreeNode parent = parents.poll();
            if(parent != null) {
                if(parent.left != null) {
                    children.add(parent.left);
                }
                if(parent.right != null) {
                    children.add(parent.right);
                }
            }
        }
        return linkedLists;
    }
}
