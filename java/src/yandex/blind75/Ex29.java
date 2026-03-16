package yandex.blind75;

public class Ex29 {
    public static void main(String[] args) {
        Ex29 main = new Ex29();

    }


    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root ==null && subRoot==null)return true;
        if(root==null || subRoot==null)return false;
        boolean leftSub = isSubtree(root.left,subRoot);
        boolean rightSub = isSubtree(root.right,subRoot);

        return leftSub || rightSub|| isSameTree(root,subRoot);

    }
    public boolean isSameTree(TreeNode root1, TreeNode root2){
        if(root1==null && root2==null)return true;
        else if(root1==null || root2==null)return false;
        else{
            return root1.val==root2.val
                    && isSameTree(root1.left,root2.left)
                    && isSameTree(root1.right,root2.right);
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
