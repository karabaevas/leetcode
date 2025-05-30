package easy.SameTree;

public class Main {
    public static void main(String[] args) {
        System.out.println();
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if ((p == null && q != null) || (p != null && q == null)) {
            return false;
        }
        if (p == null && q == null) {
            return true;
        }

        if (p.val != q.val) {
            return false;
        }

        if(isSameTree(p.left, q.left)){
            if(isSameTree(p.right, q.right)){
                return true;
            }
        }
        return false;
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

