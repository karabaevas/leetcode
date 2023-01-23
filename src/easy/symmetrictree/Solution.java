package easy.symmetrictree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
    public boolean isSymmetric(TreeNode root) {
        boolean isSymmetric = goDeeper(root.left, root.right);
        return isSymmetric;
    }

    boolean goDeeper(TreeNode leftNode, TreeNode rightNode) {
        if (leftNode != null && rightNode != null) {
            if (leftNode.val != rightNode.val){
                return false;
            }
        } else {
            return leftNode == rightNode;
        }
        boolean result = goDeeper(leftNode.left, rightNode.right);
        if (!result) {
            return result;
        }
        result = goDeeper(leftNode.right, rightNode.left);
        if (!result) {
            return result;
        }
        return result;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(5), new TreeNode(3)));
        System.out.println(new Solution().isSymmetric(root));
    }
}