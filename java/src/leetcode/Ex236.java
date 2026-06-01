package leetcode;

public class Ex236 {
    public static void main(String[] args) {
        Ex236 main = new Ex236();



    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == p || root == q || root == null){
            return root;
        }

        TreeNode left  = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(right != null && left != null){
            return root;
        }

        return right == null? left : right;
    }


}
