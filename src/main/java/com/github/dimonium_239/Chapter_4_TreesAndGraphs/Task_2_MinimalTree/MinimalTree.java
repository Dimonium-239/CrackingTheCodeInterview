package com.github.dimonium_239.Chapter_4_TreesAndGraphs.Task_2_MinimalTree;

import com.github.dimonium_239.Chapter_4_TreesAndGraphs.TreesAndGraphsUtils.Graph.TreeNode;

import java.util.Arrays;
import java.util.List;

public class MinimalTree {
    public static void main(String[] args) {
        List<Integer> sortedArray = Arrays.asList(1,2,3,4,5,6,7,8,9);
        TreeNode tree = new TreeNode();
        createMinTree(tree, sortedArray);
        System.out.println(tree);
    }

    public static TreeNode createMinTree(TreeNode tree, List<Integer> array){
        int start = 0;
        int end = array.size();
        if(array.isEmpty() || array.size() == 1){
            return null;
        }
        int midPoint = (end - start) / 2;
        tree.data = array.get(midPoint);
        tree.left = new TreeNode();
        tree.right = new TreeNode();
        createMinTree(tree.left, array.subList(start, midPoint));
        createMinTree(tree.right, array.subList(midPoint, end));
        return tree;
    }
}
