package easy.balancedbinarytree;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println();
    }
    boolean result = true;

    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;

        isBalancedInternal(root);

        return result;
    }


    private int isBalancedInternal(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int ldepth = isBalancedInternal(root.left);
        int rdepth = isBalancedInternal(root.right);

        if (Math.abs(ldepth - rdepth) > 1) {
            result = false;
        }
        return Math.max(ldepth, rdepth) + 1;
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
