package com.github.dimonium_239.Chapter_4_TreesAndGraphs.Task_5_ValidateBST;

import com.github.dimonium_239.Chapter_4_TreesAndGraphs.TreesAndGraphsUtils.Graph.TreeNode;

public class ValidateBST {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(4);

        tree.left = new TreeNode(2);
        tree.left.left = new TreeNode(1);
        tree.left.right = new TreeNode(3);
        tree.left.right.left = new TreeNode(-1);
        tree.left.right.left.left = new TreeNode(-2);

        tree.right = new TreeNode(6);
        tree.right.left = new TreeNode(5);
        tree.right.right = new TreeNode(7);

        System.out.println(isBST(tree));
    }

    public static boolean isBST(TreeNode node){
        boolean isNodeBSTLeft = false;
        if(node.left == null || node.data >= node.left.data){
            isNodeBSTLeft = true;
        }
        boolean isNodeBSTRight = false;
        if(node.right == null || node.data < node.right.data){
            isNodeBSTRight = true;
        }

        boolean isLeftBST = true;
        if(node.left != null)
            isLeftBST = isBST(node.left);
        boolean isRightBST = true;
        if(node.right != null)
         isRightBST = isBST(node.right);
        return isNodeBSTLeft && isNodeBSTRight && isLeftBST && isRightBST;
    }
}
