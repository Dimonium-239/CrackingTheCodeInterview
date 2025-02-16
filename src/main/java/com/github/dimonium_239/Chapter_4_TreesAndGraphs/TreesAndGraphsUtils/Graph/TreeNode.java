package com.github.dimonium_239.Chapter_4_TreesAndGraphs.TreesAndGraphsUtils.Graph;

public class TreeNode {
    public int data;

    public int depth;

    public TreeNode parent;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(){}

    public TreeNode(int data){
        this.data = data;
    }

    @Override
    public String toString() {
        return "(" + data + ")";
    }
}
