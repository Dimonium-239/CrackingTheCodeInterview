package com.github.dimonium_239.Chapter_4_TreesAndGraphs.Task_6_Successor;

import com.github.dimonium_239.Chapter_4_TreesAndGraphs.TreesAndGraphsUtils.Graph.TreeNode;

public class Successor {

    public static void main(String[] args) {

    }

    private static TreeNode successor(TreeNode node){
        if(node == null) return null;
        if(node.right != null){
            return mostLeftNode(node);
        } else {
            TreeNode q = node;
            TreeNode x = q.parent;

            while (x != null && x.left != q){
                q = x;
                x = x.parent;
            }
            return x;
        }
    }

    private static TreeNode mostLeftNode(TreeNode node) {
        if(node == null){
            return null;
        }
        while (node.left != null){
            node = node.left;
        }
        return node;
    }
}
