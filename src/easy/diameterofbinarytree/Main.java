package easy.diameterofbinarytree;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println();
    }


    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null){
            return 0;
        }

        internalDiameter(root);

        return result;
    }

    int result = 0;

    private int internalDiameter(TreeNode root){
        if (root == null){
            return 0;
        }

        int lheight = internalDiameter(root.left) ;
        int rheight = internalDiameter(root.right);

        result = Math.max(result, lheight + rheight);

        return 1 + Math.max(lheight, rheight);
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
