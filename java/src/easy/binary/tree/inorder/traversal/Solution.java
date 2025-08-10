package easy.binary.tree.inorder.traversal;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderTraversalInner(root, result);
        return result;
    }

    public void inorderTraversalInner(TreeNode root, List<Integer> result) {
    if (root == null){
        return;
    }

        TreeNode left = root.left;
        TreeNode right = root.right;

        if (left == null && right == null){
            result.add(root.val);
            return;
        }

        if (left != null){
            inorderTraversalInner(left, result);
        }

        result.add(root.val);

        if (right != null){
            inorderTraversalInner(right, result);
        }
    }

    public static void main(String[] args) {
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node3 = new TreeNode(3, node6, node7);
        TreeNode root = new TreeNode(1, node2, node3);

        System.out.println(new Solution().inorderTraversal(root));
    }

    public static void main1(String[] args) {
        TreeNode node3 = new TreeNode(3, null, null);
        TreeNode node2 = new TreeNode(2, node3, null);
        TreeNode node1 = new TreeNode(1, null, node2);

        System.out.println(new Solution().inorderTraversal(node1));
    }

}

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