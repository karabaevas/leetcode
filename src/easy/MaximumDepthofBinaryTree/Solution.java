package easy.MaximumDepthofBinaryTree;

import java.util.Arrays;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return goDeeper(root, 1);
    }

    private int goDeeper(TreeNode node, int levelNumber) {
        if (node == null) {
            return levelNumber;
        }

        TreeNode left = node.left;
        TreeNode right = node.right;

        int depthLeft = 0;
        int depthright = 0;
        if (left != null) {
            depthLeft = goDeeper(left, levelNumber + 1);
        } else {
            depthLeft = levelNumber;
        }

        if (right != null) {
            depthright = goDeeper(right, levelNumber + 1);
        } else {
            depthright = levelNumber;
        }

        return Math.max(depthright, depthLeft);
    }

    public static void main(String[] args) {
    }

}