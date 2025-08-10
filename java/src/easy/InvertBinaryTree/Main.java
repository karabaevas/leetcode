package easy.InvertBinaryTree;

public class Main {
    public static void main(String[] args) {
        System.out.println();
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null){
            return null;
        }
        goDeeper(root);
        return root;
    }

    private void goDeeper(TreeNode root) {
        TreeNode left = root.left;
        TreeNode right = root.right;

        root.right = left;
        root.left = right;

        if (root.left != null) {
            goDeeper(root.left);
        }
        if (root.right != null) {
            goDeeper(root.right);
        }
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
