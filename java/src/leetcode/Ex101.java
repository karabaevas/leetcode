package leetcode;

public class Ex101 {
    public static void main(String[] args) {
        Ex101 main = new Ex101();



    }

    public boolean isSymmetric(TreeNode root) {
        return doCheck(root.left, root.right);
    }

    boolean doCheck(TreeNode left, TreeNode right){
        if((left == null || right == null)){
            return left == right;
        }

        if(left.val == right.val){
            return doCheck(left.left, right.right) && doCheck(left.right, right.left);
        } else {
            return false;
        }
    }


}
