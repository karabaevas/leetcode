package leetcode;

public class Ex236 {
    public static void main(String[] args) {
        Ex236 main = new Ex236();

    }

//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        if(root == p || root == q || root == null){
//            return root;
//        }
//
//        TreeNode left  = lowestCommonAncestor(root.left, p, q);
//        TreeNode right = lowestCommonAncestor(root.right, p, q);
//
//        if(right != null && left != null){
//            return root;
//        }
//
//        return right == null? left : right;
//    }

    /**
     * Найти ближайшего общего предка двух узлов дерева
     * Ограничение по памяти О(1)
     */

    record TreeNode(
            TreeNode parent,
            TreeNode left,
            TreeNode right
    ){}

    public TreeNode lowestCommonAncestor(TreeNode first, TreeNode second) {
        TreeNode f = first;
        TreeNode s = second;

        while(f != s){
            if(f == null){
                f = second;
            } else {
                f = f.parent;
            }

            if(s == null){
                s = first;
            } else {
                s = s.parent;
            }
        }

        return f;
    }
}
