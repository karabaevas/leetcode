package yandex.blind75;

public class Ex28 {
    public static void main(String[] args) {
        Ex28 main = new Ex28();



    }
//    https://leetcode.com/problems/same-tree/
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if(p != null && q != null && p.val == q.val){
            boolean ll = isSameTree(p.left, q.left);
            boolean lr = isSameTree(p.right, q.right);
            return ll && lr;
        } else {
            return false;
        }
    }


     public class TreeNode {
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

}
