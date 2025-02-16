package com.github.dimonium_239.Chapter_4_TreesAndGraphs.Task_4_IsBalanced;

import com.github.dimonium_239.Chapter_4_TreesAndGraphs.TreesAndGraphsUtils.Graph.TreeNode;

public class IsBalanced {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(4);

        tree.left = new TreeNode(2);
        tree.left.left = new TreeNode(1);
        tree.left.right = new TreeNode(3);
//        tree.left.right.left = new TreeNode(-1);
//        tree.left.right.left.left = new TreeNode(-2);

        tree.right = new TreeNode(6);
        tree.right.left = new TreeNode(5);
        tree.right.right = new TreeNode(7);
//        tree.right.right.right = new TreeNode(9);
//        tree.right.right.right.left = new TreeNode(8);
//        tree.right.right.right.right = new TreeNode(10);

        System.out.println(isBalanced(tree));
    }

    private static boolean isBalanced(TreeNode node){
        postOrderVisit(node);
        return Math.max(node.left.depth, node.right.depth) - Math.min(node.left.depth, node.right.depth) <= 1;
    }

    private static int postOrderVisit(TreeNode node){
        if(node != null) {
            int left = postOrderVisit(node.left);
            int right = postOrderVisit(node.right);
            node.depth += 1 + Math.max(left, right);
            return node.depth;
        }
        return 0;
    }
}
